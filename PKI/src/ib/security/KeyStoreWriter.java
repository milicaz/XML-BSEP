package ib.security;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

import org.bouncycastle.asn1.x500.X500NameBuilder;
import org.bouncycastle.asn1.x500.style.BCStyle;

import databaseReadWrite.DatabaseWrite;

public class KeyStoreWriter {

	private static final String KEY_STORE_FILE = "./data/marija.jks";
	private static KeyStore keyStore;
	public static String alias=new String();
	String url = "jdbc:mysql://localhost:8080/BESP";
	
	public static Date lastModified=new Date();
	private static DatabaseWrite dbwrite = new DatabaseWrite();
	private static Object password=new Object();

	// public KeyStoreWriter() {}
	public String init(){
	
		try {
			Vector v=new Vector();
			String al=new String();
			keyStore = KeyStore.getInstance("JKS");
			
			for (Enumeration<String> aliases = v.elements(); aliases.hasMoreElements();)
			       System.out.println(aliases.nextElement());
			//while(keyStore.aliases().hasMoreElements())
			{ 
				for(String alias=al;!alias.isEmpty(); ){
			
			    lastModified=keyStore.getCreationDate(alias);
			    alias = (String)keyStore.aliases().nextElement();
			}
			}
			}catch (KeyStoreException e) {
			e.printStackTrace();
		}
	return alias;
	}

	public static void loadKeyStore(String fileName, char[] password) {
		try {
			if (fileName != null) {
				// dbwrite.writeDatabase();
				keyStore.load(new FileInputStream(KEY_STORE_FILE), password);

			} else {
				// ako nema postojeceg KS fajla u koji cemo dodavati, vec se
				// kreira novi,
				// mora da se pozove load, pri cemu je prvi parametar sada null
				// dbwrite.writeDatabase();
				keyStore.load(null, password);

			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (CertificateException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveKeyStore(String fileName, char[] password) {
		try {
			keyStore.store(new FileOutputStream(fileName), password);
		} catch (KeyStoreException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (CertificateException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void write(String alias, PrivateKey privateKey,
			char[] password, Certificate certificate) {
		try {
			keyStore.setKeyEntry(alias, privateKey, password,
					new Certificate[] { certificate });
		} catch (KeyStoreException e) {
			e.printStackTrace();
		}
	}

	public void testing(String alias, Date lastModified, String password)
			throws KeyStoreException {
		//keyStore.getType();
		if (keyStore.containsAlias(alias)) {
			
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(url);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String querySetLimit = "SET GLOBAL max_allowed_packet=104857600;"; // 10
																				// MB
			java.sql.Statement stSetLimit = null;
			try {
				stSetLimit = conn.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stSetLimit.execute(querySetLimit);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            KeyStoreWriter.write(alias, null, null, null);
			
			String sql = "LOAD alias INTO TABLE dbo.GenerateKeyPair;";
		}
	}
	

	public void testIt() {
		try {
			// kreiramo generator i generisemo kljuceve i sertifiakt
			CertificateGenerator gen = new CertificateGenerator();
			// par kljuceva
			KeyPair keyPair = gen.generateKeyPair();

			// datumi
			SimpleDateFormat iso8601Formater = new SimpleDateFormat(
					"yyyy-MM-dd");
			Date startDate = iso8601Formater.parse("2007-12-31");
			Date endDate = iso8601Formater.parse("2017-12-31");

			// podaci o vlasniku i izdavacu posto je self signed
			// klasa X500NameBuilder pravi X500Name objekat koji nam treba
			X500NameBuilder builder = new X500NameBuilder(BCStyle.INSTANCE);
			builder.addRDN(BCStyle.CN, "Goran Sladic");
			builder.addRDN(BCStyle.SURNAME, "Sladic");
			builder.addRDN(BCStyle.GIVENNAME, "Goran");
			builder.addRDN(BCStyle.O, "UNS-FTN");
			builder.addRDN(BCStyle.OU, "Katedra za informatiku");
			builder.addRDN(BCStyle.C, "RS");
			builder.addRDN(BCStyle.E, "sladicg@uns.ac.rs");
			// UID (USER ID) je ID korisnika
			builder.addRDN(BCStyle.UID, "123445");

			// Serijski broj sertifikata
			String sn = "1";
			// kreiraju se podaci za issuer-a
			IssuerData issuerData = new IssuerData(keyPair.getPrivate(),
					builder.build());
			// kreiraju se podaci za vlasnika
			SubjectData subjectData = new SubjectData(keyPair.getPublic(),
					builder.build(), sn, startDate, endDate);

			// generise se sertifikat
			X509Certificate cert = gen.generateCertificate(issuerData,
					subjectData);

			// kreira se keystore, ucitava ks fajl, dodaje kljuc i sertifikat i
			// sacuvaju se izmene

			loadKeyStore(null, "test".toCharArray());
			write("test", keyPair.getPrivate(), "test10".toCharArray(), cert);
			saveKeyStore("./data/test.jks", "test10".toCharArray());

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		KeyStoreWriter test = new KeyStoreWriter();
		try {
			test.testing(alias, lastModified, password.toString());
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
