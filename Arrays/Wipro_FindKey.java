// Problem - https://examhelperrr.blogspot.com/2021/10/wipro.html  Question No.4

public class Wipro_FindKey {
    public static int solve(int input1, int input2, int input3){
        return (maxDigit(input1) + maxDigit(input2) + maxDigit(input3)) - (minDigit(input1) + minDigit(input2) + minDigit(input3));
    }
    public static int maxDigit(int n){
        int max = Integer.MIN_VALUE;
        while(n > 0){
            if(max < n%10){
                max = n%10;
            }
            n = n/10;
        }
        return max;
    }
    public static int minDigit(int n){
        int min = Integer.MAX_VALUE;
        while(n > 0){
            if(min > n%10){
                min = n%10;
            }
            n = n/10;
        }
        return min;
    }

    public static void main(String[] args) {
        int n1 = 3521;
        int n2 = 2452;
        int n3 = 1352;

        int ans = solve(n1, n2, n3);
        System.out.println(ans);
        // n1 = 3521 -> max = 5, min = 1
        // n2 = 2452 -> max = 5, min = 2
        // n3 = 1352 -> max = 5, min = 1
        // ans = (5+5+5) - (1+2+1) = 15 - 4 = 11 Ans
    }
}
