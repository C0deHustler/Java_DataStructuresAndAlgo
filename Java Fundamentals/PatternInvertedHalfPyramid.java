public class PatternInvertedHalfPyramid {
    public static void main(String[] args){
        //only n  will be given by the user
        int n = 4;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
