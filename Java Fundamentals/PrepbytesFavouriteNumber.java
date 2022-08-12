import java.util.*;

public class PrepbytesFavouriteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            int rem, count = 0;
            while(num != 0) {
                rem = num % 10;
                num /= 10;
                if (rem == 5) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
