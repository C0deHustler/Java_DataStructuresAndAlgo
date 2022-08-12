public class PatternButterfly {
    public static void main(String[] args){
        //only n will be given by the user
        int n = 4;
        //upper half
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop -> 1st half star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //inner loop -> spaces print
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            //inner loop -> 2nd half star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        //outer loop
        for(int i=n;i>=1;i--){
            //inner loop -> 1st half star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //inner loop -> spaces print
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            //inner loop -> 2nd half star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
