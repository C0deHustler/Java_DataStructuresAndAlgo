import java.util.*;
// Declaration of a class
class Mobile{
    // Instance variable
    String brandName;
    String color;
    // Default Constructor
    Mobile(){
        brandName = "Samsung";
        color = "Black";
    }
    // Parameterized/User-Defined Constructor
    Mobile(String brand, String col){
        brandName = brand;
        color = col;
    }
    // Method for Calling
    public void call(){
        System.out.println("Calling");
    }
    // Method for Messaging
    public void message(){
        System.out.println("Messaging");
    }
}

public class Constuctor_Practice1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Creating an object 'm1'
        Mobile m1 = new Mobile();   // object created through default constructor
        m1.call();
        m1.message();
        System.out.println("Brand of the mobile 1 : "+m1.brandName);
        System.out.println("Color of the mobile 1 : "+m1.color);

        Mobile m2 = new Mobile("iPhone", "Pink");   // object created through parameterized constructor
        m1.call();
        m1.message();
        System.out.println("Brand of the mobile 1 : "+m2.brandName);
        System.out.println("Color of the mobile 1 : "+m2.color);
    }
}
