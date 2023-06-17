package inferno;
import java.util.Scanner;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class TransferConsole {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user id");
		String userid=sc.nextLine();
		System.out.println("Enter the password");
		String pass=sc.nextLine();
		String u1="Pranav",u2="Vageesh",u3="Suryaa",u4="vishal";
		String p1="ph",p2="sks",p3="se",p4="vks";
		int n;
		String src="";
		if((userid.equals(u1)&&pass.equals(p1)))			
		{
			 src="E:/USER1/user1.txt";
			
		}
		else if((userid.equals(u2)&&pass.equals(p2)))			
		{
			 src="E:/USER3/user3.txt";
		}
		else if((userid.equals(u3)&&pass.equals(p3)))			
		{
			 src="E:/USER3/user3.txt";
		}
		else if((userid.equals(u4)&&pass.equals(p4)))			
		{
			 src="E:/USER4/user4.txt";	
		}
		
		
		
		else
		{
			System.out.println("Verify your credentials");
		}
		
		System.out.println("Enter the recepients UID");
		String uid=sc.nextLine();
		System.out.println("Enter amount to transfer");
		int a=sc.nextInt();
		String path="E:/USER";
		String dest=path+uid+"/user"+uid+".txt";
		
		System.out.println(dest);
		
		long lines = 0;
	      try (BufferedReader reader = new BufferedReader(new FileReader(dest))) {
	          while (reader.readLine() != null) lines++;
	      } catch (IOException e) {
	    	  System.out.println("User does not exist");
	    	  
	         
	      }
	      
	      long linessr = 0;
	      try (BufferedReader reader = new BufferedReader(new FileReader(src))) {
	          while (reader.readLine() != null) linessr++;
	      } catch (IOException e) {
	    	  System.out.println("User does not exist");
	         
	      }
	      if(a>linessr)
	      {
	    	  System.out.println("Insufficient balance");
	      }
	      else
	      {
	    	  System.out.println("Doable");
	    	  
	      }
	      BufferedReader reader;

			try {
				File inputFile = new File(src);
		        File tempFile = new File("C:/Users/ragna/Desktop/blocks/temp.txt");
				reader = new BufferedReader(new FileReader(src));
				String line = reader.readLine();
				FileWriter fstream = new FileWriter (dest,true);
				BufferedWriter info = new BufferedWriter(fstream);
				info.write(line);
				info.newLine();
				FileWriter fstreamsrc = new FileWriter ("C:/Users/ragna/Desktop/blocks/temp.txt",true);
				BufferedWriter infosrc = new BufferedWriter(fstreamsrc);

				for(int i=1;i<a;i++)
					{
					line = reader.readLine();
					info.write(line);
					info.newLine();
				}
				while((line = reader.readLine()) != null)
				{
					infosrc.write(line);
					infosrc.newLine();
				}
				
					info.close();
					infosrc.close();
					

				reader.close();
				inputFile.delete();
				tempFile.renameTo(inputFile);
			}
			 catch (IOException e) {
				e.printStackTrace();
			}
			
	
	      
	      

	  

	}

}
