PACKAGES = "mosquitto"
PROVIDES = "mosquitto"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/m/mosquitto/mosquitto_1.3.4-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_mosquitto = "mosquitto_1.3.4-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "fbffa1caa8f2763b6bb14bdfa83a407076a85d0751ed6eab1c493b7b7fb4e5b6"
SRC_URI[deb0.md5sum] = "cb4d15eee27dd79fd4a91a493f01ff9e"

RDEPENDS_${PN} = "libc6 (>= 2.4) libssl1.0.0 (>= 1.0.1) libwrap0 (>= 7.6-4~) adduser (>= 3.10) lsb-base (>= 4.1+Debian3) libuuid1"
DEPENDS = "libssl1.0.0 lsb-base adduser libwrap0 libc6 libuuid1"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/man/man1/mosquitto_passwd.1.gz \
	./etc/mosquitto/certs/README \
	./etc/logrotate.d/mosquitto \
	./usr/share/doc/mosquitto/examples/mosquitto.conf.gz \
	./etc/init.d/mosquitto \
	./usr/bin/mosquitto_passwd \
	./etc/init/mosquitto.conf \
	./usr/share/man/man8/mosquitto.8.gz \
	./etc/mosquitto/conf.d/README \
	./usr/share/doc/mosquitto/changelog.Debian.gz \
	./etc/mosquitto/mosquitto.conf \
	./usr/share/man/man7/mosquitto-tls.7.gz \
	./usr/share/doc/mosquitto/examples/pskfile.example \
	./etc/mosquitto/ca_certificates/README \
	./usr/share/doc/mosquitto/readme.txt \
	./usr/share/doc/mosquitto/changelog.gz \
	./usr/share/man/man5/mosquitto.conf.5.gz \
	./usr/share/doc/mosquitto/examples/aclfile.example \
	./usr/sbin/mosquitto \
	./usr/share/man/man7/mqtt.7.gz \
	./usr/share/doc/mosquitto/copyright \
	./usr/share/doc/mosquitto/examples/pwfile.example\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
