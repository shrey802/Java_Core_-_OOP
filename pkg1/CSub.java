package pkg1;
import pkg2.*;

public class CSub extends C {
	// so if we want to access protected in subclasses initiate subclasses object and not parent object
	// because the protected vars come through inheritance 
	
	public static void main(String[] args) {
        CSub obj = new CSub();
        System.out.print(obj.protmsg); // Outputs: Hello from C
    }
}
