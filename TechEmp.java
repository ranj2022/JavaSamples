public class TechEmp extends Emp {
	// all the data and methods are available
    // constructors are not available
    int bonus;

    public TechEmp(int eid, String name, double basicPay, int bonus){
     super(eid,name,basicPay); // refers to immedaite parent class constructor
     this.bonus=bonus;
    }

    @Override
	void calSalary(){ // redefining the parent method - overriding 
    	int da=30;
    	int hra=30;
    	double sal=basicPay+basicPay*da/100+basicPay*hra/100+bonus;
    	System.out.println(sal);
    }

    @Override
    void getEmp(){
    	System.out.println(eid+" "+name+" "+basicPay+" "+org+" "+bonus);
    }


  public static void main(String[] args) {
  	
  	TechEmp te1=new TechEmp(111,"ABC",80000,15000);
 
  	te1.calSalary(); // updated salary with bonus
  	te1.getEmp();
  	
  }

}