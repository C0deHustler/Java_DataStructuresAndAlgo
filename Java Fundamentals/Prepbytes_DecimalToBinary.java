import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Prepbytes_DecimalToBinary {
    public static void decToBinary(int n){
        int[] binary = new int[32];

        int i=0;
        while(n > 0){
            binary[i] = n%2;
            n = n/2;
            i++;
        }

        for(int j=i-1; j>=0; j--){
            System.out.print(binary[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        decToBinary(n);
    }
}
