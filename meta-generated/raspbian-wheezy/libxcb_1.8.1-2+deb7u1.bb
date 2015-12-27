PACKAGES = "libxcb1 libxcb1-dev"
PROVIDES = "libxcb1 libxcb1-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb1_1.8.1-2+deb7u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxcb/libxcb1-dev_1.8.1-2+deb7u1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxcb1 = "libxcb1_1.8.1-2+deb7u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "e4ca0f79043cf26653b745d9448a5b9e9a271112916393256b35235f042909c1"
SRC_URI[deb0.md5sum] = "8dd6d8005c09ad8bb8a7c8317a5ac244"
DEBFILENAME_libxcb1-dev = "libxcb1-dev_1.8.1-2+deb7u1_armhf.deb"
SRC_URI[deb1.sha256sum] = "929c234f1e78e2ad46a4fb9f3043cd9b19ecd91c8226f2a00031035eaf34075d"
SRC_URI[deb1.md5sum] = "53128df5528372fd9fdbd196d7364686"

RDEPENDS_${PN}1 = "libc6 (>= 2.13-28) libxau6 libxdmcp6"
RDEPENDS_${PN}1-dev = "libxcb1 (= 1.8.1-2+deb7u1) libpthread-stubs0-dev libxau-dev (>= 1:1.0.0-1) libxdmcp-dev (>= 1:1.0.0-1)"
DEPENDS = "libxau-dev libxdmcp6 libc6 libxau6 libpthread-stubs0-dev libxdmcp-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxcb1 = " \
	./usr/share/doc/libxcb1/copyright \
	./usr/share/doc/libxcb1/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libxcb.so.1.1.0 \
	./usr/lib/arm-linux-gnueabihf/libxcb.so.1\
"
FILES_libxcb1-dev = " \
	./usr/share/doc/libxcb1-dev/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/xcb.pc \
	./usr/lib/arm-linux-gnueabihf/libxcb.so \
	./usr/include/xcb/xproto.h \
	./usr/share/doc/libxcb1-dev/copyright \
	./usr/include/xcb/xc_misc.h \
	./usr/include/xcb/xcb.h \
	./usr/include/xcb/xcbext.h \
	./usr/include/xcb/bigreq.h \
	./usr/lib/arm-linux-gnueabihf/libxcb.a\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
