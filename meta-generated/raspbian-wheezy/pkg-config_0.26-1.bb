PACKAGES = "pkg-config"
PROVIDES = "pkg-config"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/p/pkg-config/pkg-config_0.26-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_pkg-config = "pkg-config_0.26-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "f334cb4a278221e615d8e29f163c3d78202254a9dcbf1008a0f7184b00d95ea5"
SRC_URI[deb0.md5sum] = "c5ab6f3f88476094e3eca391eb50c974"

RDEPENDS_${PN} = "libc6 (>= 2.4) libglib2.0-0 (>= 2.16.0) libpopt0 (>= 1.14)"
DEPENDS = "libglib2.0-0 libpopt0 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/bin/pkg-config \
	./usr/share/pkg-config-crosswrapper \
	./usr/share/doc/pkg-config/AUTHORS \
	./usr/share/aclocal/pkg.m4 \
	./usr/share/doc/pkg-config/copyright \
	./usr/share/man/man1/pkg-config.1.gz \
	./usr/share/doc/pkg-config/changelog.Debian.gz \
	./usr/share/doc/pkg-config/NEWS.gz \
	./usr/share/doc/pkg-config/changelog.gz \
	./usr/share/doc/pkg-config/README \
	./usr/share/doc/pkg-config/pkg-config-guide.html\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
