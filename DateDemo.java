import java.util.Date; // to print date

public class DateDemo{

	public String toString(){
		return "This is overriden toString()..and will not print hashcode";
	}
	
	public static void main(String[] args) {
		
     Date d=new Date();  // new Date();

     System.out.println(d); //d.toString();

     DateDemo dm=new DateDemo();
     System.out.println(dm);// dm.toString();

	}

}
