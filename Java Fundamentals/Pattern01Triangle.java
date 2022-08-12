public class Pattern01Triangle {
    public static void main(String[] args){
        //n will be given by the user
        int n = 5;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){   //Important logic
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
