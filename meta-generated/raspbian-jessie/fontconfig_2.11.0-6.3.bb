PACKAGES = "fontconfig fontconfig-config libfontconfig1"
PROVIDES = "fontconfig fontconfig-config libfontconfig1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/fontconfig_2.11.0-6.3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/fontconfig-config_2.11.0-6.3_all.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/f/fontconfig/libfontconfig1_2.11.0-6.3_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_fontconfig = "fontconfig_2.11.0-6.3_armhf.deb"
SRC_URI[deb0.sha256sum] = "285aeab5664535a20dbc2e6b073f5ad2b8848f091540d11c4b97bb8caad4baa4"
SRC_URI[deb0.md5sum] = "93230239e94457ed87cea14257a5afce"
DEBFILENAME_fontconfig-config = "fontconfig-config_2.11.0-6.3_all.deb"
SRC_URI[deb1.sha256sum] = "aac3676ecc281890f83173258acc3178a84b305cd9e8b5fda4f8299cae793839"
SRC_URI[deb1.md5sum] = "cc16f18ebabc264e3c73d6a113d0a9e8"
DEBFILENAME_libfontconfig1 = "libfontconfig1_2.11.0-6.3_armhf.deb"
SRC_URI[deb2.sha256sum] = "6fd1cb41e8b86503b3c5da90b23b3684ce2cf6056d544ec41258ff5325495618"
SRC_URI[deb2.md5sum] = "624eb780a38c94fd8817767d35b7e916"

RDEPENDS_${PN} = "libc6 (>= 2.4) libfontconfig1 (>= 2.11) libfreetype6 (>= 2.2.1) fontconfig-config"
RDEPENDS_${PN}-config = "debconf (>= 0.5) ucf (>= 0.29) fonts-dejavu-core"
RDEPENDS_lib${PN}1 = "libc6 (>= 2.7) libexpat1 (>= 2.0.1) libfreetype6 (>= 2.2.1) fontconfig-config (>= 2.11.0-6.3)"
DEPENDS = "debconf libexpat1 ucf libfreetype6 libc6 fonts-dejavu-core"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/lintian/overrides/fontconfig \
	./usr/share/doc/fontconfig/AUTHORS \
	./usr/bin/fc-pattern \
	./usr/bin/fc-cache \
	./usr/share/man/man1/fc-cat.1.gz \
	./usr/share/doc-base/fontconfig-user \
	./usr/bin/fc-match \
	./usr/share/doc/fontconfig/changelog.gz \
	./usr/share/doc/fontconfig/fontconfig-user.txt.gz \
	./usr/share/man/man1/fc-list.1.gz \
	./usr/bin/fc-scan \
	./usr/bin/fc-list \
	./usr/share/doc/fontconfig/copyright \
	./usr/share/man/man1/fc-cache.1.gz \
	./usr/share/man/man1/fc-pattern.1.gz \
	./usr/share/doc/fontconfig/fontconfig-user.pdf.gz \
	./usr/bin/fc-validate \
	./usr/share/doc/fontconfig/README.gz \
	./usr/share/man/man1/fc-query.1.gz \
	./usr/share/doc/fontconfig/changelog.Debian.gz \
	./usr/share/doc/fontconfig/fontconfig-user.html \
	./usr/share/man/man1/fc-scan.1.gz \
	./usr/bin/fc-query \
	./usr/bin/fc-cat \
	./usr/share/man/man1/fc-validate.1.gz \
	./usr/share/doc/fontconfig/README.Debian \
	./usr/share/man/man1/fc-match.1.gz\
