package inferno;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class validation {

	public validation(String user, String password) {
		try {
			File file_u = new File("C:\\Users\\ragna\\Desktop\\blocks\\username.txt");
			File file_p = new File("C:\\Users\\ragna\\Desktop\\blocks\\Password.txt");

			
			Scanner sc = new Scanner(file_u);
			Scanner sc1 = new Scanner(file_p);
	

				String u = "", p = "";
				int i = 0, j = 0;
				while (sc.hasNextLine()) {
					i = 0;
					u = sc.nextLine();
					if (u.equals(user)) {
						i = 1;
						break;
					}
				}

				while (sc1.hasNextLine()) {
					j = 0;
					p = sc1.nextLine();
					if (p.equals(password)) {
						j = 1;
						break;
					}
				}

				if (i == 1 && j == 1) {
					System.out.println("Successfully Logged In!! ");
					main_frame mf = new main_frame(user);
				}
				
				else {
					System.out.println("Invalid Credentials!!");
				}

			}


		catch (IOException e1) {
			System.out.println("Error found");
		}

	}

}
