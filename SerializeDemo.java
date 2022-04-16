import java.io.*;

class Person implements Serializable{	
String name;
transient int age; // age - not to be serialized 

Person(String name, int age){
	this.name=name;
	this.age=age;
}
void disp(){
	System.out.println(name+" "+age);
}
}

public class SerializeDemo{
	public static void main(String[] args) throws Exception{
    Person p1=new Person("ASDF",30);
    
    //serialization - marshalling - pickling
    FileOutputStream fos=new FileOutputStream("person.ser");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(p1);

    // De-serialization
    FileInputStream fis=new FileInputStream("person.ser");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Person p2=(Person)ois.readObject();

    p1.disp();
    p2.disp();
	}
	}

