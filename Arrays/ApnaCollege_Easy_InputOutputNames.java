import java.util.*;
// Problem - Take an array of names as input from the user and print them on the screen.
public class ApnaCollege_Easy_InputOutputNames {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();

        String[] names = new String[size];

        System.out.println("Enter the list of names :");
        for(int i=0; i<names.length; i++){
             names[i] = sc.next();
        }
        for(int i=0;i<names.length; i++){
            System.out.println("The names no. "+(i+1)+" is :"+names[i]);
        }
    }
}
