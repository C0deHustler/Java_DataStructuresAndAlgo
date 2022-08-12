import java.util.Arrays;
import java.util.Scanner;
// Problem and explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/video/1c57be9e6b2a478a9522bab3af43aeb6
public class Prepbytes_Medium_PrepbuddyAndRobo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int num = n;
            int count = 0;
            // Finding the number of digits of the number
            while(num != 0){
                count++;
                num = num/10;
            }
            // Declaring an array of size of number of digits in the input number
            int[] arr = new int[count];
            for(int i=0; i<count; i++){
                arr[i] = n%10;
                n = n/10;
            }

            Arrays.sort(arr);   // Sort the array
            int flag = 1;
            for(int i=0; i<count-1; i++){   // i<count-1 to avoid runtime error since we're doing arr[i+1] inside the for loop
                if(arr[i+1] - arr[i] != 1){     // if digits are continuous, then each digit must be increment of its previous digit by 1, e.g. - 4,5,6,7,8 -> 8-7=7-6=6-5=5-4=1
                                                            // so if current-previous != 1, then it's not continuous e.g.- 9-7 != 1
                    flag = 0;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
