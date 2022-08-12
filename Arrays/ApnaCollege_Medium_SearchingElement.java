import java.util.*;

public class ApnaCollege_Medium_SearchingElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking size of the array as input from user
        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();

        // Declaration  of array
        int number[] = new int[size];

        // Input values of array
        System.out.println("Enter any "+size+" elements of array");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        // Taking the value of 'x' i.e. the element to be searched
        System.out.println("Enter the element to be searched :");
        int x = sc.nextInt();

        // Searching and then printing output
        for(int i=0; i<number.length; i++){
            if(number[i] == x){
                System.out.println("The index at which we found your element is : "+i);
            }
        }
    }
}
