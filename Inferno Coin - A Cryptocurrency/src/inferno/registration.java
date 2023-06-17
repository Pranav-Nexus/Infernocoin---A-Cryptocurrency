package inferno;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class registration {

	public registration(String user, String password, String Confirm_password) {
		try {
			File file_u = new File("C:\\Users\\ragna\\Desktop\\blocks\\username.txt");
			File file_p = new File("C:\\Users\\ragna\\Desktop\\blocks\\Password.txt");

			Scanner sc = new Scanner(file_u);
			Scanner sc1 = new Scanner(file_p);

			String u = "", p = "";
			int i = 0, j = 0, flag = 0;
			while (sc.hasNextLine()) {
				u = sc.nextLine();
				if (u.equals(user)) {
					System.out.println("u");
					break;
				}
				i++;
			}

			while (sc1.hasNextLine()) {
				if (i - 1 == j) {
					p = sc1.nextLine();
				}
				if (p.equals(password)) {
					System.out.println(p);
					flag = 1;
					break;
				}
				j++;
			}

			if (flag == 1) {
				System.out.println("Credentials already taken!!");
				register_frame reg = new register_frame();
			}

			System.out.println(password);
			System.out.println(Confirm_password);

			if (password.equals(Confirm_password)) {
				
				FileWriter writer = new FileWriter("C:/Users/ragna/Desktop/blocks/username.txt",true);
				while (sc.hasNextLine());
				writer.write(user + "\n");
				writer.close();

				FileWriter writer1 = new FileWriter("C:/Users/ragna/Desktop/blocks/Password.txt",true);
				while (sc1.hasNextLine());
			
				writer1.write(password + "\n");
				writer1.close();

				main_frame mf = new main_frame(user);
			}

		} catch (IOException e1) {
			System.out.println("Error found");
		}
	}
}
