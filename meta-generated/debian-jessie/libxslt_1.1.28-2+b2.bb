PACKAGES = "libxslt1.1"
PROVIDES = "libxslt1.1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxslt/libxslt1.1_1.1.28-2+b2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxslt1.1 = "libxslt1.1_1.1.28-2+b2_armhf.deb"
SRC_URI[deb0.sha256sum] = "c42e90b1b29d9f80e4f32ba60a3d3b5c513f360a99011686a8647722591e163e"
SRC_URI[deb0.md5sum] = "88b35fff88e28512cf058f5bfe5d3fe1"

RDEPENDS_${PN}1.1 = "libc6 (>= 2.17) libgcrypt20 (>= 1.6.0) libxml2 (>= 2.9.0)"
DEPENDS = "libxml2 libgcrypt20 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxslt1.1 = " \
	./usr/share/doc/libxslt1.1/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libxslt.so.1 \
	./usr/share/doc/libxslt1.1/changelog.Debian.gz \
	./usr/share/doc/libxslt1.1/TODO.Debian \
	./usr/lib/arm-linux-gnueabihf/libexslt.so.0 \
	./usr/share/doc/libxslt1.1/README \
	./usr/lib/arm-linux-gnueabihf/libxslt.so.1.1.28 \
	./usr/share/doc/libxslt1.1/README.Debian \
	./usr/share/doc/libxslt1.1/AUTHORS \
	./usr/share/lintian/overrides/libxslt1.1 \
	./usr/share/doc/libxslt1.1/NEWS.gz \
	./usr/share/doc/libxslt1.1/TODO \
	./usr/share/doc/libxslt1.1/FEATURES.gz \
	./usr/lib/arm-linux-gnueabihf/libexslt.so.0.8.17 \
	./usr/share/doc/libxslt1.1/changelog.Debian.armhf.gz \
	./usr/share/doc/libxslt1.1/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
