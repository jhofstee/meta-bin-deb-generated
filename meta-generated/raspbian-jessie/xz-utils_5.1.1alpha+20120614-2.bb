PACKAGES = "liblzma5"
PROVIDES = "liblzma5"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/x/xz-utils/liblzma5_5.1.1alpha+20120614-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_liblzma5 = "liblzma5_5.1.1alpha+20120614-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "21bf5b0232f618c7553520c8d8f59d164296c8079565fcfd9bee547b251c1349"
SRC_URI[deb0.md5sum] = "00a4e386011c00c30355b89f3b717ae4"

RDEPENDS_liblzma5 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_liblzma5 = " \
	./usr/share/doc/liblzma5/changelog.gz \
	./usr/share/doc/liblzma5/NEWS.gz \
	./lib/arm-linux-gnueabihf/liblzma.so.5 \
	./usr/share/doc/liblzma5/changelog.Debian.gz \
	./usr/share/doc/liblzma5/THANKS \
	./usr/share/doc/liblzma5/copyright \
	./lib/arm-linux-gnueabihf/liblzma.so.5.0.0 \
	./usr/share/doc/liblzma5/AUTHORS\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
