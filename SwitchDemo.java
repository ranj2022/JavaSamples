public class SwitchDemo{

	public static void main(String[] args) {
		
		String color=args[0];

		switch(color.toLowerCase()){ // strings - 1.7

		case "red": System.out.println("Roses are red!");
			        break;

        case "green": System.out.println("Earth is green");
			        break;

        case "blue": System.out.println("Sky is blue");
			        break;

	    default: System.out.println (" Please enter RGB color");
		}
	}
}