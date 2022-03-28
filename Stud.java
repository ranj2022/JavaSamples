//import java.util.Scanner;

public class Stud{
	
private int rno;
private String name;
private double cgpa;

static String colgName="ASDF";

public Stud(int r, String n, double c){ // local variables
rno=r;
name=n;
cgpa=c;
}

@Override
public String toString(){ // 

	return "Rno: "+rno+"\nName: "+name+"\nCGPA: "+cgpa+"\nCollege :"+colgName;
}

public static void main(String[] args) {
	
  Stud s1=new Stud(111,"ABC",7.9);
  Stud s2=new Stud(101,"XYZ",7.7);
  
  System.out.println(s1); // s1.toString()
  System.out.println(s2);
 
}
}