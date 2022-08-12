// Problem - https://takeuforward.org/data-structure/next_permutation-find-next-lexicographically-greater-permutation/
// Explanation - https://www.youtube.com/watch?v=LuLCLgMElus&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=11
// Explanation - see register notes

public class Striver_NextPermutation {
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            swap(arr, start++, end--);
        }
    }
    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void findNextPer(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        int index1 = arr.length - 2;    // we'll compare for arr[index1 + 1], so to avoid runtime error (ArrayIndexOutOfBoundException), we'll
                                        // initialize index1 as the 2nd lst index, not the last index

        // See register notes to understand all cases with dry run

        // Case-1 : we've to find an element arr[i], which is smaller than it's next element arr[i+1]
        while(index1 >= 0 && arr[index1] >= arr[index1 + 1]){
            index1--;   // keep decrementing until we find any such element where arr[i] < arr[i+1]
        }

        // if we do not find any break point, e.g. 54321, there's no element which is smaller than element+1
        // so in such case, we will not do case 2 and case 3 ( see register)
        // instead we'll directly do case-4, so in such case, our index1 will become -1, so we'll not be able to enter into while loop

        if(index1 >= 0){    // so we'll check here for above discussed condition
            int index2 = arr.length - 1;

            // Case-2 : we'll find an element which will be smaller than the arr[index1],
            // so we'll consider arr[index2] as the last element, and start traversing from the back
            while(arr[index1] >= arr[index2]){
                index2--;   // keep decrementing until we find arr[index1] < arr[index2]
            }

            // Case-3 : see register notes
            swap(arr, index1, index2);
        }

        // Case-4
        reverse(arr, index1 + 1, arr.length - 1);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2};
        findNextPer(arr1);

        for(int ele: arr1){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
