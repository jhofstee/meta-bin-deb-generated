PACKAGES = "passwd"
PROVIDES = "passwd"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/shadow/passwd_4.1.5.1-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_passwd = "passwd_4.1.5.1-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "80a3f811ff90bea6e91c0492310787038b657ad3121bc70520d29724ff908786"
SRC_URI[deb0.md5sum] = "b146633c70c2c7b9931c5a9348a69733"

RDEPENDS_passwd = "libc6 (>= 2.13-28) libpam0g (>= 0.99.7.1) libselinux1 (>= 1.32) libsemanage1 (>= 2.0.3) libpam-modules debianutils (>= 2.15.2)"
DEPENDS = "libpam-modules libsemanage1 libc6 debianutils libselinux1 libpam0g"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_passwd = " \
	./usr/share/man/ru/man8/groupadd.8.gz \
	./usr/sbin/groupmod \
	./usr/share/man/ja/man1/chfn.1.gz \
	./usr/share/man/it/man1/expiry.1.gz \
	./usr/share/man/fr/man8/shadowconfig.8.gz \
	./usr/share/man/it/man5/shadow.5.gz \
	./usr/share/man/ja/man8/grpck.8.gz \
	./usr/share/man/sv/man1/expiry.1.gz \
	./usr/share/man/hu/man1/gpasswd.1.gz \
	./usr/share/man/fr/man8/pwck.8.gz \
	./usr/sbin/userdel \
	./usr/share/man/fi/man1/chfn.1.gz \
	./usr/share/man/fr/man8/grpunconv.8.gz \
	./usr/share/man/ru/man8/pwunconv.8.gz \
	./usr/share/man/zh_TW/man8/groupadd.8.gz \
	./usr/bin/chage \
	./usr/share/doc/passwd/TODO.gz \
	./usr/share/man/ja/man5/passwd.5.gz \
	./usr/share/man/man8/grpunconv.8.gz \
	./usr/share/man/ru/man8/userdel.8.gz \
	./usr/share/man/tr/man8/groupdel.8.gz \
	./usr/share/man/ru/man1/chfn.1.gz \
	./usr/share/man/de/man1/chfn.1.gz \
	./usr/share/man/zh_TW/man8/chpasswd.8.gz \
	./usr/share/man/hu/man1/chsh.1.gz \
	./usr/share/man/it/man5/gshadow.5.gz \
	./usr/share/man/man5/gshadow.5.gz \
	./usr/share/man/man8/useradd.8.gz \
	./usr/share/man/de/man1/chsh.1.gz \
	./usr/share/man/it/man5/passwd.5.gz \
	./sbin/shadowconfig \
	./usr/share/man/de/man8/useradd.8.gz \
	./usr/share/man/ru/man1/chsh.1.gz \
	./usr/share/man/sv/man1/chage.1.gz \
	./usr/share/man/fr/man8/pwconv.8.gz \
	./usr/share/lintian/overrides/passwd \
	./usr/share/man/tr/man8/useradd.8.gz \
	./etc/default/useradd \
	./usr/share/man/man1/chage.1.gz \
	./usr/share/man/fr/man8/vigr.8.gz \
	./usr/sbin/vipw \
	./usr/share/man/hu/man5/passwd.5.gz \
	./usr/share/man/zh_CN/man8/chpasswd.8.gz \
	./usr/share/man/zh_CN/man1/chsh.1.gz \
	./usr/share/man/sv/man8/groupdel.8.gz \
	./usr/share/man/ru/man8/chpasswd.8.gz \
	./usr/share/man/zh_TW/man8/usermod.8.gz \
	./usr/share/man/zh_TW/man8/useradd.8.gz \
	./usr/sbin/pwck \
	./usr/share/man/da/man8/groupdel.8.gz \
	./usr/share/doc/passwd/changelog.gz \
	./usr/share/man/zh_CN/man1/expiry.1.gz \
	./usr/share/doc/passwd/changelog.Debian.gz \
	./usr/share/man/man8/groupadd.8.gz \
	./usr/sbin/grpunconv \
	./usr/share/man/ru/man8/vigr.8.gz \
	./usr/share/man/fr/man8/usermod.8.gz \
	./usr/share/man/it/man8/grpconv.8.gz \
	./usr/share/man/fr/man1/chsh.1.gz \
	./usr/share/man/zh_CN/man8/newusers.8.gz \
	./usr/share/man/sv/man5/gshadow.5.gz \
	./usr/share/man/pt_BR/man5/passwd.5.gz \
	./usr/share/man/pl/man8/usermod.8.gz \
	./usr/share/man/ja/man8/vipw.8.gz \
	./usr/share/man/it/man1/passwd.1.gz \
	./usr/share/man/ja/man8/grpconv.8.gz \
	./usr/share/man/ja/man8/chpasswd.8.gz \
	./usr/share/man/man1/chfn.1.gz \
	./usr/share/man/da/man1/chfn.1.gz \
	./usr/share/man/de/man8/usermod.8.gz \
	./usr/share/doc/passwd/examples/passwd.expire.cron \
	./usr/sbin/useradd \
	./usr/share/man/ru/man8/pwck.8.gz \
	./usr/share/man/fr/man8/groupmod.8.gz \
	./usr/share/man/ja/man1/chsh.1.gz \
	./etc/pam.d/chpasswd \
	./usr/share/man/zh_TW/man8/groupmod.8.gz \
	./usr/share/man/zh_CN/man5/passwd.5.gz \
	./usr/share/man/man8/grpck.8.gz \
	./usr/share/man/ja/man8/groupdel.8.gz \
	./usr/share/man/pl/man1/expiry.1.gz \
	./usr/share/man/ko/man8/vipw.8.gz \
	./usr/share/man/de/man8/grpunconv.8.gz \
	./usr/sbin/newusers \
	./usr/share/man/man8/chgpasswd.8.gz \
	./usr/share/man/ru/man8/groupdel.8.gz \
	./usr/share/man/zh_CN/man8/vipw.8.gz \
	./usr/share/man/ru/man1/expiry.1.gz \
	./usr/share/man/de/man8/grpck.8.gz \
	./usr/share/man/it/man1/chfn.1.gz \
	./usr/share/man/de/man8/pwunconv.8.gz \
	./usr/share/man/zh_CN/man8/grpconv.8.gz \
	./usr/share/man/fi/man1/chsh.1.gz \
	./usr/share/doc/passwd/README.Debian \
	./usr/share/man/tr/man1/chfn.1.gz \
	./usr/share/man/zh_CN/man5/shadow.5.gz \
	./usr/share/man/de/man1/chage.1.gz \
	./usr/share/man/ru/man5/gshadow.5.gz \
	./usr/share/man/de/man1/passwd.1.gz \
	./usr/share/man/tr/man8/groupadd.8.gz \
	./usr/share/man/it/man1/gpasswd.1.gz \
	./usr/share/man/it/man8/vigr.8.gz \
	./usr/share/man/ru/man8/pwconv.8.gz \
	./usr/share/man/cs/man8/vipw.8.gz \
	./usr/share/man/zh_TW/man1/chsh.1.gz \
	./usr/share/man/it/man1/chsh.1.gz \
	./usr/share/man/man8/pwunconv.8.gz \
	./usr/share/man/tr/man5/passwd.5.gz \
	./usr/sbin/groupdel \
	./usr/share/man/man8/grpconv.8.gz \
	./usr/share/man/de/man1/expiry.1.gz \
	./usr/share/doc/passwd/NEWS.gz \
	./usr/sbin/pwconv \
	./usr/share/man/de/man1/gpasswd.1.gz \
	./usr/share/man/cs/man1/gpasswd.1.gz \
	./usr/share/man/ja/man8/newusers.8.gz \
	./usr/share/man/sv/man8/pwck.8.gz \
	./usr/share/man/de/man8/groupdel.8.gz \
	./usr/share/doc/passwd/NEWS.Debian.gz \
	./usr/share/man/it/man8/chpasswd.8.gz \
	./usr/share/man/sv/man8/userdel.8.gz \
	./usr/share/man/fr/man8/newusers.8.gz \
	./usr/share/man/man1/chsh.1.gz \
	./usr/share/man/ko/man1/chfn.1.gz \
	./usr/share/man/cs/man8/grpck.8.gz \
	./etc/pam.d/chsh \
	./usr/share/man/zh_TW/man1/chfn.1.gz \
	./usr/share/man/sv/man1/chsh.1.gz \
	./usr/share/man/de/man8/chpasswd.8.gz \
	./usr/share/man/da/man5/gshadow.5.gz \
	./usr/share/man/it/man8/groupdel.8.gz \
	./etc/pam.d/newusers \
	./usr/share/man/ja/man8/shadowconfig.8.gz \
	./usr/share/man/it/man8/useradd.8.gz \
	./usr/share/man/ru/man8/grpconv.8.gz \
	./usr/share/man/it/man8/pwconv.8.gz \
	./usr/share/man/man8/groupmod.8.gz \
	./usr/share/man/tr/man5/shadow.5.gz \
	./usr/share/man/ja/man1/chage.1.gz \
	./usr/share/man/de/man8/userdel.8.gz \
	./usr/share/man/tr/man8/userdel.8.gz \
	./usr/share/man/sv/man1/passwd.1.gz \
	./usr/share/man/it/man1/chage.1.gz \
	./usr/share/man/cs/man5/passwd.5.gz \
	./usr/share/man/fr/man1/passwd.1.gz \
	./usr/sbin/chgpasswd \
	./usr/share/man/fr/man8/groupadd.8.gz \
	./usr/share/man/fr/man8/useradd.8.gz \
	./usr/share/man/it/man8/pwck.8.gz \
	./usr/share/man/man8/cpgr.8.gz \
	./usr/share/man/man8/newusers.8.gz \
	./usr/share/man/fr/man1/gpasswd.1.gz \
	./usr/share/man/man1/passwd.1.gz \
	./usr/share/man/man8/chpasswd.8.gz \
	./usr/share/man/zh_TW/man5/passwd.5.gz \
	./usr/share/man/it/man8/usermod.8.gz \
	./usr/share/man/man5/passwd.5.gz \
	./usr/share/man/man8/pwck.8.gz \
	./usr/bin/expiry \
	./usr/share/man/ja/man8/pwunconv.8.gz \
	./usr/bin/gpasswd \
	./usr/share/man/zh_CN/man1/chfn.1.gz \
	./usr/share/man/fr/man8/chpasswd.8.gz \
	./usr/share/man/zh_TW/man8/userdel.8.gz \
	./usr/share/man/pl/man8/shadowconfig.8.gz \
	./usr/share/man/de/man8/groupadd.8.gz \
	./usr/share/man/fr/man8/vipw.8.gz \
	./usr/share/man/man1/gpasswd.1.gz \
	./usr/share/man/ja/man8/vigr.8.gz \
	./usr/share/man/ko/man8/vigr.8.gz \
	./usr/share/man/zh_TW/man8/groupdel.8.gz \
	./usr/share/man/de/man8/pwck.8.gz \
	./usr/share/man/zh_CN/man1/chage.1.gz \
	./usr/share/man/fr/man8/userdel.8.gz \
	./usr/share/man/pt_BR/man5/shadow.5.gz \
	./usr/share/man/sv/man8/vipw.8.gz \
	./etc/pam.d/chfn \
	./usr/share/man/it/man8/grpck.8.gz \
	./usr/share/man/man8/vipw.8.gz \
	./usr/share/man/cs/man8/groupadd.8.gz \
	./usr/share/man/ru/man1/gpasswd.1.gz \
	./usr/share/man/ko/man1/chsh.1.gz \
	./usr/share/man/ja/man1/gpasswd.1.gz \
	./usr/share/man/ru/man8/vipw.8.gz \
	./usr/share/man/zh_CN/man8/pwconv.8.gz \
	./usr/share/man/ru/man8/newusers.8.gz \
	./usr/share/man/pt_BR/man1/gpasswd.1.gz \
	./usr/share/man/de/man8/newusers.8.gz \
	./usr/share/man/cs/man8/groupdel.8.gz \
	./usr/share/man/sv/man5/passwd.5.gz \
	./usr/share/man/man5/shadow.5.gz \
	./usr/share/man/ja/man8/usermod.8.gz \
	./usr/share/man/pl/man8/userdel.8.gz \
	./usr/share/man/da/man8/vipw.8.gz \
	./usr/share/man/fr/man8/groupdel.8.gz \
	./usr/sbin/cpgr \
	./usr/share/man/hu/man1/passwd.1.gz \
	./usr/share/man/ru/man1/chage.1.gz \
	./usr/share/man/ja/man1/passwd.1.gz \
	./usr/share/man/ja/man8/grpunconv.8.gz \
	./usr/share/man/zh_CN/man5/gshadow.5.gz \
	./usr/share/man/de/man5/passwd.5.gz \
	./usr/share/man/zh_CN/man8/groupmod.8.gz \
	./usr/share/man/pl/man8/grpck.8.gz \
	./usr/share/man/ja/man8/pwconv.8.gz \
	./usr/share/man/tr/man8/groupmod.8.gz \
	./usr/bin/chfn \
	./usr/share/man/tr/man1/chage.1.gz \
	./usr/sbin/chpasswd \
	./usr/share/man/ru/man8/groupmod.8.gz \
	./usr/share/man/cs/man1/expiry.1.gz \
	./usr/share/man/it/man8/grpunconv.8.gz \
	./usr/share/man/pt_BR/man8/groupmod.8.gz \
	./usr/share/man/fr/man5/gshadow.5.gz \
	./usr/share/man/de/man8/vigr.8.gz \
	./usr/share/man/ru/man8/useradd.8.gz \
	./usr/share/man/pt_BR/man8/groupadd.8.gz \
	./usr/share/man/id/man1/chsh.1.gz \
	./usr/share/man/cs/man5/shadow.5.gz \
	./usr/sbin/grpck \
	./usr/share/man/ja/man5/shadow.5.gz \
	./usr/sbin/usermod \
	./usr/share/man/fr/man5/passwd.5.gz \
	./usr/share/man/zh_CN/man1/passwd.1.gz \
	./usr/share/man/de/man8/grpconv.8.gz \
	./usr/share/man/ja/man8/useradd.8.gz \
	./usr/share/man/man8/vigr.8.gz \
	./etc/cron.daily/passwd \
	./usr/share/man/id/man8/useradd.8.gz \
	./etc/pam.d/passwd \
	./usr/share/man/sv/man8/groupadd.8.gz \
	./usr/share/man/zh_CN/man8/grpck.8.gz \
	./usr/share/man/zh_CN/man8/pwunconv.8.gz \
	./usr/share/man/pl/man8/groupdel.8.gz \
	./usr/share/man/pl/man1/chage.1.gz \
	./usr/share/man/zh_CN/man8/useradd.8.gz \
	./usr/share/man/ru/man5/shadow.5.gz \
	./usr/sbin/pwunconv \
	./usr/share/man/ru/man8/grpunconv.8.gz \
	./usr/share/man/it/man8/pwunconv.8.gz \
	./usr/share/man/ko/man5/passwd.5.gz \
	./usr/share/man/da/man8/vigr.8.gz \
	./usr/share/man/de/man5/gshadow.5.gz \
	./usr/share/man/ja/man1/expiry.1.gz \
	./usr/share/man/ru/man8/usermod.8.gz \
	./usr/sbin/grpconv \
	./usr/share/man/de/man8/pwconv.8.gz \
	./usr/share/man/man8/usermod.8.gz \
	./usr/share/man/it/man8/userdel.8.gz \
	./usr/share/man/zh_CN/man8/groupadd.8.gz \
	./usr/share/man/de/man8/vipw.8.gz \
	./usr/share/man/zh_CN/man8/vigr.8.gz \
	./usr/share/doc/passwd/copyright \
	./usr/share/man/pt_BR/man8/groupdel.8.gz \
	./usr/share/man/tr/man8/usermod.8.gz \
	./usr/share/man/man8/pwconv.8.gz \
	./usr/share/man/man8/groupdel.8.gz \
	./usr/share/man/fr/man5/shadow.5.gz \
	./usr/share/man/fr/man1/chage.1.gz \
	./usr/share/man/zh_CN/man8/pwck.8.gz \
	./usr/share/man/pl/man8/groupmod.8.gz \
	./usr/share/man/ru/man8/grpck.8.gz \
	./usr/share/man/zh_CN/man8/groupdel.8.gz \
	./usr/share/man/zh_CN/man8/usermod.8.gz \
	./usr/share/man/de/man5/shadow.5.gz \
	./usr/share/man/pl/man1/chsh.1.gz \
	./usr/share/man/man8/userdel.8.gz \
	./usr/share/man/zh_CN/man8/grpunconv.8.gz \
	./usr/share/man/ja/man8/groupadd.8.gz \
	./usr/share/man/ja/man8/pwck.8.gz \
	./usr/share/man/it/man8/vipw.8.gz \
	./usr/share/man/fr/man8/pwunconv.8.gz \
	./usr/share/man/ru/man5/passwd.5.gz \
	./usr/sbin/cppw \
	./usr/share/man/fr/man8/grpck.8.gz \
	./usr/share/man/it/man8/groupadd.8.gz \
	./usr/share/man/sv/man8/vigr.8.gz \
	./usr/share/man/man1/expiry.1.gz \
	./usr/share/man/sv/man8/grpck.8.gz \
	./usr/sbin/groupadd \
	./usr/share/man/ja/man8/groupmod.8.gz \
	./usr/share/man/pl/man8/groupadd.8.gz \
	./usr/share/man/man8/cppw.8.gz \
	./usr/share/man/fr/man8/grpconv.8.gz \
	./usr/share/man/man8/shadowconfig.8.gz \
	./usr/share/man/pl/man8/vigr.8.gz \
	./usr/share/man/sv/man8/groupmod.8.gz \
	./usr/bin/chsh \
	./usr/share/man/cs/man5/gshadow.5.gz \
	./usr/share/man/cs/man8/groupmod.8.gz \
	./usr/share/man/fr/man1/chfn.1.gz \
	./usr/bin/passwd \
	./usr/share/man/it/man8/groupmod.8.gz \
	./usr/share/man/ru/man1/passwd.1.gz \
	./usr/share/man/pl/man8/vipw.8.gz \
	./usr/share/man/fr/man1/expiry.1.gz \
	./usr/share/man/it/man8/newusers.8.gz \
	./usr/share/man/zh_CN/man1/gpasswd.1.gz \
	./usr/sbin/vigr \
	./usr/share/man/tr/man1/passwd.1.gz \
	./usr/share/man/de/man8/groupmod.8.gz \
	./usr/share/doc/passwd/README \
	./usr/share/man/zh_CN/man8/userdel.8.gz \
	./usr/share/man/ja/man8/userdel.8.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
