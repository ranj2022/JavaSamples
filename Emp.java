class Emp{
	
    protected int eid;
	protected String name;
	protected double basicPay;
    static String org="Apple";

    void setEmp(int eid, String name, double basicPay){
    	this.eid=eid;
    	this.name=name;
    	this.basicPay=basicPay;
    }

    void calSalary(){
    	int da=30;
    	int hra=30;
    	double sal=basicPay+basicPay*da/100+basicPay*hra/100;
    	System.out.println(sal);
    }

    void getEmp(){
    	System.out.println(eid+" "+name+" "+basicPay+" "+org);
    }

    public static void main(String[] args) {
    	Emp e1=new Emp();
    	e1.setEmp(123,"ASDF",75000);
    	e1.calSalary();
    	e1.getEmp();
    }
}