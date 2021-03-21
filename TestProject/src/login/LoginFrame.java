package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame implements ActionListener{
	
	Container container = getContentPane();
	JLabel userLabel= new JLabel("USERNAME");
	JLabel passwordLabel = new JLabel("PASSWORD");
	JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
	JButton loginButton = new JButton("LOGIN");
	JButton resetButton = new JButton("RESET");
	JCheckBox forgotUsername = new JCheckBox("Forgot Username?");//will not have time to implement the methods
	JCheckBox forgotPassword = new JCheckBox("Forgot Password?");//will not have time to implement the methods 

	
	
	
	//constructor
	LoginFrame()
	{
		setLayoutManager();
		setViews();
		addComponentsToContainer();
		addActionEvent();
		
	}
	
	public void setViews()
	{
		userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        forgotUsername.setBounds(150, 250, 150, 30);
        forgotPassword.setBounds(290, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);

	}
	public void setLayoutManager() 
	{
		//setting layout manager of container to null 
		container.setLayout(null);
	}

	
    public void addComponentsToContainer()
    {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(forgotUsername);
        container.add(forgotPassword);
        container.add(loginButton);
        container.add(resetButton);
    }
    
    public void addActionEvent() 
    {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        //forgotUsername.addActionListener(this);
       // forgotPassword.addActionListener(this);
    }
    
    

    //overriding actionPerformed() method 
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == loginButton) 
		{
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }
        if (e.getSource() == resetButton) 
        {
            userTextField.setText("");
            passwordField.setText("");
        }
//       if (e.getSource() == forgotPassword) 
//        {
//            if (forgotPassword.isSelected()) 
//            {
//                passwordField.setEchoChar((char) 0);
//            } else 
//            {
//                passwordField.setEchoChar('*');
//            }
//        }
     }
}
