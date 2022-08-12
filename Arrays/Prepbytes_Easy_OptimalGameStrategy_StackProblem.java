import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/8/stacks/codingAssignment/OPLGMSTG

// This a problem of stack, but the problem can also be solved using arrays.
public class Prepbytes_Easy_OptimalGameStrategy_StackProblem {
    public static void reverseArray(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ay = new int[n+1];
        ay[0] = 0;
        for(int i=1; i<n+1; i++){
            ay[i] = sc.nextInt();
        }

        int[] ax = new int[n+1];
        ax[0] = 0;
        for(int i=1; i<n+1; i++){
            ax[i] = ay[i];
        }
        reverseArray(ax,1, n);

        int topy = ay[n];
        int indy = n;
        int topx = ax[n];
        int indx = n;

        while(indy >= 1 && indx >= 1 ){
            if(topx > topy){
                System.out.print(1+" ");
                indy--;
                topy = ay[indy];
            }
            else if(topy > topx){
                System.out.print(2+" ");
                indx--;
                topx = ax[indx];
            }
            else if(topx == topy){
                System.out.print(0+" ");
                indx--;
                indy--;
                topx = ax[indx];
                topy = ay[indy];
            }
        }
    }
}