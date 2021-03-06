PACKAGES = "libfreetype6"
PROVIDES = "libfreetype6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/f/freetype/libfreetype6_2.4.9-1.1+deb7u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libfreetype6 = "libfreetype6_2.4.9-1.1+deb7u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "106a216d1bec1cc7dd5317658a19774a17916805f48d5790651e3ae8dae3fd99"
SRC_URI[deb0.md5sum] = "82b741132b325933be85d3aa60bb85c3"

RDEPENDS_lib${PN}6 = "libc6 (>= 2.13-28) zlib1g (>= 1:1.1.4)"
DEPENDS = "zlib1g libc6"


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
	./usr/share/doc/libfreetype6/changelog.Debian.gz \
	./usr/share/doc/libfreetype6/pcf/README \
	./usr/lib/arm-linux-gnueabihf/libfreetype.so.6.8.1 \
	./usr/share/doc/libfreetype6/copyright \
	./usr/share/doc/libfreetype6/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
