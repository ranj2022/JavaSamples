abstract class ATM{
abstract void withdraw();
abstract void deposit();

void display(){  // concrete
System.out.println("NCR");
}

}

public class ATMDemo extends ATM{

void withdraw(){
System.out.println("withdrawn...");
}
@Override
void deposit(){
System.out.println("deposited");
}

public static void main(String[] args) {
	ATM a=new ATMDemo();
	a.withdraw();
	a.deposit();
	a.display();
}
}

