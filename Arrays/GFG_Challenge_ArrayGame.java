import java.util.Arrays;
import java.util.List;

public class GFG_Challenge_ArrayGame {
    public static void rotateLeft(List<Integer> a){
        int temp;
        // Copy 1st element of array in a temporary variable
        temp = a.get(0);
        // Loop for shifting all elements in the main array by one place
        for(int j=0; j<a.size()-1; j++){
            a.set(j, a.get(j+1));
        }
        // Pasting back that copied element to last position of the main array.
        a.set(a.size()-1, temp);
    }

    public static int solve(int n, int[] arr, int[] brr){
        List ar = Arrays.asList(arr);
        List br = Arrays.asList(brr);
        int count = 0;

        while(!ar.isEmpty() || !br.isEmpty()){
            if(ar.get(0) == br.get(0)){
                count++;
                ar.remove(0);
                br.remove(0);
            }
            else{
                count++;
                rotateLeft(ar);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1, 2, 3};
        int[] brr = {2, 1, 3};


        int ans = solve(n, arr, brr);
        System.out.println(ans);
    }
}
