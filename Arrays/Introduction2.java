import java.util.*;

public class Introduction2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int marks[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Marks of the student are - "+ marks[i]);  //Case-I (See in notes)
        }
    }
}
