public class PatternDiamond {
    public static void main(String[] args){
        //only n will be given by the user
        int n = 4;
        //upper half
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop -> spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //inner loop -> stars
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        //outer loop
        for(int i=n;i>=1;i--){
            //inner loop -> spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //inner loop -> stars
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
