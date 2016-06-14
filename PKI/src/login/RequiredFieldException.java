package gui.dialogs.login;

@SuppressWarnings("serial")
public class RequiredFieldException extends Exception{
	
	public RequiredFieldException(String requiredFieldMessage){
		
		super(requiredFieldMessage);
		
	}

}
