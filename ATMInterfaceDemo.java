interface ATMInterface{ // public 
void withdraw();
void deposit();

}

public class ATMInterfaceDemo implements ATMInterface{

public void withdraw(){
System.out.println("withdrawn...");
}

public void deposit(){
System.out.println("deposited");
}

void display(){
	System.out.println("NCR");
}

public static void main(String[] args) {
	ATMInterface a=new ATMInterfaceDemo();
	a.withdraw();
	a.deposit();

	ATMInterfaceDemo atm=new ATMInterfaceDemo();
	atm.display();
}
}

