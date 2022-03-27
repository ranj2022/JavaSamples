public class Methods{

String name="QWERTY"; // instance

//defining custom method
void findSum(int x, int y){ // instance

          int sum=0;

          for(int i=x;i<=y;i++)
          sum=sum+i;

          System.out.println(sum);
}

	public static void main(String[] args) {

		Methods m=new Methods(); // creating object
		
		 System.out.println(m.name);

		// sum of 1-10
         m.findSum(1,10); // method call

		//sum of 50-60
          m.findSum(50,60);

		// sum of 100 - 110
          
          m.findSum(100,110);

        // 
          m.findSum(1,111);
	}
}