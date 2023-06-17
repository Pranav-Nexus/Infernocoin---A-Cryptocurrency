package inferno;
import java.util.Scanner;
import java.io.*;
public class MMMAIN {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long lines = 0;
	      try (BufferedReader reader = new BufferedReader(new FileReader("E:/USER1/user1.txt"))) {
	          while (reader.readLine() != null) lines++;
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	      System.out.println(lines);
	      

	  

	}

}
