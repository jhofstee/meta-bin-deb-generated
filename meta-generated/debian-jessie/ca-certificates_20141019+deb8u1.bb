PACKAGES = "ca-certificates"
PROVIDES = "ca-certificates"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/c/ca-certificates/ca-certificates_20141019+deb8u1_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_ca-certificates = "ca-certificates_20141019+deb8u1_all.deb"
SRC_URI[deb0.sha256sum] = "f58d646045855277c87f532ea5c18df319e91d9892437880c9a0169b834f1bd8"
SRC_URI[deb0.md5sum] = "780614ba53f17d20426684d90836b600"

RDEPENDS_${PN} = "openssl (>= 1.0.0) debconf (>= 0.5)"
DEPENDS = "debconf openssl"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/ca-certificates/mozilla/Network_Solutions_Certificate_Authority.crt \
	./usr/share/ca-certificates/mozilla/E-Tugra_Certification_Authority.crt \
	./usr/share/doc/ca-certificates/examples/ca-certificates-local/local/Local_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/Buypass_Class_2_CA_1.crt \
	./usr/share/ca-certificates/mozilla/Verisign_Class_3_Public_Primary_Certification_Authority_-_G2.crt \
	./usr/share/ca-certificates/mozilla/Comodo_Secure_Services_root.crt \
	./usr/share/ca-certificates/mozilla/WellsSecure_Public_Root_Certificate_Authority.crt \
	./usr/share/ca-certificates/mozilla/DigiCert_Assured_ID_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/T\303\234B\304\260TAK_UEKAE_K\303\266k_Sertifika_Hizmet_Sa\304\237lay\304\261c\304\261s\304\261_-_S\303\274r\303\274m_3.crt \
	./usr/share/ca-certificates/mozilla/CA_Disig_Root_R2.crt \
	./usr/share/ca-certificates/mozilla/AC_Ra\303\255z_Certic\303\241mara_S.A..crt \
	./usr/share/ca-certificates/mozilla/Actalis_Authentication_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/CA_Disig_Root_R1.crt \
	./usr/share/ca-certificates/mozilla/Entrust_Root_Certification_Authority.crt \
	./usr/share/ca-certificates/mozilla/GlobalSign_Root_CA_-_R3.crt \
	./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/postrm \
	./usr/share/ca-certificates/mozilla/Trustis_FPS_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/Certinomis_-_Autorit\303\251_Racine.crt \
	./usr/share/ca-certificates/mozilla/ACEDICOM_Root.crt \
	./usr/share/ca-certificates/mozilla/SwissSign_Silver_CA_-_G2.crt \
	./usr/share/ca-certificates/mozilla/Certification_Authority_of_WoSign_G2.crt \
	./usr/share/ca-certificates/mozilla/PSCProcert.crt \
	./usr/share/ca-certificates/mozilla/DigiCert_Trusted_Root_G4.crt \
	./usr/share/ca-certificates/mozilla/EBG_Elektronik_Sertifika_Hizmet_Sa\304\237lay\304\261c\304\261s\304\261.crt \
	./usr/share/ca-certificates/mozilla/NetLock_Express_=Class_C=_Root.crt \
	./usr/share/ca-certificates/mozilla/CNNIC_ROOT.crt \
	./usr/share/ca-certificates/mozilla/Certplus_Class_2_Primary_CA.crt \
	./usr/share/ca-certificates/mozilla/QuoVadis_Root_CA_3_G3.crt \
	./usr/share/ca-certificates/mozilla/QuoVadis_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/ApplicationCA_-_Japanese_Government.crt \
	./usr/share/ca-certificates/mozilla/Security_Communication_EV_RootCA1.crt \
	./usr/share/ca-certificates/mozilla/GlobalSign_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/EC-ACC.crt \
	./usr/share/ca-certificates/mozilla/UTN_USERFirst_Email_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/DigiCert_Assured_ID_Root_G2.crt \
	./usr/share/ca-certificates/mozilla/StartCom_Certification_Authority_G2.crt \
	./usr/share/ca-certificates/mozilla/CA_WoSign_ECC_Root.crt \
	./usr/share/ca-certificates/mozilla/Microsec_e-Szigno_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/GeoTrust_Global_CA.crt \
	./usr/share/ca-certificates/mozilla/EE_Certification_Centre_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/NetLock_Arany_=Class_Gold=_F\305\221tan\303\272s\303\255tv\303\241ny.crt \
	./usr/share/ca-certificates/mozilla/TWCA_Root_Certification_Authority.crt \
	./usr/share/ca-certificates/mozilla/China_Internet_Network_Information_Center_EV_Certificates_Root.crt \
	./usr/share/ca-certificates/mozilla/DST_ACES_CA_X6.crt \
	./usr/share/ca-certificates/mozilla/Global_Chambersign_Root_-_2008.crt \
	./usr/share/ca-certificates/mozilla/GeoTrust_Universal_CA.crt \
	./usr/share/ca-certificates/mozilla/Go_Daddy_Root_Certificate_Authority_-_G2.crt \
	./usr/share/ca-certificates/mozilla/Swisscom_Root_CA_1.crt \
	./usr/share/ca-certificates/mozilla/GeoTrust_Universal_CA_2.crt \
	./usr/share/ca-certificates/mozilla/Staat_der_Nederlanden_Root_CA_-_G3.crt \
	./usr/share/ca-certificates/mozilla/Cybertrust_Global_Root.crt \
	./usr/share/ca-certificates/mozilla/S-TRUST_Universal_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/COMODO_RSA_Certification_Authority.crt \
	./usr/share/ca-certificates/mozilla/VeriSign_Class_3_Public_Primary_Certification_Authority_-_G4.crt \
	./usr/share/ca-certificates/mozilla/Entrust_Root_Certification_Authority_-_G2.crt \
	./usr/share/ca-certificates/mozilla/VeriSign_Class_3_Public_Primary_Certification_Authority_-_G5.crt \
	./usr/share/ca-certificates/mozilla/Microsec_e-Szigno_Root_CA_2009.crt \
	./usr/share/ca-certificates/mozilla/NetLock_Business_=Class_B=_Root.crt \
	./usr/share/ca-certificates/mozilla/Verisign_Class_1_Public_Primary_Certification_Authority.crt \
	./usr/share/ca-certificates/mozilla/Go_Daddy_Class_2_CA.crt \
	./usr/share/ca-certificates/mozilla/SecureSign_RootCA11.crt \
	./usr/share/ca-certificates/mozilla/NetLock_Qualified_=Class_QA=_Root.crt \
	./usr/share/ca-certificates/mozilla/Starfield_Root_Certificate_Authority_-_G2.crt \
	./usr/share/ca-certificates/mozilla/IdenTrust_Commercial_Root_CA_1.crt \
	./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/changelog \
	./usr/share/ca-certificates/mozilla/DST_Root_CA_X3.crt \
	./usr/share/ca-certificates/mozilla/thawte_Primary_Root_CA_-_G3.crt \
	./usr/share/ca-certificates/mozilla/CFCA_EV_ROOT.crt \
	./usr/share/ca-certificates/mozilla/Certigna.crt \
	./usr/share/ca-certificates/mozilla/Starfield_Services_Root_Certificate_Authority_-_G2.crt \
	./usr/share/ca-certificates/mozilla/T\303\234RKTRUST_Elektronik_Sertifika_Hizmet_Sa\304\237lay\304\261c\304\261s\304\261_H5.crt \
	./usr/share/ca-certificates/mozilla/Verisign_Class_1_Public_Primary_Certification_Authority_-_G2.crt \
	./usr/share/ca-certificates/mozilla/XRamp_Global_CA_Root.crt \
	./usr/share/ca-certificates/mozilla/DigiCert_Assured_ID_Root_G3.crt \
	./usr/share/ca-certificates/mozilla/AffirmTrust_Premium_ECC.crt \
	./usr/share/ca-certificates/mozilla/Security_Communication_RootCA2.crt \
	./usr/share/ca-certificates/mozilla/COMODO_Certification_Authority.crt \
	./usr/share/ca-certificates/mozilla/Visa_eCommerce_Root.crt \
	./usr/share/ca-certificates/mozilla/StartCom_Certification_Authority_2.crt \
	./usr/share/ca-certificates/mozilla/thawte_Primary_Root_CA_-_G2.crt \
	./usr/share/ca-certificates/mozilla/AffirmTrust_Premium.crt \
	./usr/share/ca-certificates/mozilla/GeoTrust_Primary_Certification_Authority.crt \
	./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/rules \
	./usr/share/man/man8/update-ca-certificates.8.gz \
	./usr/share/ca-certificates/mozilla/Taiwan_GRCA.crt \
	./usr/share/doc/ca-certificates/NEWS.Debian.gz \
	./usr/share/ca-certificates/mozilla/VeriSign_Universal_Root_Certification_Authority.crt \
	./usr/share/ca-certificates/mozilla/WoSign_China.crt \
	./usr/share/ca-certificates/mozilla/UTN_USERFirst_Hardware_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/certSIGN_ROOT_CA.crt \
	./usr/share/ca-certificates/mozilla/DigiCert_Global_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/Verisign_Class_3_Public_Primary_Certification_Authority_2.crt \
	./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/copyright \
	./usr/share/ca-certificates/mozilla/TeliaSonera_Root_CA_v1.crt \
	./usr/share/ca-certificates/mozilla/GlobalSign_ECC_Root_CA_-_R4.crt \
	./usr/share/ca-certificates/mozilla/OISTE_WISeKey_Global_Root_GB_CA.crt \
	./usr/share/ca-certificates/mozilla/TURKTRUST_Certificate_Services_Provider_Root_2007.crt \
	./usr/share/ca-certificates/mozilla/T\303\234RKTRUST_Elektronik_Sertifika_Hizmet_Sa\304\237lay\304\261c\304\261s\304\261_H6.crt \
	./usr/share/ca-certificates/mozilla/Baltimore_CyberTrust_Root.crt \
	./usr/share/ca-certificates/mozilla/CA_Disig.crt \
	./usr/share/ca-certificates/mozilla/DigiCert_Global_Root_G3.crt \
	./usr/share/ca-certificates/mozilla/Equifax_Secure_CA.crt \
	./usr/share/ca-certificates/mozilla/S-TRUST_Authentication_and_Encryption_Root_CA_2005_PN.crt \
	./usr/share/ca-certificates/mozilla/Izenpe.com.crt \
	./usr/share/ca-certificates/mozilla/AffirmTrust_Commercial.crt \
	./usr/share/ca-certificates/mozilla/Verisign_Class_2_Public_Primary_Certification_Authority_-_G3.crt \
	./usr/sbin/update-ca-certificates \
	./usr/share/ca-certificates/mozilla/Certum_Trusted_Network_CA.crt \
	./usr/share/ca-certificates/mozilla/Verisign_Class_3_Public_Primary_Certification_Authority.crt \
	./usr/share/ca-certificates/mozilla/Verisign_Class_1_Public_Primary_Certification_Authority_-_G3.crt \
	./usr/share/ca-certificates/mozilla/Root_CA_Generalitat_Valenciana.crt \
	./usr/share/ca-certificates/mozilla/AddTrust_Qualified_Certificates_Root.crt \
	./usr/share/ca-certificates/mozilla/Hongkong_Post_Root_CA_1.crt \
	./usr/share/ca-certificates/mozilla/Atos_TrustedRoot_2011.crt \
	./usr/share/ca-certificates/mozilla/ACCVRAIZ1.crt \
	./usr/share/ca-certificates/mozilla/Deutsche_Telekom_Root_CA_2.crt \
	./usr/share/ca-certificates/mozilla/TC_TrustCenter_Class_3_CA_II.crt \
	./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/ca-certificates-local.triggers \
	./usr/share/ca-certificates/mozilla/Camerfirma_Global_Chambersign_Root.crt \
	./usr/share/ca-certificates/mozilla/DigiCert_Global_Root_G2.crt \
	./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/control \
	./usr/share/ca-certificates/mozilla/WoSign.crt \
	./usr/share/ca-certificates/mozilla/Sonera_Class_1_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/TWCA_Global_Root_CA.crt \
	./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/compat \
	./usr/share/ca-certificates/mozilla/DigiCert_High_Assurance_EV_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/Chambers_of_Commerce_Root_-_2008.crt \
	./usr/share/ca-certificates/mozilla/OISTE_WISeKey_Global_Root_GA_CA.crt \
	./usr/share/ca-certificates/mozilla/D-TRUST_Root_Class_3_CA_2_EV_2009.crt \
	./usr/share/ca-certificates/spi-inc.org/spi-cacert-2008.crt \
	./usr/share/ca-certificates/mozilla/Security_Communication_Root_CA.crt \
	./usr/share/doc/ca-certificates/copyright \
	./usr/share/ca-certificates/mozilla/Buypass_Class_3_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/SecureTrust_CA.crt \
	./usr/share/ca-certificates/mozilla/GeoTrust_Global_CA_2.crt \
	./usr/share/ca-certificates/mozilla/Sonera_Class_2_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/Certum_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/Verisign_Class_3_Public_Primary_Certification_Authority_-_G3.crt \
	./usr/share/ca-certificates/mozilla/GeoTrust_Primary_Certification_Authority_-_G3.crt \
	./usr/share/doc/ca-certificates/examples/ca-certificates-local/local/Makefile \
	./usr/share/ca-certificates/mozilla/Camerfirma_Chambers_of_Commerce_Root.crt \
	./usr/share/ca-certificates/mozilla/IdenTrust_Public_Sector_Root_CA_1.crt \
	./usr/share/ca-certificates/mozilla/Swisscom_Root_CA_2.crt \
	./usr/share/ca-certificates/mozilla/SwissSign_Gold_CA_-_G2.crt \
	./usr/share/ca-certificates/mozilla/Buypass_Class_2_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/StartCom_Certification_Authority.crt \
	./usr/share/ca-certificates/mozilla/SwissSign_Platinum_CA_-_G2.crt \
	./usr/share/doc/ca-certificates/examples/ca-certificates-local/Makefile \
	./usr/share/ca-certificates/mozilla/Equifax_Secure_Global_eBusiness_CA.crt \
	./usr/share/ca-certificates/mozilla/Verisign_Class_2_Public_Primary_Certification_Authority_-_G2.crt \
	./usr/share/ca-certificates/mozilla/USERTrust_ECC_Certification_Authority.crt \
	./usr/share/ca-certificates/mozilla/Swisscom_Root_EV_CA_2.crt \
	./usr/share/ca-certificates/mozilla/Comodo_Trusted_Services_root.crt \
	./usr/share/ca-certificates/mozilla/T-TeleSec_GlobalRoot_Class_3.crt \
	./usr/share/doc/ca-certificates/changelog.gz \
	./usr/share/ca-certificates/mozilla/QuoVadis_Root_CA_3.crt \
	./usr/share/ca-certificates/mozilla/QuoVadis_Root_CA_1_G3.crt \
	./usr/share/ca-certificates/mozilla/ComSign_CA.crt \
	./usr/share/ca-certificates/mozilla/Juur-SK.crt \
	./usr/share/ca-certificates/mozilla/Secure_Global_CA.crt \
	./usr/share/ca-certificates/mozilla/USERTrust_RSA_Certification_Authority.crt \
	./usr/share/ca-certificates/mozilla/Equifax_Secure_eBusiness_CA_1.crt \
	./usr/share/ca-certificates/mozilla/IGC_A.crt \
	./usr/share/ca-certificates/mozilla/AddTrust_Public_Services_Root.crt \
	./usr/share/ca-certificates/mozilla/GlobalSign_ECC_Root_CA_-_R5.crt \
	./usr/share/ca-certificates/mozilla/ePKI_Root_Certification_Authority.crt \
	./usr/share/ca-certificates/mozilla/AffirmTrust_Networking.crt \
	./usr/share/ca-certificates/mozilla/GeoTrust_Primary_Certification_Authority_-_G2.crt \
	./usr/share/ca-certificates/mozilla/Certinomis_-_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/Staat_der_Nederlanden_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/Starfield_Class_2_CA.crt \
	./usr/share/ca-certificates/mozilla/Staat_der_Nederlanden_Root_CA_-_G2.crt \
	./usr/share/ca-certificates/mozilla/AddTrust_Low-Value_Services_Root.crt \
	./usr/share/ca-certificates/mozilla/Comodo_AAA_Services_root.crt \
	./usr/share/ca-certificates/mozilla/NetLock_Notary_=Class_A=_Root.crt \
	./usr/share/doc/ca-certificates/examples/ca-certificates-local/README \
	./usr/share/ca-certificates/mozilla/Staat_der_Nederlanden_EV_Root_CA.crt \
	./usr/share/doc/ca-certificates/README.Debian \
	./usr/share/ca-certificates/mozilla/QuoVadis_Root_CA_2_G3.crt \
	./usr/share/ca-certificates/mozilla/COMODO_ECC_Certification_Authority.crt \
	./usr/share/ca-certificates/mozilla/RSA_Security_2048_v3.crt \
	./usr/share/ca-certificates/mozilla/thawte_Primary_Root_CA.crt \
	./usr/share/ca-certificates/mozilla/D-TRUST_Root_Class_3_CA_2_2009.crt \
	./usr/share/ca-certificates/mozilla/GlobalSign_Root_CA_-_R2.crt \
	./usr/share/ca-certificates/mozilla/AddTrust_External_Root.crt \
	./usr/share/ca-certificates/mozilla/Autoridad_de_Certificacion_Firmaprofesional_CIF_A62634068.crt \
	./usr/share/ca-certificates/mozilla/Entrust.net_Premium_2048_Secure_Server_CA.crt \
	./usr/share/ca-certificates/mozilla/T-TeleSec_GlobalRoot_Class_2.crt \
	./usr/share/doc/ca-certificates/examples/ca-certificates-local/debian/source/format \
	./usr/share/ca-certificates/mozilla/Entrust_Root_Certification_Authority_-_EC1.crt \
	./usr/share/ca-certificates/mozilla/Hellenic_Academic_and_Research_Institutions_RootCA_2011.crt \
	./usr/share/ca-certificates/mozilla/QuoVadis_Root_CA_2.crt\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
