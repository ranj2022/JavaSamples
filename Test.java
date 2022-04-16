public class Test{
	
	public static void main(String[] args) {
		
     A a1=new A(10,"ABC"); // A() - constructor
     A a2=new A(11,"XYZ");
     a1.getA();
     a2.getA();

     A a3=new A(); //default
     a3.getA(); // 0 null

	}
}