//import java.util.Scanner;

public class StudentDemo{
	
private int rno;
private String name;
private double cgpa;
static String colgName="ASDF";

//setter 
void setStudent(int r, String n, double c){ // local variables

rno=r;
name=n;
cgpa=c;
}

// getter 
void getStudent(){
	System.out.println("Rno: "+rno+"\nName: "+name+"\nCGPA: "+cgpa+"\nCollege :"+colgName);
}

public static void main(String[] args) {
	
   StudentDemo s1=new StudentDemo(); // Student() - constructor - with default vaules - 0, null, 0.0
   
    s1.setStudent(100,"QWERTY",7.7);
    s1.getStudent();
    

}
}