PACKAGES = "gir1.2-gupnp-1.0 libgupnp-1.0-4 libgupnp-1.0-dev"
PROVIDES = "gir1.2-gupnp-1.0 libgupnp-1.0-4 libgupnp-1.0-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gupnp/gir1.2-gupnp-1.0_0.20.12-1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/g/gupnp/libgupnp-1.0-4_0.20.12-1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/g/gupnp/libgupnp-1.0-dev_0.20.12-1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-gupnp-1.0 = "gir1.2-gupnp-1.0_0.20.12-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "73b08be6a2aaabb38cbf6717fbbea68ac238c083a5928de23f499ca9cf9d22cf"
SRC_URI[deb0.md5sum] = "42453a4807dd8a0331ea27a316988915"
DEBFILENAME_libgupnp-1.0-4 = "libgupnp-1.0-4_0.20.12-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "be9132758383f418bd08a206f21a97dda038e9236513e6ec702cad8aaadd67b5"
SRC_URI[deb1.md5sum] = "20fe7182da56ca89a093ec79bdcbed18"
DEBFILENAME_libgupnp-1.0-dev = "libgupnp-1.0-dev_0.20.12-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "5280ef5618f091318f2b12a6723efd53c20e9fcd7f23dfbd92f04524cba61876"
SRC_URI[deb2.md5sum] = "429faee51ccb474cde71dcbb541cb100"

RDEPENDS_gir1.2-${PN}-1.0 = "gir1.2-freedesktop gir1.2-glib-2.0 gir1.2-gssdp-1.0 gir1.2-soup-2.4 libgupnp-1.0-4 (>= 0.20.12)"
RDEPENDS_lib${PN}-1.0-4 = "libc6 (>= 2.4) libglib2.0-0 (>= 2.37.3) libgssdp-1.0-3 (>= 0.14.0) libsoup2.4-1 (>= 2.34.0-1~) libuuid1 (>= 2.16) libxml2 (>= 2.7.4) shared-mime-info"
RDEPENDS_lib${PN}-1.0-dev = "libgupnp-1.0-4 (= 0.20.12-1) gir1.2-gupnp-1.0 (= 0.20.12-1) libgssdp-1.0-dev (>= 0.6.1) libsoup2.4-dev libxml2-dev uuid-dev"
DEPENDS = "libglib2.0-0 shared-mime-info libgssdp-1.0-dev libgssdp-1.0-3 gir1.2-gssdp-1.0 libxml2 gir1.2-glib-2.0 uuid-dev gir1.2-soup-2.4 libc6 gir1.2-freedesktop libsoup2.4-1 libsoup2.4-dev libuuid1 libxml2-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_gir1.2-gupnp-1.0 = " \
	./usr/share/doc/gir1.2-gupnp-1.0/NEWS.gz \
	./usr/share/doc/gir1.2-gupnp-1.0/changelog.Debian.gz \
	./usr/share/doc/gir1.2-gupnp-1.0/README \
	./usr/share/doc/gir1.2-gupnp-1.0/AUTHORS \
	./usr/lib/girepository-1.0/GUPnP-1.0.typelib \
	./usr/share/doc/gir1.2-gupnp-1.0/copyright\
"
FILES_libgupnp-1.0-4 = " \
	./usr/share/doc/libgupnp-1.0-4/changelog.Debian.gz \
	./usr/share/doc/libgupnp-1.0-4/README \
	./usr/share/doc/libgupnp-1.0-4/NEWS.gz \
	./usr/lib/libgupnp-1.0.so.4.0.0 \
	./usr/share/doc/libgupnp-1.0-4/AUTHORS \
	./usr/share/doc/libgupnp-1.0-4/copyright \
	./usr/lib/libgupnp-1.0.so.4\
"
FILES_libgupnp-1.0-dev = " \
	./usr/share/man/man1/gupnp-binding-tool.1.gz \
	./usr/include/gupnp-1.0/libgupnp/gupnp-service-introspection.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-xml-doc.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-error.h \
	./usr/lib/pkgconfig/gupnp-1.0.pc \
	./usr/share/doc/libgupnp-1.0-dev/examples/test-white-list.c.gz \
	./usr/share/doc/libgupnp-1.0-dev/NEWS.gz \
	./usr/bin/gupnp-binding-tool \
	./usr/share/doc/libgupnp-1.0-dev/examples/test-proxy.c.gz \
	./usr/include/gupnp-1.0/libgupnp/gupnp-device.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-device-proxy.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-context.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-device-info.h \
	./usr/share/gir-1.0/GUPnP-1.0.gir \
	./usr/include/gupnp-1.0/libgupnp/gupnp-root-device.h \
	./usr/share/doc/libgupnp-1.0-dev/examples/test-browsing.c.gz \
	./usr/include/gupnp-1.0/libgupnp/gupnp-acl.h \
	./usr/share/vala/vapi/gupnp-1.0.deps \
	./usr/share/doc/libgupnp-1.0-dev/examples/test-server.c.gz \
	./usr/share/doc/libgupnp-1.0-dev/changelog.Debian.gz \
	./usr/share/doc/libgupnp-1.0-dev/copyright \
	./usr/include/gupnp-1.0/libgupnp/gupnp-service.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-white-list.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-service-proxy.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-context-manager.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp-service-info.h \
	./usr/share/vala/vapi/gupnp-1.0.vapi \
	./usr/share/doc/libgupnp-1.0-dev/README \
	./usr/lib/libgupnp-1.0.a \
	./usr/include/gupnp-1.0/libgupnp/gupnp-control-point.h \
	./usr/share/doc/libgupnp-1.0-dev/AUTHORS \
	./usr/include/gupnp-1.0/libgupnp/gupnp-types.h \
	./usr/include/gupnp-1.0/libgupnp/gupnp.h \
	./usr/share/doc/libgupnp-1.0-dev/examples/test-introspection.c.gz \
	./usr/include/gupnp-1.0/libgupnp/gupnp-resource-factory.h \
	./usr/lib/libgupnp-1.0.so\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
