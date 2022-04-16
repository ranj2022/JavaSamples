import java.io.*;

public class ConsoleDemo{

	public static void main(String[] args){
		
   Console c=System.console(); // object ref - c
    
   System.out.println("Enter User Name and Password");

   String uname=c.readLine();
   char[] pwd=c.readPassword();
   

   System.out.println(uname+" "+pwd);


	}
}