import java.util.Scanner;

public class Prepbytes_Medium_DuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            int[] arr = new int[26];

            for(int i=0; i<str.length(); i++){
                arr[str.charAt(i)-97]++;
            }

            int flag = 0;
            for(int i=0; i<arr.length; i++){
                int x = arr[i];
                if(x > 1){
                    flag = 1;
                    System.out.print((char)(i+97)+"="+x+" ");
                }
            }
            if(flag == 0){
                System.out.println(-1);
            }
        }
        System.out.println();
    }
}
