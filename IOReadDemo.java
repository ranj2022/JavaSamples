import java.io.*;

public class IOReadDemo{

	public static void main(String[] args) throws IOException{
		
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter Name, id and cgpa");
    String name=br.readLine();

    int id=Integer.parseInt(br.readLine());

    double cgpa=Double.parseDouble(br.readLine());

    System.out.println(name+" "+id+" "+cgpa);


	}
}