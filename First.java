class First{
	public static void main (String[] args) {
	        
	        int x=Integer.parseInt(args[0]);
	        int y=Integer.parseInt(args[1]);	
     
            try{
			System.out.println(x/y);
            }catch(Exception e){
            	System.out.println(e);
            }
			System.out.println("Rest of the code....");



	}
}