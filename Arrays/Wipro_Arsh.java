public class Wipro_Arsh {
    public static int solve(int input1, int input2, int input3, int input4){
        int ans = 0;

        int evenSum1 = evenSum(input1);
        int evenSum2 = evenSum(input2);
        int evenSum3 = evenSum(input3);
        int EVEN = evenSum1 + evenSum2 + evenSum3;

        int oddSum1 = oddSum(input1);
        int oddSum2 = oddSum(input2);
        int oddSum3 = oddSum(input3);
        int ODD = oddSum1 + oddSum2 + oddSum3;

        if(input4 % 2 == 0){
            ans = EVEN - ODD;
        }
        else{
            ans = ODD - EVEN;
        }
        return ans;
    }

    public static int evenSum(int n){
        int lastDigit = 0;
        int evenDigitSum = 0;

        while(n != 0) {
            lastDigit = n % 10;

            if(lastDigit % 2 == 0) {
                evenDigitSum += lastDigit;
            }
            n = n / 10;
        }
        return evenDigitSum;
    }

    public static int oddSum(int n){
        int lastDigit = 0;
        int oddDigitSum = 0;

        while(n != 0) {
            lastDigit = n % 10;

            if(lastDigit % 2 != 0) {
                oddDigitSum += lastDigit;
            }
            n = n / 10;
        }
        return oddDigitSum;
    }

    public static void main(String[] args) {
        int a = 4413;
        int b = 5816;
        int c = 1780;
        int d = 25;

        int ans = solve(a, b, c, d);
        System.out.println(ans);
    }
}
