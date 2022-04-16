//import java.util.Scanner;
public class Stud{
	
private int rno;  //instance
private String name; //instance ---- object
private double cgpa; // instance

static String colgName="ASDF"; // class - static  - class

public Stud(int rno, String name, double cgpa){ // local variables - stack
this.rno=rno;
this.name=name;
this.cgpa=cgpa;
}

@Override
public String toString(){ // 
	return "Rno: "+rno+"\nName: "+name+"\nCGPA: "+cgpa+"\nCollege :"+colgName;
}

public static void main(String[] args) {
	
  Stud s1=new Stud(111,"ABC",7.9);
  Stud s2=new Stud(101,"XYZ",7.7);
  
  System.out.println(s1);
  System.out.println(s2);
 
}
}