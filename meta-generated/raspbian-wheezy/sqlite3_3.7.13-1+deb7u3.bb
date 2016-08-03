PACKAGES = "libsqlite3-0"
PROVIDES = "libsqlite3-0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sqlite3/libsqlite3-0_3.7.13-1+deb7u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libsqlite3-0 = "libsqlite3-0_3.7.13-1+deb7u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "be49836562be1e8801bd247b9a7dfee234cb9e461c8c68720022506472c8d71c"
SRC_URI[deb0.md5sum] = "c305d00a7003878ee7e24f31d834266e"

RDEPENDS_lib${PN}-0 = "libc6 (>= 2.13-28) libgcc1 (>= 1:4.4.0)"
DEPENDS = "libgcc1 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libsqlite3-0 = " \
	./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0.8.6 \
	./usr/share/doc/libsqlite3-0/changelog.html.gz \
	./usr/share/doc/libsqlite3-0/README.Debian \
	./usr/lib/arm-linux-gnueabihf/libsqlite3.so.0 \
	./usr/share/doc/libsqlite3-0/copyright \
	./usr/share/doc/libsqlite3-0/changelog.gz \
	./usr/share/doc/libsqlite3-0/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
