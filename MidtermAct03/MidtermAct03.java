import java.io.*;
import java.util.*;

public class MidtermAct03
{
	public static void main(String [] args) {
		try{
			File Ej = new File("phonebook.txt");
			Scanner scanner = new Scanner(Ej);
			String xdata = "";
		
			while (scanner.hasNext()) {
			    xdata = scanner.next();
			
			    if(xdata.equals("1001-11")) {
				System.out.println("Code Found!");
				System.out.println("code: " +xdata);
				System.out.print("First Name: "+scanner.next());
				System.out.print("Last Name:  "+scanner.next());
				System.out.print("CP No.:  "+scanner.next());
				continue;
			  }
			}
			scanner.close();

		} catch (IOException e) {
		     System.out.println("Error");
		}
	}
}