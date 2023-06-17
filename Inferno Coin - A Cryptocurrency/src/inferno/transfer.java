package inferno;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class transfer implements ActionListener {
	public static JLabel amt, uid;
	public static JTextField amtxt;
	public static JPasswordField uidtxt;
	public static JButton send;
	public static JFrame frame;
	public static JPanel panel;

	public static void main(String args[]) {
		panel = new JPanel();
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);

		amt = new JLabel("Enter the amount you want to transfer ");
		amt.setBounds(650, 205, 1000, 250);
		amt.setFont(new Font("Consolas",Font.BOLD,14));
		panel.add(amt);

		amtxt = new JTextField(30);
		amtxt.setBounds(1000, 315, 200, 30);
		panel.add(amtxt);

		uid = new JLabel("Receiver's id");
		uid.setBounds(650, 250, 680, 300);
		uid.setFont(new Font("Consolas",Font.BOLD,14));
		panel.add(uid);

		uidtxt = new JPasswordField(30);
		uidtxt.setBounds(1000, 385, 200, 30);
		panel.add(uidtxt);

		send = new JButton("Send");
		send.setBounds(862, 500, 130, 70);
		send.setFont(new Font("Consolas",Font.BOLD,18));
		send.addActionListener(new transfer());
		panel.add(send);
		
		
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		
			String amt = amtxt.getText();
			String user_id = uidtxt.getText();
			frame.setVisible(false);
			frame.dispose();

		

	}

}
