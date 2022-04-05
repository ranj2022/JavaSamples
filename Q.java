package mypack.subpack;

import mypack.P; //

public class Q{

static String name="Java";

public void sayHello(){
System.out.println("Hello "+name);
}

public static void main(String[] args) {
	
	Q q1=new Q();
	q1.sayHello();

	P p1=new P();
	p1.sayHi();
}

}

// javac -d . P.java