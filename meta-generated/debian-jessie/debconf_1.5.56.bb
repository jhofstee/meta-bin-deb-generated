PACKAGES = "debconf"
PROVIDES = "debconf"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/debconf/debconf_1.5.56_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_debconf = "debconf_1.5.56_all.deb"
SRC_URI[deb0.sha256sum] = "bc773e0b34097ec23baeb08c48f66639a88c23815b0ca9903710c6cc2c8e9041"
SRC_URI[deb0.md5sum] = "bf11b982800b3a06a471e64987ff86a0"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/perl5/Debconf/Element/Gnome/Error.pm \
	./usr/share/man/man1/debconf-escape.1.gz \
	./usr/share/doc/debconf/README.Debian \
	./usr/share/perl5/Debconf/DbDriver/Stack.pm \
	./usr/share/debconf/confmodule.sh \
	./usr/share/perl5/Debconf/Element/Dialog/Select.pm \
	./usr/share/perl5/Debconf/Element/Dialog/Progress.pm \
	./usr/share/perl5/Debconf/Format/822.pm \
	./usr/share/perl5/Debconf/Element/Gnome/Text.pm \
	./usr/share/man/man1/debconf-communicate.1.gz \
	./usr/share/perl5/Debconf/Element/Teletype/Password.pm \
	./usr/share/man/man1/debconf-show.1.gz \
	./usr/share/perl5/Debconf/Element/Editor/Error.pm \
	./usr/share/debconf/debconf.conf \
	./usr/share/perl5/Debconf/Element/Kde/String.pm \
	./usr/share/debconf/fix_db.pl \
	./usr/share/perl5/Debconf/Element/Editor/Boolean.pm \
	./usr/share/perl5/Debconf/Element/Gnome/Progress.pm \
	./usr/share/perl5/Debconf/FrontEnd/ScreenSize.pm \
	./usr/share/perl5/Debconf/Element/Dialog/String.pm \
	./usr/bin/debconf-communicate \
	./usr/share/perl5/Debconf/Element/Gnome/Boolean.pm \
	./usr/share/perl5/Debconf/FrontEnd/Readline.pm \
	./usr/share/perl5/Debconf/FrontEnd/Editor.pm \
	./usr/share/perl5/Debconf/Template/Transient.pm \
	./usr/share/perl5/Debconf/Element.pm \
	./usr/share/perl5/Debconf/Element/Noninteractive/Note.pm \
	./usr/share/perl5/Debconf/Element/Editor/String.pm \
	./usr/share/perl5/Debconf/DbDriver.pm \
	./usr/share/perl5/Debconf/Element/Editor/Note.pm \
	./usr/share/perl5/Debconf/Element/Kde.pm \
	./usr/share/perl5/Debconf/Question.pm \
	./usr/share/perl5/Debconf/Element/Editor/Progress.pm \
	./usr/share/perl5/Debconf/DbDriver/File.pm \
	./usr/share/perl5/Debconf/FrontEnd.pm \
	./usr/bin/debconf-set-selections \
	./usr/share/perl5/Debconf/Element/Gnome/String.pm \
	./usr/share/perl5/Debconf/Element/Noninteractive/Multiselect.pm \
	./usr/share/perl5/Debconf/Element/Noninteractive/Select.pm \
	./usr/share/perl5/Debconf/Template.pm \
	./usr/share/perl5/Debconf/DbDriver/Copy.pm \
	./usr/share/perl5/Debconf/Element/Teletype/Note.pm \
	./usr/share/perl5/Debconf/Element/Kde/Text.pm \
	./usr/share/perl5/Debconf/FrontEnd/Gnome.pm \
	./usr/share/perl5/Debconf/Element/Web/String.pm \
	./usr/share/perl5/Debconf/Path.pm \
	./usr/share/perl5/Debconf/Element/Gnome.pm \
	./etc/bash_completion.d/debconf \
	./usr/share/perl5/Debconf/Element/Dialog/Boolean.pm \
	./usr/share/perl5/Debconf/DbDriver/PackageDir.pm \
	./usr/share/man/man1/debconf.1.gz \
	./usr/share/perl5/Debconf/FrontEnd/Dialog.pm \
	./usr/share/perl5/Debconf/Element/Editor/Multiselect.pm \
	./usr/share/perl5/Debconf/Element/Dialog/Text.pm \
	./usr/share/perl5/Debconf/FrontEnd/Noninteractive.pm \
	./usr/share/perl5/Debconf/Element/Web/Note.pm \
	./usr/share/perl5/Debconf/Element/Web/Multiselect.pm \
	./usr/share/perl5/Debconf/Element/Noninteractive/String.pm \
	./usr/share/perl5/Debconf/Client/ConfModule.pm \
	./usr/share/man/man1/debconf-apt-progress.1.gz \
	./usr/share/perl5/Debconf/FrontEnd/Web.pm \
	./usr/share/perl5/Debconf/Element/Teletype/Text.pm \
	./usr/share/perl5/Debconf/Base.pm \
	./usr/share/perl5/Debconf/Gettext.pm \
	./usr/share/perl5/Debconf/Element/Noninteractive.pm \
	./usr/share/perl5/Debconf/Element/Dialog/Error.pm \
	./usr/share/man/man1/debconf-set-selections.1.gz \
	./usr/share/perl5/Debconf/Log.pm \
	./usr/share/perl5/Debconf/Element/Web/Password.pm \
	./usr/share/perl5/Debian/DebConf/Client/ConfModule.pm \
	./usr/share/perl5/Debconf/Priority.pm \
	./usr/share/man/man1/debconf-copydb.1.gz \
	./usr/share/perl5/Debconf/Element/Editor/Select.pm \
	./usr/share/man/man8/dpkg-reconfigure.8.gz \
	./usr/share/perl5/Debconf/Element/Noninteractive/Boolean.pm \
	./usr/share/perl5/Debconf/FrontEnd/Kde.pm \
	./usr/share/perl5/Debconf/FrontEnd/Passthrough.pm \
	./usr/share/lintian/overrides/debconf \
	./usr/share/perl5/Debconf/Element/Teletype/Progress.pm \
	./usr/share/perl5/Debconf/DbDriver/Debug.pm \
	./usr/share/pixmaps/debian-logo.png \
	./usr/bin/debconf-copydb \
	./usr/share/perl5/Debconf/Element/Kde/Boolean.pm \
	./usr/share/perl5/Debconf/Element/Gnome/Note.pm \
	./usr/share/man/man8/dpkg-preconfigure.8.gz \
	./usr/share/perl5/Debconf/Db.pm \
	./usr/share/perl5/Debconf/Element/Multiselect.pm \
	./usr/share/perl5/Debconf/Element/Kde/Select.pm \
	./usr/share/perl5/Debconf/Element/Gnome/Password.pm \
	./usr/share/perl5/Debconf/DbDriver/DirTree.pm \
	./usr/share/perl5/Debconf/Config.pm \
	./usr/share/doc/debconf/changelog.gz \
	./usr/lib/python2.7/dist-packages/debconf.py \
	./usr/share/perl5/Debconf/Encoding.pm \
	./usr/share/perl5/Debconf/DbDriver/LDAP.pm \
	./usr/sbin/dpkg-reconfigure \
	./usr/bin/debconf-apt-progress \
	./usr/share/perl5/Debconf/Element/Gnome/Multiselect.pm \
	./usr/share/debconf/frontend \
	./usr/share/perl5/Debconf/Element/Teletype/String.pm \
	./usr/share/perl5/Debconf/Element/Teletype/Error.pm \
	./usr/share/perl5/Debconf/Element/Editor/Text.pm \
	./usr/share/perl5/Debconf/Element/Select.pm \
	./usr/bin/debconf-show \
	./usr/share/perl5/Debconf/Element/Teletype/Select.pm \
	./usr/share/perl5/Debconf/DbDriver/Pipe.pm \
	./usr/share/perl5/Debconf/Element/Web/Select.pm \
	./usr/share/perl5/Debconf/DbDriver/Directory.pm \
	./usr/bin/debconf \
	./usr/share/perl5/Debconf/Format.pm \
	./usr/share/perl5/Debconf/Element/Gnome/Select.pm \
	./usr/share/perl5/Debconf/FrontEnd/Teletype.pm \
	./etc/apt/apt.conf.d/70debconf \
	./usr/share/perl5/Debconf/TmpFile.pm \
	./usr/share/perl5/Debconf/Element/Web/Text.pm \
	./usr/share/perl5/Debconf/DbDriver/Cache.pm \
	./usr/share/doc/debconf/copyright \
	./usr/share/perl5/Debconf/Element/Web/Boolean.pm \
	./usr/share/perl5/Debconf/Element/Teletype/Boolean.pm \
	./usr/lib/python3/dist-packages/debconf.py \
	./usr/share/perl5/Debconf/Element/Noninteractive/Error.pm \
	./usr/share/perl5/Debconf/AutoSelect.pm \
	./usr/share/perl5/Debconf/FrontEnd/Text.pm \
	./usr/share/perl5/Debconf/Element/Dialog/Note.pm \
	./usr/share/perl5/Debconf/FrontEnd/Kde/Ui_DebconfWizard.pm \
	./usr/share/perl5/Debconf/Element/Teletype/Multiselect.pm \
	./usr/share/perl5/Debconf/Element/Kde/Progress.pm \
	./usr/share/perl5/Debconf/Element/Web/Error.pm \
	./usr/share/perl5/Debconf/Element/Kde/Password.pm \
	./usr/share/perl5/Debconf/Element/Noninteractive/Progress.pm \
	./usr/share/debconf/confmodule \
	./usr/share/perl5/Debconf/Element/Kde/Multiselect.pm \
	./usr/share/perl5/Debconf/Element/Web/Progress.pm \
	./usr/share/perl5/Debconf/Element/Dialog/Password.pm \
	./usr/share/perl5/Debconf/Element/Noninteractive/Password.pm \
	./usr/share/perl5/Debconf/FrontEnd/Kde/Wizard.pm \
	./usr/share/perl5/Debconf/Element/Kde/Error.pm \
	./usr/share/perl5/Debconf/Element/Noninteractive/Text.pm \
	./usr/share/perl5/Debconf/Element/Dialog/Multiselect.pm \
	./usr/share/perl5/Debconf/ConfModule.pm \
	./etc/debconf.conf \
	./usr/share/perl5/Debconf/Element/Editor/Password.pm \
	./usr/share/perl5/Debconf/Iterator.pm \
	./usr/bin/debconf-escape \
	./usr/share/debconf/transition_db.pl \
	./usr/share/perl5/Debconf/DbDriver/Backup.pm \
	./usr/sbin/dpkg-preconfigure \
	./usr/share/perl5/Debconf/Element/Kde/Note.pm\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"