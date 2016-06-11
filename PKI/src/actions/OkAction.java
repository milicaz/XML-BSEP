package actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;

import forms.AliasForm;
import forms.GenerateCertificateForm;

import javax.swing.JDialog;
import javax.swing.JFrame;

import forms.GenerateKeyPairForm;
import forms.PasswordForm;

public class OkAction extends AbstractAction {

	private JFrame standardForm;
	private JButton btnOk;
	
	public OkAction(JFrame standardForm){

		putValue(NAME, "OK");
		this.standardForm = standardForm;
	}

	public void actionPerformed(ActionEvent arg0) {
		standardForm.setVisible(false);

		if (standardForm instanceof GenerateKeyPairForm) {

			new GenerateCertificateForm().setVisible(true);

		}

		else if (standardForm instanceof GenerateCertificateForm) {

			new AliasForm().setVisible(true);

		}
		else if (standardForm instanceof AliasForm) {
			
			new PasswordForm().setVisible(true);
			
		}
		else if (standardForm instanceof PasswordForm) {

			standardForm.setVisible(false);
		// TODO Auto-generated method stub		
		}

	}

}
