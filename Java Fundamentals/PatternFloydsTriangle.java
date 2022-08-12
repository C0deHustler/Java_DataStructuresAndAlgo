public class PatternFloydsTriangle {
    public static void main(String[] args){
        //only n will be given by the user
        int n = 5;
        int number = 1;    // Important
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
