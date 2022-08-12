import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/TRANSPOINT
public class Prepbytes_Easy_TransitionPoint_BruteForceApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int flag = 0;
            int ans = -1;
            for(int i=0; i<n; i++){
                if(arr[i] == 1){
                    flag = 1;
                    ans = i;
                    break;
                }
            }
            if(flag == 1){
                System.out.println(ans);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
