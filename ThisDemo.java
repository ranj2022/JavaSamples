//import java.util.Scanner;
public class ThisDemo{
	
private int rno;  //instance
private String name; //instance ---- object
private double cgpa; // instance

static String colgName="ASDF"; // class - static  - class

public ThisDemo(int rno, String name, double cgpa){ // local variables - stack
this.rno=rno;
this.name=name;
this.cgpa=cgpa;
}

@Override
public String toString(){ // 
	return "Rno: "+rno+"\nName: "+name+"\nCGPA: "+cgpa+"\nCollege :"+colgName;
}

public static void main(String[] args) {
	
  ThisDemo s1=new ThisDemo(111,"ABC",7.9);
  ThisDemo s2=new ThisDemo(101,"XYZ",7.7);
  
  System.out.println(s1);
  System.out.println(s2);
 
}
}