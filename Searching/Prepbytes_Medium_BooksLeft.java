import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/BOOKS
public class Prepbytes_Medium_BooksLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();   // k is the reading capacity of the reader i.e. maximum chapters
            int[] arr = new int[n];
            for(int i=0; i<n ;i++){
                arr[i] = sc.nextInt();  // No. of chapters in each book
            }

            int remaining = 0;  // books remaining unread in the shelf initially
            // Traversing the bookshelf from the rightmost corner
            for(int i=0; i<n; i++){
                if(arr[i] > k){
                    remaining = n-i;
                    break;
                }
            }
            // Traversing the bookshelf from the leftmost corner
            for(int i=n-1; i>=0; i--){
                if(arr[i] > k){
                    remaining = remaining - ((n-1)-i);
                    break;
                }
            }

        System.out.println(remaining);
        }
    }

