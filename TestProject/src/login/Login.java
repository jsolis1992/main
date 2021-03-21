package login;

import javax.swing.*;
import java.awt.*;
public class Login {

	public static void main(String args[]) {
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Registered User Login");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
	}	
}
