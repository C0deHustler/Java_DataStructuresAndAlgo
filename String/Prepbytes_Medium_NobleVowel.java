import java.util.*;
import java.io.*;

public class Prepbytes_Medium_NobleVowel {
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String str = s.toLowerCase();   //if upper case input, then converting it to lower case
            char[] ch = str.toCharArray();  //making a char array of input string
            int flag = 1;
            int i;  // declaring i outside the for loop, because after all iterations, value of i will become the last index of the string, and we need this last value if i to compare ahead,
                     // see the further code to understand

            for (i = 0; i < (str.length()) - 1; i++) {  // i < str.length() -1, because 1st we're checking for ith elements, then for (i+1)th elements, so no need to go till last index
                                                                        // because (i+1)th concept will automatically help us to get there
                if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u' && ch[i] != 'n') { // Making sure that the 1st or ith element of our array is not a vowel or consonant 'n',
                                                                                                                                                             // if yes, then go ahead
                    // ch[i] != 'n' because we need to test one last case mentioned in the problem :-
                    //The only exception is a consonant 'n', after this letter, there can be any letter (not only a vowel) or there can be no letter at all.

                    if (ch[i + 1] != 'a' && ch[i + 1] != 'e' && ch[i + 1] != 'i' && ch[i + 1] != 'o' && ch[i + 1] != 'u') { // Making sure that the 2nd or (i+1)th element of our array is not a vowel,
                                                                                                                                                                     // if yes, then go ahead
                        flag = 0;   // since our ith and (i+1)th character is a consonant, then definitely our string is not a Noble Vowel String
                                         // sine we've used AND condition everywhere, so we're making sure that we will make our flag=0(i.e. declare a non Noble Vowel String),
                                        // only if a consonant exist at ith and (i+1)th element
                        break;  // not a Noble Vowel String, so break here.
                    }
                }
            }   // end of for loop here
            // at this point if flag is still equal to 1, then it is a Nobel Vowel String, but we need to test one last case mentioned in the problem :-

            // now value of i has become equal to value of index of last character of the string
            // The extra condition is we have to check for the last character as vowel or ‘n’.
            // i == str.length()-1 because our for loop is iterating till i=str.length()-2 in 1st "if" condition,
            // this shows that when our for loop will finally end,
            // due to 1st "if" :- i will be equal to 2nd last element of char array, then due to 2nd "if" :- i will be equal to last element of char array
            // so now value if i is equal to last element, so now we will check that
            if (i == str.length() - 1 && (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'n')) {  // remember the proper use of && and ||, like we used here.

                flag = 1;   // This exceptional case also handled so YES
            } else {
                flag = 0;   // NO
            }

            if (flag == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
