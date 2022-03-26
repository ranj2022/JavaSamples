import java.util.Scanner;

public class ArrayDemo{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in); // creating Scanner object

		System.out.println("Enter the size of the array");
        int size=in.nextInt();

		int[] numbers=new int[size];

		System.out.println("Enter "+size+ "elemenst to the array");
		for(int i=0;i<size;i++){
			numbers[i]=in.nextInt();
		}

		int min=numbers[0];
		int max=numbers[0];

		for(int i=0;i<size;i++){

			if(numbers[i]<min)
				min=numbers[i];

           if(numbers[i]>max)
				max=numbers[i];

		}

        System.out.println("MAXIMUM is "+max+" \n MINIMUM is "+min);
        
        int temp;

        for(int i=0;i<size;i++){
        	for(int j=0;j<size-i-1;j++){
        		if(numbers[j]>numbers[j+1]){
        			temp=numbers[j];
        			numbers[j]=numbers[j+1];
        			numbers[j+1]=temp;
        		}
        	}
        }

        //System.out.println ("SORTED ORDER");
        for(int x:numbers)  // for each
        System.out.println(x);

	}

}