import java.util.*;

public class Introduction3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //Input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        //Output
        for(int i=0; i<size; i++){
            System.out.println("Marks of the student are - "+numbers[i]);
        }
    }
}
