import java.util.*;

class Employee{
    int empId;
    String empName;
    static String companyName = "Prepbytes";    // With the help of static keyword, String companyName will not allocate new memory each time a new object will be created.
                                                                             //This will save memory.
    Employee(int eId, String eName){
        empId = eId;
        empName = eName;
    }
    public void display(){
        System.out.println("Id of the employee is :"+empId);
        System.out.println("Name of the employee is :"+empName);
        System.out.println("Company of the employee is :"+companyName);
    }
}

public class StaticVariable_Practice1 {
    public static void main(String[] args){
        Employee e1 = new Employee(1, "Hamza");
        e1.display();

        Employee e2 = new Employee(2, "Prateek");
        e2.display();
    }
}