"
FILES_fontconfig-config = " \
	./etc/fonts/conf.d/50-user.conf \
	./usr/share/fontconfig/conf.avail/20-unhint-small-vera.conf \
	./etc/fonts/conf.d/30-urw-aliases.conf \
	./usr/share/fontconfig/conf.avail/10-sub-pixel-rgb.conf \
	./usr/share/doc/fontconfig-config/changelog.gz \
	./usr/share/fontconfig/conf.avail/70-yes-bitmaps.conf \
	./etc/fonts/conf.d/30-metric-aliases.conf \
	./usr/share/fontconfig/conf.avail/30-urw-aliases.conf \
	./usr/share/fontconfig/conf.avail/10-scale-bitmap-fonts.conf \
	./usr/share/fontconfig/conf.avail/10-autohint.conf \
	./etc/fonts/conf.d/11-lcdfilter-default.conf \
	./usr/share/fontconfig/conf.avail/10-sub-pixel-vbgr.conf \
	./usr/share/xml/fontconfig/fonts.dtd \
	./etc/fonts/fonts.conf \
	./usr/share/fontconfig/conf.avail/65-khmer.conf \
	./usr/share/fontconfig/conf.avail/10-sub-pixel-vrgb.conf \
	./etc/fonts/conf.d/51-local.conf \
	./etc/fonts/conf.d/90-synthetic.conf \
	./etc/fonts/conf.d/65-nonlatin.conf \
	./usr/share/fontconfig/conf.avail/40-nonlatin.conf \
	./usr/share/fontconfig/conf.avail/25-unhint-nonlatin.conf \
	./usr/share/man/man5/fonts-conf.5.gz \
	./usr/share/fontconfig/conf.avail/90-synthetic.conf \
	./etc/fonts/conf.d/65-fonts-persian.conf \
	./usr/share/fontconfig/conf.avail/11-lcdfilter-light.conf \
	./etc/fonts/conf.d/README \
	./usr/share/fontconfig/conf.avail/80-delicious.conf \
	./etc/fonts/conf.d/49-sansserif.conf \
	./usr/share/fontconfig/conf.avail/11-lcdfilter-legacy.conf \
	./etc/fonts/conf.d/60-latin.conf \
	./usr/share/doc/fontconfig-config/copyright \
	./usr/share/fontconfig/conf.avail/10-unhinted.conf \
	./etc/fonts/conf.d/45-latin.conf \
	./etc/fonts/conf.d/10-scale-bitmap-fonts.conf \
	./usr/share/fontconfig/conf.avail/10-sub-pixel-bgr.conf \
	./usr/share/doc/fontconfig-config/AUTHORS \
	./usr/share/fontconfig/conf.avail/11-lcdfilter-default.conf \
	./usr/share/fontconfig/conf.avail/70-no-bitmaps.conf \
	./etc/fonts/conf.d/20-unhint-small-vera.conf \
	./usr/share/fontconfig/conf.avail/10-no-sub-pixel.conf \
	./etc/fonts/conf.d/69-unifont.conf \
	./usr/share/fontconfig/conf.avail/30-metric-aliases.conf \
	./etc/fonts/conf.d/80-delicious.conf \
	./usr/share/fontconfig/conf.avail/51-local.conf \
	./usr/share/fontconfig/conf.avail/45-latin.conf \
	./usr/share/fontconfig/conf.avail/65-fonts-persian.conf \
	./usr/share/doc/fontconfig-config/README.gz \
	./usr/share/fontconfig/conf.avail/70-force-bitmaps.conf \
	./usr/share/fontconfig/conf.avail/49-sansserif.conf \
	./usr/share/fontconfig/conf.avail/69-unifont.conf \
	./usr/share/doc/fontconfig-config/changelog.Debian.gz \
	./usr/share/fontconfig/conf.avail/50-user.conf \
	./usr/share/fontconfig/conf.avail/60-latin.conf \
	./usr/share/fontconfig/conf.avail/65-nonlatin.conf \
	./etc/fonts/conf.d/40-nonlatin.conf\
"
FILES_libfontconfig1 = " \
	./usr/lib/arm-linux-gnueabihf/libfontconfig.so.1 \
	./usr/share/doc/libfontconfig1/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libfontconfig.so.1.8.0 \
	./usr/share/doc/libfontconfig1/AUTHORS \
	./usr/share/doc/libfontconfig1/README.gz \
	./usr/share/doc/libfontconfig1/copyright \
	./usr/share/doc/libfontconfig1/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
