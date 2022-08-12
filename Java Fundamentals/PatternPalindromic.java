public class PatternPalindromic {
    public static void main(String[] args){
        //only n will be given by the user
        int n = 5;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop -> spaces print
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //inner loop -> 1st half numbers
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            //inner loop -> 2nd half
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
