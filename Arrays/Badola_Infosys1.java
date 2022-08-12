public class Badola_Infosys1 {
    public static long findSum(long n){
        long digit;
        long sum = 0;
        while(n > 0){
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        return sum;
    }

    public static long solve(long a, int b){
        long sum = findSum(a);
        long moves = 0;

        while(sum > b){
            sum = findSum(a + 1);
            a++;
            moves++;
        }
        return moves;
    }

    public static void main(String[] args) {
        long a = 555;
        int b = 10;

        long ans = solve(a, b);
        System.out.println(ans);
    }
}
