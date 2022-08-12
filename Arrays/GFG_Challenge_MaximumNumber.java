// Problem - https://practice.geeksforgeeks.org/contest/the-easiest-ever-coding-challenge-3/problems#

public class GFG_Challenge_MaximumNumber {
    public static int solve(int num){
        String str = String.valueOf(num);
        char[] arr = new char[str.length()];

        for(int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i);
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == '7'){
                arr[i] = '9';
                break;
            }
        }
        String result = String.valueOf(arr);
        int x = Integer.parseInt(result);
        return x;
    }

    public static void main(String[] args) {
        int n = 9779;

        int ans = solve(n);
        System.out.println(ans);
    }
}
