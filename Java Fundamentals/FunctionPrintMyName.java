import java.util.*;
public class FunctionPrintMyName {
    //function for printing the name
    public static void printMyName(String name){
        System.out.println("Your name is "+name);
        return;  //only return since returnType is 'void'
    }
    //main function
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printMyName(name); //calling for function
    }
}
