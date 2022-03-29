public class Y extends X{

	//p, q
	//setX(), getX()

     int r;

     void setY(int r){
     	this.r=r;
     }

     void getY(){
     	System.out.println(r);
     }
	public static void main(String[] args) {
		
		Y y1=new Y();
		y1.setX(11,21);
		y1.getX();

		y1.setY(99);
		y1.getY();
	}
}