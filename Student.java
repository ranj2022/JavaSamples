import java.util.Scanner;

public class StaticDemo{
	
private int rno;
private String name;
private double cgpa;

static String colgName="ASDF"; // global or common - to class 

public StaticDemo(){
Scanner in=new Scanner(System.in);

System.out.println("Please enter student details - rno, name,cgpa");
rno=in.nextInt();
name=in.next();
cgpa=in.nextDouble();
}


// getter 
void getStudent(){
	System.out.println("Rno: "+rno+"\n Name: "+name+"\n CGPA: "+cgpa+"\nCollege :"+colgName);
}

}