import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/BOXES

public class Prepbytes_Hard_MaximizeTheBoxes_BruteForceApproach {
    public static void maximize(int a, int b, int c){
        int count = 0;
        if(a == 0 || b == 0){
            System.out.println(count);
            return;
        }
        while(a!=0 && b!=0){
            if(a>0 && b>0 && c>0){
                a--; b--; c--;
                count++;
            }
            else if(a>b && a>1){    // a>b to get maximum answer
                                    // (4, 8, 1) -> a=4, b=8, c=1, Ans = 4
                                    // Ans(if a>b condition not used = 3)
                                    // Ans(if a>b condition is used = 4)
                a=a-2; b--;
                count++;
            }
            else if(b>a && b>1){    // b>a to get maximum answer
                                    // (4, 8, 1) -> a=4, b=8, c=1, Ans = 4
                                    // Ans(if b>a condition not used = 3)
                                    // Ans(if b>a condition is used = 4)
                b=b-2; a--;
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            maximize(a, b, c);
        }
    }
}
