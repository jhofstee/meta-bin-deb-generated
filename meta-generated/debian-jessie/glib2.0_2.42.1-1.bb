PACKAGES = "libglib2.0-0"
PROVIDES = "libglib2.0-0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/glib2.0/libglib2.0-0_2.42.1-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libglib2.0-0 = "libglib2.0-0_2.42.1-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "d517502ed6b46ba8fd5b4939a993d784a3872cadb39a7554c7abe4c57dc49118"
SRC_URI[deb0.md5sum] = "42eb168f53e41e40f69f803a3284594a"

RDEPENDS_lib${PN}-0 = "libc6 (>= 2.17) libffi6 (>= 3.0.4) libpcre3 (>= 8.10) libselinux1 (>= 1.32) zlib1g (>= 1:1.2.2)"
DEPENDS = "libselinux1 libffi6 libpcre3 zlib1g libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libglib2.0-0 = " \
	./usr/share/doc/libglib2.0-0/AUTHORS \
	./usr/share/doc/libglib2.0-0/changelog.Debian.gz \
	./usr/share/doc/libglib2.0-0/copyright \
	./usr/lib/arm-linux-gnueabihf/libgthread-2.0.so.0.4200.1 \
	./usr/lib/arm-linux-gnueabihf/libgio-2.0.so.0.4200.1 \
	./usr/lib/arm-linux-gnueabihf/libgobject-2.0.so.0.4200.1 \
	./usr/share/doc/libglib2.0-0/NEWS.pre-1-3.gz \
	./usr/lib/arm-linux-gnueabihf/libgthread-2.0.so.0 \
	./usr/lib/arm-linux-gnueabihf/glib-2.0/glib-compile-resources \
	./usr/share/doc/libglib2.0-0/ChangeLog.pre-2-0.gz \
	./usr/share/doc/libglib2.0-0/ChangeLog.pre-2-2.gz \
	./usr/lib/arm-linux-gnueabihf/libgmodule-2.0.so.0 \
	./usr/lib/arm-linux-gnueabihf/glib-2.0/gio-querymodules \
	./usr/share/doc/libglib2.0-0/changelog.gz \
	./lib/arm-linux-gnueabihf/libglib-2.0.so.0.4200.1 \
	./lib/arm-linux-gnueabihf/libglib-2.0.so.0 \
	./usr/share/doc/libglib2.0-0/ChangeLog.pre-1-2.gz \
	./usr/lib/arm-linux-gnueabihf/libgmodule-2.0.so.0.4200.1 \
	./usr/lib/arm-linux-gnueabihf/libgobject-2.0.so.0 \
	./usr/lib/arm-linux-gnueabihf/libgio-2.0.so.0 \
	./usr/share/doc/libglib2.0-0/README.gz \
	./usr/share/doc/libglib2.0-0/NEWS.gz \
	./usr/lib/arm-linux-gnueabihf/glib-2.0/glib-compile-schemas \
	./usr/share/lintian/overrides/libglib2.0-0\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
