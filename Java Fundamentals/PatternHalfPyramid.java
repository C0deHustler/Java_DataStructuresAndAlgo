public class PatternHalfPyramid {
    public static void main(String[] args){
        //only n will be given by the user
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
