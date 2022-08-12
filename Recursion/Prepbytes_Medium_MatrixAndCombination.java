import java.util.Scanner;
// Problem - https://mycode.prepbytes.com/problems/recursion/MATCOMB
// Explanation - Live Session of Sorting
// Decision Tree - in notes register, after Infix to Postfix Conversion section
// Complete dry run - in notes register, after Infix to Postfix Conversion section
public class Prepbytes_Medium_MatrixAndCombination {

    static int m;   // number of rows
    static int n;   // number of columns

    public static void function(char[][] arr, int rows, String str){    // we'll pass only number of rows only (not the number of columns) because,
//                Rule 1 − Every combination starts from the first row of the matrix and proceeds downwards. He may switch columns though.
//                Rule 2 − Every combination should have characters equal to the number of rows.
//                Rule 3 − A combination can't have an element from the same row present twice.
                // Number of rows are a dominating factor here.

        if(rows == m){
            System.out.print(str+" ");
            return;
        }

        // Through each recursive call, firstly,  we'll be able to access the leftmost element (i.e. 1st element of each row)
        // and with the help of for loop, we'll be able to access each element present in that particular row
        for(int i=0; i<n; i++){ // i<n since we'll access each element present in each row
            function(arr, rows+1, str + arr[rows][i]);      // with each recursive call, we'll add the accessed element
                                                                    // i.e. (arr[rows][i]) of the matrix in the string
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();   // number of rows
        n = sc.nextInt();   // number of columns
        char[][] arr = new char[m][n];  // character matrix of m * n
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.next().charAt(0);
            }
        }
        String str = "";    // empty string which will hold the output

        function(arr, 0, str);
    }
}
