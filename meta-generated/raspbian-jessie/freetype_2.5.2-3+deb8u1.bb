PACKAGES = "libfreetype6"
PROVIDES = "libfreetype6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/f/freetype/libfreetype6_2.5.2-3+deb8u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libfreetype6 = "libfreetype6_2.5.2-3+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "29a25ab920b48ed16013974da61a51dd12550798498599ad071b95343f52b052"
SRC_URI[deb0.md5sum] = "7a1bff91575df30e2c64799b8c61282c"

RDEPENDS_lib${PN}6 = "libc6 (>= 2.11) libpng12-0 (>= 1.2.13-4) zlib1g (>= 1:1.1.4)"
DEPENDS = "zlib1g libpng12-0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libfreetype6 = " \
	./usr/lib/arm-linux-gnueabihf/libfreetype.so.6 \
	./usr/share/doc/libfreetype6/CHANGES.gz \
	./usr/share/doc/libfreetype6/TODO \
	./usr/share/doc/libfreetype6/ft2faq.html \
	./usr/share/doc/libfreetype6/FTL.TXT.gz \
	./usr/lib/arm-linux-gnueabihf/libfreetype.so.6.11.1 \
	./usr/share/doc/libfreetype6/changelog.Debian.gz \
	./usr/share/doc/libfreetype6/pcf/README \
	./usr/share/doc/libfreetype6/copyright \
	./usr/share/doc/libfreetype6/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
