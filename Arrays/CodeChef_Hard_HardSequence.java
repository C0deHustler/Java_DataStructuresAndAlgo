import java.util.*;

public class CodeChef_Hard_HardSequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int val = sc.nextInt();
            int[] arr = new int[129];
            int[] visited = new int[256];
            for(int i=0; i<256; i++){
                visited[i] = 0;
            }
            arr[1] = 0;
            for(int i=2; i<129; i++){
                if(visited[arr[i-1]] != 0){
                    arr[i] = (i-1) - visited[arr[i-1]];
                }
                else{
                    arr[i] = 0;
                }
                visited[arr[i-1]] = i-1;
            }
            int count = 0;
            for(int i=1; i<=val; i++){
                if(arr[val] == arr[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
