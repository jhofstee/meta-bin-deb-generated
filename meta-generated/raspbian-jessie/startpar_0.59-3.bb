PACKAGES = "startpar"
PROVIDES = "startpar"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/startpar/startpar_0.59-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_startpar = "startpar_0.59-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "0c188b607861ddd260f1c42b566679fc07a5b29f0e50ba21f8c070cad079ff9d"
SRC_URI[deb0.md5sum] = "38216b082c50ce733f4f5bd3f413b56e"

RDEPENDS_${PN} = "libc6 (>= 2.15)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./lib/startpar/startpar-upstart-inject \
	./usr/share/doc/startpar/copyright \
	./lib/startpar/startpar \
	./usr/share/man/man8/startpar-upstart-inject.8.gz \
	./usr/share/doc/startpar/changelog.Debian.gz \
	./usr/share/man/man8/startpar.8.gz \
	./etc/init/startpar-bridge.conf\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
