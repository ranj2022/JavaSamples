import java.util.Scanner;

public class StaticDemo{
	
private int rno; //
private String name;
private double cgpa;

static String colgName; // global or common - to class 

static { // class area
colgName="ASDF";
System.out.println("this is static block");
}

public StaticDemo(){
Scanner in=new Scanner(System.in);

System.out.println("Please enter student details - rno, name,cgpa");
rno=in.nextInt();
name=in.next();
cgpa=in.nextDouble();
}

static void changeCollege(){
colgName="QWERTY";
}

// getter 
void getStudent(){
	System.out.println("Rno: "+rno+"\n Name: "+name+"\n CGPA: "+cgpa+"\nCollege :"+colgName);
}

public static void main(String[] args) {
	
	StaticDemo s1=new StaticDemo();
	s1.getStudent();//

    changeCollege(); // static method - without need of object

	s1.getStudent();
}

}