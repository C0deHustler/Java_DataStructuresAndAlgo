import java.util.Scanner;
//        We just need to count ‘(’ and ‘)’ . Keep two variables count and count1 .
//        count : will work on brackets +1 for '(' and -1 for ')'
//        count1 : will store min value of count at each step
//        So for every ‘(’ increment the count by 1 and for ‘)’ decrement the count by 1. Also keep on updating the value of count1 to min( count1 , count ) every time .
//        Now after traversing the entire string , if count1 <-1 then answer will be NO , else YES .

class Prepbytes_Medium_ValidString {
    public static String checkValidString(String s){
        if(s.length() % 2 != 0){
            return "No";
        }
        int count = 0;
        int count1 = Integer.MAX_VALUE;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
                count1 = Math.min(count1, count);
            }
            else{
                count--;
                count1 = Math.min(count1, count);
            }
        }
//        count is keeping the count that whether the brackets are balanced or not, if at any point the count goes to <0 then count1 is updated
//        if count1 < -1 then there are more than one ')' brackets, which cannot be balanced in just 1 move, but they will require more than 1 move
//        to be changed, so it will result in false and count > 0 means there are more opening brackets hence that condition is also not ideal.

        if(count1 < -1){
            return "No";
        }
        else{
            return "Yes";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String str = sc.next();
            String ans = checkValidString(str);
            System.out.println(ans);
        }
    }
}