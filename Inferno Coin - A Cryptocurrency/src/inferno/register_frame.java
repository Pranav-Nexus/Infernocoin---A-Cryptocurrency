package inferno;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class register_frame extends JFrame{
	public register_frame(){

		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(null);
		frame.add(panel);

		panel.setLayout(null);

		JLabel user = new JLabel("User");
		user.setBounds(650, 205, 70, 50);
		panel.add(user);

		JTextField usertext = new JTextField(30);
		usertext.setBounds(700, 205, 150, 30);
		panel.add(usertext);

		JLabel pswd = new JLabel("Password");
		pswd.setBounds(630, 250, 150, 50);
		panel.add(pswd);

		JTextField pwsdtext = new JTextField(30);
		pwsdtext.setBounds(700, 250, 150, 30);
		panel.add(pwsdtext);
		
		JLabel con_pswd = new JLabel("Confirm Password");
		con_pswd.setBounds(600, 430, 200, 50);
		panel.add(con_pswd);

		JTextField con_pwsdtext = new JTextField(30);
		con_pwsdtext.setBounds(700, 430, 150, 30);
		panel.add(con_pwsdtext);
		
		JButton login = new JButton("Login");
		login.setBounds(700, 500, 80, 40);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usertext.getText();
				String password = pwsdtext.getText(); 
				String con_password = con_pwsdtext.getText();
				frame.setVisible(false);
				frame.dispose();
				System.out.println(con_password);
				registration reg = new registration(username,password,con_password);
			}
		});
		panel.add(login);

		frame.setVisible(true);
		

	}
}
