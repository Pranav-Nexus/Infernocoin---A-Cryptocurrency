package inferno;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guitest implements ActionListener {
	public static JLabel user, pswd;
	public static JTextField usertext;
	public static JPasswordField pwsdtext;
	public static JButton login, register;
	public static JFrame frame;
	public static JPanel panel;

	public static void main(String args[]) {
		panel = new JPanel();
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);


		user = new JLabel("User");
		user.setBounds(650, 205, 700, 250);
		panel.add(user);

		usertext = new JTextField(30);
		usertext.setBounds(700, 315, 150, 30);
		panel.add(usertext);

		pswd = new JLabel("Password");
		pswd.setBounds(630, 250, 680, 300);
		panel.add(pswd);

		pwsdtext = new JPasswordField(30);
		pwsdtext.setBounds(700, 385, 150, 30);
		panel.add(pwsdtext);

		login = new JButton("Login");
		login.setBounds(700, 500, 80, 40);
		login.addActionListener(new guitest());
		panel.add(login);

		register = new JButton("Register");
		register.setBounds(800, 500, 100, 40);
		register.addActionListener(new guitest());
		panel.add(register);

		frame.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login) {
			String username = usertext.getText();
			String password = pwsdtext.getText(); 
			frame.setVisible(false);
			frame.dispose();
			validation vd = new validation(username,password);
			
		}
		if (e.getSource() == register) {

			frame.setVisible(false);
			frame.dispose();
			register_frame rf = new register_frame();

		}
		

	}

}
