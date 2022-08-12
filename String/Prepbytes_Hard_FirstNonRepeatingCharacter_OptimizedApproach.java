import java.util.*;

public class Prepbytes_Hard_FirstNonRepeatingCharacter_OptimizedApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[26];   // freq array for storing count of each character in the main string
        int flag = 0;

        // Most important logic part for this question, remember this concept for applying on such type of questions
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)-97]++;   // here, we are calculating the count of each character in the freq array
        }

        for(int i=0; i<str.length(); i++){  //we wll not iterate freq array, instead we will iterate  str (exception case explained in notes)
            if(freq[str.charAt(i)-97] == 1){    //this wil print the first character in the string having frequency == 1
                flag = 1;
                System.out.println(str.charAt(i));
                break;
            }
        }
        if(flag == 0){
            System.out.println(-1);
        }
    }
}