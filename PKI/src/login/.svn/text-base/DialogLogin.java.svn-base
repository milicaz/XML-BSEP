package gui.dialogs.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class DialogLogin extends JDialog {

	public static final int OK = 0;
	public static final int CANCEL = 1;

	private JLabel lblKorisnickoIme;
	private JTextField txtKorisnickoIme;
	private JLabel lblLozinka;
	private JPasswordField pfLozinka;

	public static String ulogovanUsername;
	public String ulogovanPass;
	public static String sifraBanke;
	public static String nazivBanke;
	public static String ime;
	public static String prezime;

	private int closingMode = DialogLogin.CANCEL;

	public DialogLogin(Frame parent) {
	
		

		super(parent, "Login", true);

		addWindowListener(new LoginDialogListener());

		Dimension dimLabel = new Dimension(200, 20);

		Box box = new Box(BoxLayout.Y_AXIS);

		JPanel panKorisnickoIme = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lblKorisnickoIme = new JLabel("Korisnicko ime");
		lblKorisnickoIme.setPreferredSize(dimLabel);
		txtKorisnickoIme = new JTextField(15);
		txtKorisnickoIme.addKeyListener(new TxtKeyListener());
		panKorisnickoIme.add(lblKorisnickoIme);
		panKorisnickoIme.add(txtKorisnickoIme);
		box.add(panKorisnickoIme);

		JPanel panLozinka = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lblLozinka = new JLabel("Lozinka");
		lblLozinka.setPreferredSize(dimLabel);
		pfLozinka = new JPasswordField(15);
		pfLozinka.addKeyListener(new TxtKeyListener());
		panLozinka.add(lblLozinka);
		panLozinka.add(pfLozinka);
		box.add(panLozinka);

		JPanel panButton = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				closingMode = DialogLogin.OK;
				try {
					proveriIspravnost();
					setVisible(false);
				} catch (RequiredFieldException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
					closingMode = DialogLogin.CANCEL;
				}
			}
		});
		panButton.add(btnOk);
		JButton btnCancel = new JButton("Odustanak");
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				closingMode = DialogLogin.CANCEL;
				setVisible(false);

			}
		});

		// DA MOZE ESC I ENTER
		KeyboardFocusManager manager = KeyboardFocusManager
				.getCurrentKeyboardFocusManager();
		manager.addKeyEventDispatcher(new KeyEventDispatcher() {
			public boolean dispatchKeyEvent(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					closingMode = DialogLogin.OK;
					try {
						proveriIspravnost();
						setVisible(false);
					} catch (RequiredFieldException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						closingMode = DialogLogin.CANCEL;
					}
				} else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					closingMode = DialogLogin.CANCEL;
					setVisible(false);
				}
				return false;
			}
		});

		panButton.add(btnCancel);

		box.add(panButton);

		add(box, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(null);

	}

	public int getClosingMode() {
		return closingMode;
	}

	private void proveriIspravnost() throws RequiredFieldException {
		String username = txtKorisnickoIme.getText().trim();
		String password = pfLozinka.getText().trim();
		if (username.equals("")) {
			txtKorisnickoIme.setBackground(Color.RED);
			RequiredFieldException rfe = new RequiredFieldException(
					"Molimo vas da popunite polje korisnickog imena");
			throw rfe;
		}
		if (password.equals("")) {
			pfLozinka.setBackground(Color.RED);
			RequiredFieldException rfe = new RequiredFieldException(
					"Molimo vas da popunite polje lozinke");
			throw rfe;
		}
	//	System.out.println(username + " " + password);
	
			/*
			 * stari nacin PreparedStatement stmt = DBConnection
			 * .getConnection() .prepareStatement(
			 * "SELECT ime,prezime,username,password FROM radnik where username=? and password=?"
			 * ); stmt.setString(1, username); stmt.setString(2, password);
			 * 
			 * ResultSet rs = (ResultSet) stmt.executeQuery(); if(rs.next()) {
			 * String username1 = rs.getString("username"); String password1 =
			 * rs.getString("password");
			 * System.out.println(username1+" "+password1); return;
			 * 
			 * }
			 * 
			 * // RequiredFieldException rfe = new
			 * RequiredFieldException("Prijava nije uspela"); //throw rfe;
			 */

		//IZMENI
			/*
			CallableStatement proc = DBConnection.getConnection().prepareCall(
					"{ call Login(?,?)}");
			proc.setString(1, username);
			proc.setString(2, password);

			ResultSet rs = (ResultSet) proc.executeQuery();
			if (rs.next()) {
				ulogovanUsername = rs.getString("username");
				ulogovanPass = rs.getString("password");
				sifraBanke = rs.getString("SIFRA_BANKE");
				ime = rs.getString("ime");
				prezime = rs.getString("prezime");
				// System.out.println(ulogovanUsername+" "+ulogovanPass+" "+sifraBanke);
				getNazivBanke();
				//PATCH
				  DBConnection.getConnection().commit();
			        proc.close();
				return;
*/
			
			

			RequiredFieldException rfe = new RequiredFieldException(
					"Prijava nije uspela");
			throw rfe;

		
	}

	

	public static String getIme() {
		return ime;
	}

	public static String getPrezime() {
		return prezime;
	}

	public static String getNazovBanke() {
		return nazivBanke;
	}

	public static String getSifraBanke() {
		return sifraBanke;
	}

	public static String getUlogovanUsername() {
		return ulogovanUsername;
	}

	public JTextField getTxtKorisnickoIme() {
		return txtKorisnickoIme;
	}

	public void setTxtKorisnickoIme(JTextField txtKorisnickoIme) {
		this.txtKorisnickoIme = txtKorisnickoIme;
	}

	public JPasswordField getPfLozinka() {
		return pfLozinka;
	}

	public void setPfLozinka(JPasswordField pfLozinka) {
		this.pfLozinka = pfLozinka;
	}

}