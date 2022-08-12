import java.util.*;
// Problem - Take an array of numbers as input and check if it is an array sorted in ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//       {3, 4, 6, 2} is not sorted in ascending order.
public class ApnaCollege_Easy_AscendingOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //input of size
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        //declaration of array
        int list[] = new int[size];
        //input elements of array
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<list.length; i++){
            list[i] = sc.nextInt();
        }
        //declaring a variable as true
        boolean isAscending = true;
        //checking for the condition of "not ascending"
        for(int i=0; i<list.length-1; i++) {
            if (list[i] > list[i + 1]) {
                isAscending = false;  //if condition satisfies, then make this variable "false"
            }
        }
        if (isAscending) {
            System.out.println("The array is in ascending order.");
        } else {
            System.out.println("The array is not in ascending order.");
        }
    }
}
