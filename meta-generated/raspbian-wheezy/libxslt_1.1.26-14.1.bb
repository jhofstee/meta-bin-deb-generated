PACKAGES = "libxslt1.1"
PROVIDES = "libxslt1.1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxslt/libxslt1.1_1.1.26-14.1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libxslt1.1 = "libxslt1.1_1.1.26-14.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "b111fb82568efe93d0087d9a9395bfeb0b514edd6a671c8cc2995135998d8fbc"
SRC_URI[deb0.md5sum] = "6c6467d2b5ef4337708e60dbe1aaab8c"

RDEPENDS_${PN}1.1 = "libc6 (>= 2.13-28) libgcrypt11 (>= 1.4.5) libxml2 (>= 2.7.4)"
DEPENDS = "libxml2 libgcrypt11 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libxslt1.1 = " \
	./usr/share/doc/libxslt1.1/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libxslt.so.1.1.26 \
	./usr/share/doc/libxslt1.1/changelog.Debian.gz \
	./usr/share/doc/libxslt1.1/README.Debian \
	./usr/lib/arm-linux-gnueabihf/libexslt.so.0.8.15 \
	./usr/lib/arm-linux-gnueabihf/libexslt.so.0 \
	./usr/share/doc/libxslt1.1/README \
	./usr/share/doc/libxslt1.1/TODO.Debian \
	./usr/share/lintian/overrides/libxslt1.1 \
	./usr/share/doc/libxslt1.1/NEWS.gz \
	./usr/share/doc/libxslt1.1/TODO \
	./usr/share/doc/libxslt1.1/FEATURES.gz \
	./usr/lib/arm-linux-gnueabihf/libxslt.so.1 \
	./usr/share/doc/libxslt1.1/AUTHORS \
	./usr/share/doc/libxslt1.1/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
