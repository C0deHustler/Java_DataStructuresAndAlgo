import java.util.*;

public class Prepbytes_Medium_DecreasingOrderString {
    public static void reverseArray(int array[], int start, int end) {
        int temp;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String str = s.toLowerCase();

            int[] arr = new int[str.length()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = 0;
            }

            for (int i = 0; i < arr.length; i++) {
                arr[i] = ((str.charAt(i)) - 97) + 97;
            }
            Arrays.sort(arr);
            reverseArray(arr, 0, (arr.length) - 1);

            char[] ch = new char[arr.length];

            for (int i = 0; i < arr.length; i++) {
                ch[i] = (char)arr[i];
                System.out.print(ch[i]);
            }
            System.out.println();
        }
    }
}

