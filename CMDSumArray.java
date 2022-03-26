public class CMDSumArray{

	public static void main(String[] params) {
      int sum=0;

      for(int i=0;i<params.length;i++){
      	sum=sum+Integer.parseInt(params[i]);
      }

		System.out.println(sum);
	}
}