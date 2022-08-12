import java.util.*;

public class Prepbytes_BoxesAndToys {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counter = 0;
        while(N-- >0){
            int t = sc.nextInt();
            int c = sc.nextInt();

            if(c-t >1){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
