package inferno;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mine {
	public static JLabel nob, uid;
	public static JTextField nobtxt, uidtxt;
	public static JButton send;
	public static JFrame frame;
	public static JPanel panel;
	public static JButton proceed;

	public Mine() {
		panel = new JPanel();
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);

		nob = new JLabel("NO. of block you want to mine");
		nob.setBounds(650, 205, 1000, 250);
		nob.setFont(new Font("Consolas", Font.BOLD, 14));
		panel.add(nob);

		nobtxt = new JTextField(30);
		nobtxt.setBounds(1000, 315, 200, 30);
		panel.add(nobtxt);

		uid = new JLabel("User id");
		uid.setBounds(650, 250, 680, 300);
		uid.setFont(new Font("Consolas", Font.BOLD, 14));
		panel.add(uid);

		uidtxt = new JTextField(30);
		uidtxt.setBounds(1000, 385, 200, 30);
		panel.add(uidtxt);

		String userid = uidtxt.getText();
		String no_of_bloc = nobtxt.getText();
		
		proceed = new JButton();
		proceed.setBounds(1668, 864, 130, 70);
		proceed.setFont(new Font("Consolas",Font.BOLD,18));
		proceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miner mine = new miner();
				System.out.println(userid);
				mine.check(userid, no_of_bloc);
			}
		});
		panel.add(proceed);
		

		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		String nob = nobtxt.getText();
		String user_id = uidtxt.getText();
		frame.setVisible(false);
		frame.dispose();

	}
}
