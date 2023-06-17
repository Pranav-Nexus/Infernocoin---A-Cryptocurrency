package inferno;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main_frame extends JFrame {

	public static JButton mine, transfer, displed;
	public static JFrame frame;
	public static JPanel panel;
	
	public main_frame(String user) {
		String d = "";
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		
		
		if(user.equals("Pranav"))
		{
			d="1";			
		}
		else if(user.equals("Vageesh"))
		{
			d="2";
		}
		else if(user.equals("Suryaa"))
		{
			d="3";
		}
		else if(user.equals("Vishal"))
		{
			d="4";
		}
		
		String path="E:/USER";
		String dest=path+d+"/user"+d+".txt";
		
		
		int b = 0;
	      try (BufferedReader reader = new BufferedReader(new FileReader(dest))) {
	          while (reader.readLine() != null) b++;
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
		
		
		
		
		panel = new JPanel();
		frame = new JFrame();
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);
		
		mine = new JButton("Mine");
		mine.setBounds(100, 864, 130, 70);
		mine.setFont(new Font("Consolas",Font.BOLD,18));
		mine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mine a = new Mine();
			}
		});
		panel.add(mine);

		transfer = new JButton("Transfer");
		transfer.setBounds(1668, 864, 130, 70);
		transfer.setFont(new Font("Consolas",Font.BOLD,18));
		transfer.addActionListener(new guitest());
		panel.add(transfer);
		
		displed = new JButton("Display Ledger");
		displed.setBounds(800, 864, 180, 70);
		displed.setFont(new Font("Consolas",Font.BOLD,18));
		displed.addActionListener(new guitest());
		panel.add(displed);
		
		
		String bal = Integer.toString(b);
		JLabel balance = new JLabel("Your Balance is: "+bal);
		balance.setBounds(450,216,250,26);
		balance.setFont(new Font("Consolas",Font.BOLD,18));
		panel.add(balance);
		
		JLabel hello = new JLabel("Welcome "+user);
		hello.setBounds(30, 30, 250, 26);
		hello.setFont(new Font("Consolas",Font.BOLD,18));
		panel.add(hello);
		
		

		frame.setVisible(true);
		
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader(dest))) {
			String line = reader.readLine();
		
			for(int i=1;i<b;i++)
			{
			line = reader.readLine();
			}
	      
	    	 
	    	  
		String trans = line;
		JLabel transaction = new JLabel("Your recent transaction is: "+trans);
		transaction.setBounds(450,256,1000,26);
		transaction.setFont(new Font("Consolas",Font.BOLD,18));
		panel.add(transaction);
		
		frame.setVisible(true);
		} catch (IOException e) {
	    	  System.out.println("User does not exist");
	}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mine) { 
			frame.setVisible(false);
			frame.dispose();
			Mine a = new Mine();
		}
		if (e.getSource() == transfer) {

			frame.setVisible(false);
			frame.dispose();

		}
		
		if (e.getSource() == displed) {

			frame.setVisible(false);
			frame.dispose();

		}
	}
}
