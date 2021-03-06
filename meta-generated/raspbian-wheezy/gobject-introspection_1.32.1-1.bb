PACKAGES = "gir1.2-freedesktop gir1.2-glib-2.0 libgirepository-1.0-1"
PROVIDES = "gir1.2-freedesktop gir1.2-glib-2.0 libgirepository-1.0-1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/gobject-introspection/gir1.2-freedesktop_1.32.1-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/gobject-introspection/gir1.2-glib-2.0_1.32.1-1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/gobject-introspection/libgirepository-1.0-1_1.32.1-1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_gir1.2-freedesktop = "gir1.2-freedesktop_1.32.1-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "9429d0e51c5246c45e634bd857c9a23a9d59f2f4bb4412aaba3ce08ac6466189"
SRC_URI[deb0.md5sum] = "73863c5d25a8347527ee6038c499f155"
DEBFILENAME_gir1.2-glib-2.0 = "gir1.2-glib-2.0_1.32.1-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "23c25633f2964547f1db4ee2af74cc454f4b5371cdf700b5461095dcfbd8cf94"
SRC_URI[deb1.md5sum] = "b4a9c8f459eee272808b817ec1ea764f"
DEBFILENAME_libgirepository-1.0-1 = "libgirepository-1.0-1_1.32.1-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "694eac30ef6d9b90e01769911cc787c7088892c94c206e207f5ee2313298cf0f"
SRC_URI[deb2.md5sum] = "4168ccb334f1abf689cacc97a4217a66"

RDEPENDS_gir1.2-freedesktop = "gir1.2-glib-2.0 (= 1.32.1-1) libcairo-gobject2 (>= 1.10.0)"
RDEPENDS_gir1.2-glib-2.0 = "libgirepository-1.0-1 (>= 1.32.1) libglib2.0-0 (>= 2.31.22)"
RDEPENDS_libgirepository-1.0-1 = "libc6 (>= 2.13-28) libffi5 (>= 3.0.9) libgcc1 (>= 1:4.4.0) libglib2.0-0 (>= 2.31.8)"
DEPENDS = "libglib2.0-0 libgcc1 libffi5 libc6 libcairo-gobject2"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_gir1.2-freedesktop = " \
	./usr/lib/girepository-1.0/GL-1.0.typelib \
	./usr/share/doc/gir1.2-freedesktop/copyright \
	./usr/lib/girepository-1.0/fontconfig-2.0.typelib \
	./usr/lib/girepository-1.0/xft-2.0.typelib \
	./usr/lib/girepository-1.0/libxml2-2.0.typelib \
	./usr/lib/girepository-1.0/DBus-1.0.typelib \
	./usr/share/doc/gir1.2-freedesktop/TODO \
	./usr/share/doc/gir1.2-freedesktop/AUTHORS \
	./usr/lib/girepository-1.0/xlib-2.0.typelib \
	./usr/share/doc/gir1.2-freedesktop/changelog.Debian.gz \
	./usr/lib/girepository-1.0/DBusGLib-1.0.typelib \
	./usr/lib/girepository-1.0/cairo-1.0.typelib \
	./usr/lib/girepository-1.0/freetype2-2.0.typelib \
	./usr/lib/girepository-1.0/xfixes-4.0.typelib \
	./usr/lib/girepository-1.0/xrandr-1.3.typelib \
	./usr/share/doc/gir1.2-freedesktop/README \
	./usr/share/doc/gir1.2-freedesktop/NEWS.gz\
"
FILES_gir1.2-glib-2.0 = " \
	./usr/lib/girepository-1.0/GObject-2.0.typelib \
	./usr/share/doc/gir1.2-glib-2.0/changelog.Debian.gz \
	./usr/share/doc/gir1.2-glib-2.0/NEWS.gz \
	./usr/share/doc/gir1.2-glib-2.0/AUTHORS \
	./usr/lib/girepository-1.0/Gio-2.0.typelib \
	./usr/share/doc/gir1.2-glib-2.0/TODO \
	./usr/lib/girepository-1.0/GModule-2.0.typelib \
	./usr/lib/girepository-1.0/GIRepository-2.0.typelib \
	./usr/share/doc/gir1.2-glib-2.0/README \
	./usr/lib/girepository-1.0/GLib-2.0.typelib \
	./usr/share/doc/gir1.2-glib-2.0/copyright\
"
FILES_libgirepository-1.0-1 = " \
	./usr/share/doc/libgirepository-1.0-1/copyright \
	./usr/share/doc/libgirepository-1.0-1/AUTHORS \
	./usr/lib/libgirepository-1.0.so.1 \
	./usr/share/doc/libgirepository-1.0-1/README \
	./usr/share/doc/libgirepository-1.0-1/changelog.Debian.gz \
	./usr/share/doc/libgirepository-1.0-1/NEWS.gz \
	./usr/lib/libgirepository-1.0.so.1.0.0 \
	./usr/share/doc/libgirepository-1.0-1/TODO\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
