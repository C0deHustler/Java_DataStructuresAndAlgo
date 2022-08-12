import java.util.ArrayList;

public class Striver_3Sum_BruteForce {
    public static ArrayList solve(int[] arr, int n){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i=0; i<n-2; i++){

            for(int j=i+1; j<n-1; j++){

                for(int k=j+1; k<n; k++){
                    ArrayList<Integer> temp = new ArrayList<>();

                    if(arr[i] + arr[j] + arr[k] == 0){
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                    }
                    if(temp.size() != 0){
                        result.add(temp);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();
        ans = solve(arr, n);
        System.out.println(ans);
    }
}
