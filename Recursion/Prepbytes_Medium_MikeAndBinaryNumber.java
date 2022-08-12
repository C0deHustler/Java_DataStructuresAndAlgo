import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/4/recursion/codingAssignment/BINARYNUM
// Explanation - https://www.youtube.com/watch?v=Uo--YqNOo-A
class Prepbytes_Medium_MikeAndBinaryNumber {
    public static void permutation(String str, int zeros, int ones){
        if(zeros == 0){
            for(int i=0; i<ones; i++)
                str = str+"1";
            System.out.print(str+" ");
            return;
        }
        if(ones == 0){
            for(int j=0; j<zeros; j++)
                str = str+"0";
            System.out.print(str+" ");
            return;
        }
        permutation(str+"0", zeros-1, ones);    // Put 0 first in the string to get answer in lexicographically order
        permutation(str+"1", zeros, ones-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int ones = 0;   // smart approach, why need to convert decimal into binary when we need only the count of ones (1's) and zeros (0's).
            int zeros = 0;
            String str = "";
            while(n > 0){
                if(n%2 == 1)
                    ones++;
                else
                    zeros++;
                n = n>>1;   // i.e. n = n/2;
            }
            permutation(str, zeros, ones);
            System.out.println();
        }
    }
}