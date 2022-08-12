import java.util.*;
// Problem - Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//Example :
//email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
//email = “helloWorld123@gmail.com”; username = “helloWorld123”
public class ApnaCollege_Medium_ExtractUsername {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input the email Id
        System.out.println("Enter the e-mail Id : ");
        String emailId = sc.next();
        // Declaration of empty username String
        String username = "";
        // Main loop
        for(int i=0 ; i<emailId.length(); i++){
            if(emailId.charAt(i) == '@'){
                break;
            } else {
                username += emailId.charAt(i);
            }
        }
        System.out.println("Username : "+username);
    }
}
