PACKAGES = "libpng12-0"
PROVIDES = "libpng12-0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libp/libpng/libpng12-0_1.2.50-2+deb8u2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libpng12-0 = "libpng12-0_1.2.50-2+deb8u2_armhf.deb"
SRC_URI[deb0.sha256sum] = "dc7c2dafde31c1f743d1e181d128733fc93434e87b38c1758fc81a8a5a83751f"
SRC_URI[deb0.md5sum] = "1c89442504697629465888a43b121daa"

RDEPENDS_${PN}12-0 = "libc6 (>= 2.11) zlib1g (>= 1:1.1.4)"
DEPENDS = "zlib1g libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libpng12-0 = " \
	./usr/share/doc/libpng12-0/changelog.gz \
	./usr/share/doc/libpng12-0/changelog.Debian.gz \
	./usr/share/doc/libpng12-0/libpng-1.2.50.txt.gz \
	./usr/lib/arm-linux-gnueabihf/libpng12.so.0 \
	./usr/share/doc/libpng12-0/KNOWNBUG \
	./lib/arm-linux-gnueabihf/libpng12.so.0.50.0 \
	./usr/share/doc/libpng12-0/TODO \
	./usr/share/doc/libpng12-0/ANNOUNCE \
	./lib/arm-linux-gnueabihf/libpng12.so.0 \
	./usr/share/doc/libpng12-0/README.Debian \
	./usr/share/doc-base/libpng12 \
	./usr/share/doc/libpng12-0/README.gz \
	./usr/share/doc/libpng12-0/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
