import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/XOCCUR
public class Prepbytes_Easy_NumberOfOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            char[] arr = new char[n];
            for(int i=0; i<n ;i++){
                arr[i] = sc.next().charAt(0);
            }
            int count = 0;
            for(int i=0; i<n; i++){
                if(arr[i] == 'x'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
