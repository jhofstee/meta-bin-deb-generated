PACKAGES = "coreutils"
PROVIDES = "coreutils"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/c/coreutils/coreutils_8.23-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_coreutils = "coreutils_8.23-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "c5d59394e46d4cce22a1f7d0e889f1147957459d0e4b6c974516f846eefd90b5"
SRC_URI[deb0.md5sum] = "9cb2ff0c7e27a686e0c617c48e7202da"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/bin/arch \
	./usr/share/man/man1/install.1.gz \
	./usr/share/man/man1/ptx.1.gz \
	./bin/mktemp \
	./usr/bin/logname \
	./usr/share/man/man1/users.1.gz \
	./usr/share/doc/coreutils/AUTHORS \
	./usr/bin/cksum \
	./usr/share/man/man1/tail.1.gz \
	./usr/bin/shuf \
	./bin/chown \
	./usr/bin/pr \
	./usr/bin/tsort \
	./usr/share/man/man1/base64.1.gz \
	./usr/share/man/man1/nice.1.gz \
	./usr/bin/numfmt \
	./usr/share/man/man1/ln.1.gz \
	./usr/share/man/man1/fmt.1.gz \
	./usr/share/man/man1/printf.1.gz \
	./usr/share/locale/bg/LC_MESSAGES/coreutils.mo \
	./usr/share/man/man1/hostid.1.gz \
	./bin/chmod \
	./usr/share/doc/coreutils/changelog.Debian.gz \
	./usr/bin/seq \
	./usr/share/locale/hr/LC_MESSAGES/coreutils.mo \
	./usr/share/doc/coreutils/NEWS.gz \
	./usr/share/locale/de/LC_MESSAGES/coreutils.mo \
	./usr/share/locale/ko/LC_MESSAGES/coreutils.mo \
	./usr/bin/dirname \
	./usr/bin/sort \
	./usr/share/man/man1/nl.1.gz \
	./usr/bin/dircolors \
	./usr/share/locale/kk/LC_MESSAGES/coreutils.mo \
	./usr/share/locale/sl/LC_MESSAGES/coreutils.mo \
	./usr/share/man/man1/cp.1.gz \
	./usr/share/man/man1/chgrp.1.gz \
	./usr/share/man/man1/yes.1.gz \
	./bin/chgrp \
	./usr/bin/base64 \
	./usr/share/man/man1/md5sum.textutils.1.gz \
	./usr/share/man/man1/mkdir.1.gz \
	./usr/share/man/man1/pathchk.1.gz \
	./usr/share/man/man1/tee.1.gz \
	./usr/share/man/man1/comm.1.gz \
	./usr/share/man/man1/chown.1.gz \
	./usr/share/locale/lt/LC_MESSAGES/coreutils.mo \
	./usr/share/man/man1/sha384sum.1.gz \
	./usr/share/man/man1/sort.1.gz \
	./usr/share/man/man1/tr.1.gz \
	./usr/share/man/man1/csplit.1.gz \
	./usr/share/man/man1/sha1sum.1.gz \
	./usr/share/locale/sv/LC_MESSAGES/coreutils.mo \
	./usr/share/locale/gl/LC_MESSAGES/coreutils.mo \
	./usr/bin/basename \
	./usr/bin/split \
	./usr/share/man/man1/realpath.1.gz \
	./usr/share/locale/ia/LC_MESSAGES/coreutils.mo \
	./usr/share/locale/ro/LC_MESSAGES/coreutils.mo \
	./usr/bin/shred \
	./usr/share/locale/el/LC_MESSAGES/coreutils.mo \
	./usr/lib/coreutils/libstdbuf.so \
	./usr/share/man/man1/numfmt.1.gz \
	./usr/share/man/man1/expand.1.gz \
	./usr/bin/expr \
	./usr/share/man/man1/dd.1.gz \
	./usr/share/man/man1/pwd.1.gz \
	./usr/share/doc/coreutils/buildinfo_armhf.gz \
	./usr/bin/yes \
	./usr/bin/sha256sum \
	./usr/bin/stat \
	./usr/share/locale/fr/LC_MESSAGES/coreutils.mo \
	./usr/bin/id \
	./usr/share/man/man8/chroot.8.gz \
	./usr/share/man/man1/tty.1.gz \
	./usr/share/locale/id/LC_MESSAGES/coreutils.mo \
	./usr/share/man/man1/split.1.gz \
	./usr/bin/link \
	./usr/share/man/man1/uniq.1.gz \
	./usr/share/man/man1/fold.1.gz \
	./usr/share/locale/nl/LC_MESSAGES/coreutils.mo \
	./usr/share/locale/vi/LC_MESSAGES/coreutils.mo \
	./bin/cat \
	./usr/share/man/man1/sha512sum.1.gz \
	./usr/share/man/man1/touch.1.gz \
	./usr/share/doc/coreutils/changelog.gz \
	./usr/share/man/man1/mktemp.1.gz \
	./usr/share/locale/tr/LC_MESSAGES/coreutils.mo \
	./usr/share/man/man1/false.1.gz \
	./usr/bin/md5sum \
	./usr/bin/md5sum.textutils \
	./usr/share/man/man1/sleep.1.gz \
	./usr/bin/hostid \
	./usr/share/doc/coreutils/README.gz \
	./usr/share/locale/cs/LC_MESSAGES/coreutils.mo \
	./usr/share/man/man1/cut.1.gz \
	./usr/bin/touch \
	./usr/bin/truncate \
	./usr/bin/ptx \
	./usr/bin/mkfifo \
	./bin/readlink \
	./usr/share/man/man1/paste.1.gz \
	./bin/mknod \
	./bin/mkdir \
	./usr/share/man/man1/vdir.1.gz \
	./usr/bin/tail \
	./usr/bin/csplit \
	./usr/bin/uniq \
	./usr/share/locale/pt/LC_MESSAGES/coreutils.mo \
	./usr/bin/sum \
	./usr/bin/printf \
	./usr/share/locale/uk/LC_MESSAGES/coreutils.mo \
	./usr/bin/unexpand \
	./usr/bin/groups \
	./usr/share/man/man1/dir.1.gz \
	./usr/share/man/man1/shuf.1.gz \
	./usr/bin/fmt \
	./usr/share/man/man1/rmdir.1.gz \
	./bin/uname \
	./bin/rm \
	./usr/bin/sha224sum \
	./usr/bin/nproc \
	./usr/share/man/man1/tac.1.gz \
	./usr/share/doc/coreutils/THANKS.gz \
	./usr/share/man/man1/chmod.1.gz \
	./usr/bin/nice \
	./usr/bin/users \
	./usr/share/man/man1/uname.1.gz \
	./usr/share/locale/eu/LC_MESSAGES/coreutils.mo \
	./bin/touch \
	./usr/share/man/man1/df.1.gz \
	./usr/share/locale/af/LC_MESSAGES/coreutils.mo \
	./usr/share/man/man1/printenv.1.gz \
	./usr/share/man/man1/du.1.gz \
	./bin/false \
	./usr/share/locale/et/LC_MESSAGES/coreutils.mo \
	./usr/bin/install \
	./usr/share/man/man1/timeout.1.gz \
	./usr/bin/tr \
	./usr/bin/expand \
	./usr/share/locale/zh_CN/LC_MESSAGES/coreutils.mo \
	./usr/share/man/man1/seq.1.gz \
	./usr/share/man/man1/stdbuf.1.gz \
	./bin/echo \
	./usr/share/man/man1/who.1.gz \
	./usr/share/locale/nb/LC_MESSAGES/coreutils.mo \
	./usr/bin/env \
	./usr/share/man/man1/truncate.1.gz \
	./usr/share/locale/ms/LC_MESSAGES/coreutils.mo \
	./usr/bin/od \
	./usr/bin/runcon \
	./usr/share/man/man1/factor.1.gz \
	./usr/share/man/man1/expr.1.gz \
	./usr/share/man/man1/dircolors.1.gz \
	./bin/date \
	./usr/share/man/man1/chcon.1.gz \
	./bin/mv \
	./usr/share/man/man1/sync.1.gz \
	./usr/share/man/man1/dirname.1.gz \
	./usr/share/man/man1/ls.1.gz \
	./usr/share/man/man1/join.1.gz \
	./usr/share/man/man1/mkfifo.1.gz \
	./usr/share/man/man1/cat.1.gz \
	./bin/sleep \
	./usr/bin/wc \
	./usr/share/locale/eo/LC_MESSAGES/coreutils.mo \
	./usr/share/man/man1/sum.1.gz \
	./usr/share/locale/ca/LC_MESSAGES/coreutils.mo \
	./usr/bin/factor \
	./usr/share/man/man1/shred.1.gz \
	./usr/share/man/man1/cksum.1.gz \
	./usr/share/man/man1/link.1.gz \
	./usr/share/man/man1/sha256sum.1.gz \
	./usr/share/man/man1/[.1.gz \
	./usr/bin/nl \
	./usr/bin/[ \
	./usr/bin/realpath \
	./usr/share/locale/fi/LC_MESSAGES/coreutils.mo \
	./bin/pwd \
	./usr/share/locale/ja/LC_MESSAGES/coreutils.mo \
	./usr/share/man/man1/mknod.1.gz \
	./usr/share/man/man1/runcon.1.gz \
	./usr/share/locale/pt_BR/LC_MESSAGES/coreutils.mo \
	./usr/share/doc/coreutils/TODO.gz \
	./usr/bin/tty \
	./bin/dir \
	./usr/share/locale/be/LC_MESSAGES/coreutils.mo \
	./usr/share/doc/coreutils/copyright \
	./usr/share/man/man1/sha224sum.1.gz \
	./usr/bin/tee \
	./bin/stty \
	./usr/share/man/man1/nohup.1.gz \
	./usr/share/info/coreutils.info.gz \
	./usr/bin/join \
	./usr/share/man/man1/true.1.gz \
	./bin/vdir \
	./usr/share/man/man1/nproc.1.gz \
	./usr/share/man/man1/arch.1.gz \
	./usr/share/locale/zh_TW/LC_MESSAGES/coreutils.mo \
	./usr/share/man/man1/pinky.1.gz \
	./usr/share/locale/pl/LC_MESSAGES/coreutils.mo \
	./usr/bin/cut \
	./usr/share/locale/it/LC_MESSAGES/coreutils.mo \
	./usr/bin/pinky \
	./usr/share/doc/coreutils/NEWS.Debian.gz \
	./usr/bin/sha512sum \
	./usr/bin/sha384sum \
	./usr/bin/stdbuf \
	./usr/share/man/man1/unexpand.1.gz \
	./usr/share/locale/da/LC_MESSAGES/coreutils.mo \
	./usr/bin/tac \
	./usr/bin/test \
	./usr/share/man/man1/mv.1.gz \
	./usr/share/man/man1/tsort.1.gz \
	./usr/sbin/chroot \
	./usr/share/man/man1/md5sum.1.gz \
	./usr/share/man/man1/whoami.1.gz \
	./usr/bin/nohup \
	./usr/share/locale/hu/LC_MESSAGES/coreutils.mo \
	./usr/share/locale/sk/LC_MESSAGES/coreutils.mo \
	./usr/bin/comm \
	./usr/bin/head \
	./usr/share/man/man1/env.1.gz \
	./bin/rmdir \
	./usr/share/man/man1/stat.1.gz \
	./usr/share/locale/ga/LC_MESSAGES/coreutils.mo \
	./usr/bin/sha1sum \
	./usr/share/man/man1/rm.1.gz \
	./usr/bin/timeout \
	./bin/sync \
	./usr/share/man/man1/stty.1.gz \
	./bin/dd \
	./usr/share/locale/lg/LC_MESSAGES/coreutils.mo \
	./usr/share/man/man1/od.1.gz \
	./usr/share/man/man1/test.1.gz \
	./usr/bin/whoami \
	./usr/share/man/man1/logname.1.gz \
	./usr/share/man/man1/unlink.1.gz \
	./usr/bin/du \
	./usr/share/man/man1/echo.1.gz \
	./usr/share/man/man1/readlink.1.gz \
	./usr/bin/printenv \
	./usr/share/locale/es/LC_MESSAGES/coreutils.mo \
	./bin/true \
	./bin/cp \
	./usr/bin/unlink \
	./bin/ln \
	./usr/share/man/man1/groups.1.gz \
	./usr/share/man/man1/basename.1.gz \
	./usr/share/doc/coreutils/README.Debian \
	./usr/share/man/man1/wc.1.gz \
	./usr/bin/pathchk \
	./usr/share/locale/ru/LC_MESSAGES/coreutils.mo \
	./bin/df \
	./usr/share/man/man1/head.1.gz \
	./bin/ls \
	./usr/bin/fold \
	./usr/bin/who \
	./usr/bin/paste \
	./usr/share/man/man1/pr.1.gz \
	./usr/share/man/man1/id.1.gz \
	./usr/bin/chcon \
	./usr/share/man/man1/date.1.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
