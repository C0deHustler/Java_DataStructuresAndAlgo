// Problem - https://takeuforward.org/data-structure/count-the-number-of-subarrays-with-given-xor-k/

public class Striver_CountSubArraysWithXORasK_BruteForce {
    public static int xor(int[] arr, int x){
        int count = 0;

        for(int i=0; i<arr.length; i++){
            int xor = 0;
            for(int j = i; j<arr.length; j++){
                xor = xor ^ arr[j];
                if(xor == x){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 6, 4};
        int B = 6;

        int ans = xor(A, B);
        System.out.println(ans);
    }
}
