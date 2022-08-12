import java.util.*;
// Problem - Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
//Example :
//Original = “eabcdef’ ; result = “iabcdif”
//Original = “xyz” ; result = “xyz”

public class ApnaCollege_Easy_ReplaceEwithI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            String a = sc.next();
            // Declaring an empty string
            String result = "";
            // Loop for comparing swapping 'e' with 'i'
            for(int i=0; i<a.length(); i++){
                if(a.charAt(i) == 'e'){
                    result += 'i';
                } else {
                    result += a.charAt(i);
                }
            }
        System.out.println("The new swapped String : "+result);
    }
}
