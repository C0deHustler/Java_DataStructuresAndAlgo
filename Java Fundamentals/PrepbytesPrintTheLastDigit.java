import java.util.*;

class PrepbytesPrintTheLastDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = num%10;
        System.out.println(ans);
    }
}