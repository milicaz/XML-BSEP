package gui.dialogs.login;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class TxtKeyListener implements KeyListener 
{

	@Override
	public void keyTyped(KeyEvent arg0) 
	{
		JTextField txt=(JTextField) arg0.getSource();
		if (arg0.isActionKey() || arg0.getKeyCode()==KeyEvent.VK_ENTER || arg0.getKeyCode()==KeyEvent.VK_BACK_SPACE)
		{
			txt.setBackground(Color.RED);
			return;
		}
		else
		{
			txt.setBackground(Color.WHITE);
		}

	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		

	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		

	}

}
