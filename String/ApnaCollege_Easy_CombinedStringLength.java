import java.util.*;
// Problem - Take an array of Strings as input from the user & find the cumulative (combined) length of all those strings.
public class ApnaCollege_Easy_CombinedStringLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        String[] array = new String[size];
        int totLength = 0;
        System.out.println("Enter the string elements of the array : ");
        for(int i=0; i<size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
        }
        System.out.println("Length of the combined string : "+totLength);
    }
}
