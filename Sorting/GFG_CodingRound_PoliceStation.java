import java.util.*;

public class GFG_CodingRound_PoliceStation {
    public static int solve(int N, int a, int[] x){
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Math.abs(a - x[i]);
        }

        Arrays.sort(arr);
        return arr[N-1] + arr[N-2];
    }
    public static void main(String[] args) {
        int N = 4;
        int a = 2;
        int[] x = {10, 4, 2, 17};

        int ans = solve(N, a, x);
        System.out.println(ans);
    }
}
