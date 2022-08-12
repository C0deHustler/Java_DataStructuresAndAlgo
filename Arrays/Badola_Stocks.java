public class Badola_Stocks {
    public static int solve(int input1, int[] input2){
        int min = Integer.MAX_VALUE;
        int temp = 0;

        for(int i=0; i<input2.length; i++){
            temp += input2[i];
            if(temp < min){
                min = temp;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {-39957, -17136, 35466, 21820, -26711};

        int ans = solve(n, arr);
        System.out.println(ans);
    }
}
