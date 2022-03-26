class CMDDemo{
	public static void main(String[] args) {

        int rno=Integer.parseInt(args[0]);
        String name=args[1];
        double cgpa=Double.parseDouble(args[2]);
        char grade=args[3].charAt(0);
        boolean status=Boolean.parseBoolean(args[4]);

        //int sum=a+b;

		System.out.println(rno+"\n"+name+"\n"+cgpa+"\n"+grade+"\n"+status);
	}
}