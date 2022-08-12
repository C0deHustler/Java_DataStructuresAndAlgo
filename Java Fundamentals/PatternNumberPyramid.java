public class PatternNumberPyramid {
    public static void main(String[] args){
        //only n will be given by the user
        int n = 5;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop -> spaces print
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            //inner loop -> numbers print
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
