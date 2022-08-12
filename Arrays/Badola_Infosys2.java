public class Badola_Infosys2 {
    public static int solve(String str, int k){
        int n = str.length();
        int maxLen = 0;

        for(int i=0; i<(n-k)+1; i++){
            char[] arr = str.toCharArray();
            int len = 0;

            int j = i;
            int count = 0;
            while(count != k){
                if(arr[j] == '0'){
                    arr[j] = '1';
                }
                j++;
                count++;
            }
            for (char c : arr) {
                if (c == '0') {
                    break;
                }
                len++;
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "11111";
        int k = 2;
        int ans = solve(str, k);
        System.out.println(ans);

        String str1 = "100001";
        int k1 = 3;
        int ans1 = solve(str1, k1);
        System.out.println(ans1);

        String str2 = "1010100010010001";
        int k2 = 5;
        int ans2 = solve(str2, k2);
        System.out.println(ans2);
    }
}