PACKAGES = "shared-mime-info"
PROVIDES = "shared-mime-info"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/shared-mime-info/shared-mime-info_1.3-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_shared-mime-info = "shared-mime-info_1.3-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "307deb0057f0c1e0a670c9edf1e0c75a888246fa3e23d202c6f986cdf36e4cd3"
SRC_URI[deb0.md5sum] = "bad10765e53541856ac2ee8c3324b4e2"

RDEPENDS_${PN} = "libc6 (>= 2.4) libglib2.0-0 (>= 2.35.9) libxml2 (>= 2.7.4)"
DEPENDS = "libglib2.0-0 libxml2 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/shared-mime-info/shared-mime-info-spec.xml.gz \
	./usr/share/locale/da/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/lt/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/sr@latin/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/doc/shared-mime-info/shared-mime-info-spec.html/b518.html \
	./usr/share/locale/ka/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/zh_CN/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/sk/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/doc/shared-mime-info/changelog.gz \
	./usr/share/locale/bn_IN/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/ca/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/ko/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/nl/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/hu/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/nn/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/id/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/te/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/ca@valencia/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/doc/shared-mime-info/shared-mime-info-spec.html/x34.html \
	./usr/share/locale/it/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/nb/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/he/LC_MESSAGES/shared-mime-info.mo \
	./usr/bin/update-mime-database \
	./usr/share/locale/pl/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/ru/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/zh_TW/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/ia/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/de/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/wa/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/el/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/sl/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/fr/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/ga/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/tr/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/sv/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/doc-base/shared-mime-info \
	./usr/share/locale/uk/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/fo/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/kk/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/be@latin/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/hr/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/doc/shared-mime-info/README \
	./usr/share/doc/shared-mime-info/NEWS.gz \
	./usr/share/locale/sr/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/bg/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/cy/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/mime/packages/freedesktop.org.xml \
	./usr/share/doc/shared-mime-info/shared-mime-info-spec.pdf \
	./usr/share/locale/cs/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/sq/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/doc/shared-mime-info/shared-mime-info-spec.html/index.html \
	./usr/share/locale/ar/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/eu/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/fa_IR/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/rw/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/ja/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/doc/shared-mime-info/shared-mime-info-spec.html/x497.html \
	./usr/share/locale/pa/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/eo/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/pt_BR/LC_MESSAGES/shared-mime-info.mo \
	./usr/bin/update-mime-database.real \
	./usr/share/locale/gl/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/man/man1/update-mime-database.1.gz \
	./usr/share/locale/fi/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/zh_HK/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/en_GB/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/hi/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/lv/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/fa/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/ro/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/es/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/bg_BG/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/vi/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/doc/shared-mime-info/copyright \
	./usr/share/locale/ms/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/doc/shared-mime-info/changelog.Debian.gz \
	./usr/share/pkgconfig/shared-mime-info.pc \
	./usr/share/locale/pt/LC_MESSAGES/shared-mime-info.mo \
	./usr/share/locale/az/LC_MESSAGES/shared-mime-info.mo\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
