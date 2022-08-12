import java.io.*;

public class Prepbytes_Easy_AdityaDanish {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s =br.readLine();
            int A = 0;
            int D = 0;

            for(int i=0; i<n; i++){
                if(s.charAt(i) == 'A'){
                    A++;
                }
                else{
                    D++;
                }
            }
            if(A>D){
                System.out.println("Aditya");
            }
            else if(A<D){
                System.out.println("Danish");
            }
            else{
                System.out.println("AdiDan");
            }
        }

    }
}