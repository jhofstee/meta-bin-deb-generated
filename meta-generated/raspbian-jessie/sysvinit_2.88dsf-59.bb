PACKAGES = "initscripts sysv-rc sysvinit-utils"
PROVIDES = "initscripts sysv-rc sysvinit-utils"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/sysvinit/initscripts_2.88dsf-59_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/s/sysvinit/sysv-rc_2.88dsf-59_all.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/s/sysvinit/sysvinit-utils_2.88dsf-59_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_initscripts = "initscripts_2.88dsf-59_armhf.deb"
SRC_URI[deb0.sha256sum] = "f1ac482f9ca30c59b49f6448cd2efdbf720a416ee3ff1e0afcdae4ae04edc0b7"
SRC_URI[deb0.md5sum] = "cf038b431c690c98b82b0ebed37fef84"
DEBFILENAME_sysv-rc = "sysv-rc_2.88dsf-59_all.deb"
SRC_URI[deb1.sha256sum] = "da964cb1d9016ebbb65667b1ec743bbec06d817278d4038e15292ce554f835da"
SRC_URI[deb1.md5sum] = "0ed4ac245bbb6e0dbde36613151bc393"
DEBFILENAME_sysvinit-utils = "sysvinit-utils_2.88dsf-59_armhf.deb"
SRC_URI[deb2.sha256sum] = "ed4ed4a63f75f19f9085c669f03b541560fda3e2096f8bf7fa43cdf6dcf52ab9"
SRC_URI[deb2.md5sum] = "357131184439e7d7349cd9230655c3b0"

RDEPENDS_initscripts = "libc6 (>= 2.4) debianutils (>= 4) lsb-base (>= 3.2-14) sysvinit-utils (>= 2.88dsf-50) sysv-rc coreutils (>= 5.93)"
RDEPENDS_sysv-rc = "debconf (>= 0.5) sysvinit-utils (>= 2.86.ds1-62) insserv (>> 1.12.0-10) startpar"
RDEPENDS_${PN}-utils = "libc6 (>= 2.7) libselinux1 (>= 1.32) startpar"
DEPENDS = "debconf insserv lsb-base libselinux1 coreutils debianutils libc6 startpar"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_initscripts = " \
	./usr/share/lintian/overrides/initscripts \
	./lib/init/swap-functions.sh \
	./etc/init.d/reboot \
	./etc/default/tmpfs \
	./usr/share/doc/initscripts/copyright \
	./etc/init.d/halt \
	./etc/init.d/mountnfs.sh \
	./etc/init.d/checkfs.sh \
	./etc/init.d/mountkernfs.sh \
	./etc/init.d/urandom \
	./lib/init/vars.sh \
	./etc/init.d/skeleton \
	./etc/init.d/mountdevsubfs.sh \
	./etc/init.d/single \
	./etc/init.d/checkroot.sh \
	./lib/init/bootclean.sh \
	./etc/init.d/umountroot \
	./usr/share/doc/initscripts/changelog.gz \
	./usr/share/doc/initscripts/changelog.Debian.gz \
	./usr/share/man/man5/tmpfs.5.gz \
	./lib/init/mount-functions.sh \
	./usr/share/doc/initscripts/NEWS.Debian.gz \
	./etc/init.d/motd \
	./etc/init.d/rc.local \
	./etc/init.d/rmnologin \
	./usr/share/doc/initscripts/README.Debian \
	./etc/default/rcS \
	./bin/mountpoint \
	./etc/init.d/hostname.sh \
	./etc/init.d/mountnfs-bootclean.sh \
	./etc/default/devpts \
	./etc/init.d/killprocs \
	./etc/default/halt \
	./etc/init.d/mountall.sh \
	./usr/share/man/man5/halt.5.gz \
	./sbin/fsck.nfs \
	./etc/network/if-up.d/mountnfs \
	./lib/init/tmpfs.sh \
	./etc/init.d/bootlogs \
	./etc/init.d/umountfs \
	./usr/share/man/man1/mountpoint.1.gz \
	./usr/share/man/man5/rcS.5.gz \
	./etc/init.d/bootmisc.sh \
	./etc/init.d/sendsigs \
	./etc/init.d/checkroot-bootclean.sh \
	./etc/init.d/mountall-bootclean.sh \
	./etc/init.d/umountnfs.sh \
	./usr/share/man/man8/fsck.nfs.8.gz\
"
FILES_sysv-rc = " \
	./usr/sbin/invoke-rc.d \
	./etc/rcS.d/README \
	./etc/rc6.d/README \
	./usr/share/doc/sysv-rc/changelog.Debian.gz \
	./usr/share/lintian/overrides/sysv-rc \
	./etc/init.d/rcS \
	./etc/rc5.d/README \
	./etc/rc1.d/README \
	./usr/share/doc/sysv-rc/README.policy-rc.d.gz \
	./usr/share/doc/sysv-rc/NEWS.Debian.gz \
	./usr/share/man/man8/invoke-rc.d.8.gz \
	./etc/rc4.d/README \
	./usr/share/doc/sysv-rc/copyright \
	./etc/rc0.d/README \
	./usr/share/sysv-rc/saveconfig \
	./usr/sbin/update-rc.d \
	./etc/rc2.d/README \
	./usr/share/doc/sysv-rc/README.runlevels.gz \
	./usr/share/doc/sysv-rc/README.invoke-rc.d.gz \
	./usr/share/man/man8/update-rc.d.8.gz \
	./etc/init.d/README \
	./etc/rc3.d/README \
	./etc/init.d/rc \
	./usr/share/doc/sysv-rc/changelog.gz \
	./usr/share/doc/sysv-rc/README.Debian\
"
FILES_sysvinit-utils = " \
	./usr/share/doc/sysvinit-utils/changelog.Debian.gz \
	./usr/share/man/man8/pidof.8.gz \
	./usr/sbin/service \
	./bin/pidof \
	./usr/bin/mesg \
	./usr/share/man/man1/last.1.gz \
	./usr/bin/last \
	./usr/share/doc/sysvinit-utils/copyright \
	./usr/share/man/man5/init-d-script.5.gz \
	./usr/share/man/man1/mesg.1.gz \
	./usr/share/man/man8/fstab-decode.8.gz \
	./sbin/killall5 \
	./usr/share/man/man8/sulogin.8.gz \
	./usr/share/man/man1/lastb.1.gz \
	./usr/share/man/man8/killall5.8.gz \
	./usr/share/man/man8/service.8.gz \
	./sbin/fstab-decode \
	./usr/bin/lastb \
	./usr/share/doc/sysvinit-utils/changelog.gz \
	./sbin/sulogin \
	./lib/init/init-d-script \
	./usr/share/doc/sysvinit-utils/NEWS.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
