import java.util.Scanner;

public class Prepbytes_Medium_ChatursExamPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            char[] ch = str.toCharArray();
            int[] arr = new int[str.length()];
            for(int i=0; i<arr.length; i++){
                arr[i] = ch[i];
            }

            int s = 0;
            int e = arr.length-1;
            int count = 0;

            for(int i=0; i<arr.length/2; i++){
                int min = Math.min(arr[s], arr[e]);
                while(arr[s] != min || arr[e] != min) {
                    if(arr[s] > arr[e]){
                        arr[s]--;
                        count++;
                    }
                    else{
                        arr[e]--;
                        count++;
                    }
                }
                s++;
                e--;
            }
            System.out.println(count);
        }
    }
}
