// Problem - https://leetcode.com/problems/merge-sorted-array/
// A little different method to return answer in LeetCode problem, see that code and input/output also

// Problem - https://takeuforward.org/data-structure/merge-two-sorted-arrays-without-extra-space/

// Explanation - https://www.youtube.com/watch?v=hVl2b3bLzBw&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=5

// Time Complexity: O(log n)
// Space Complexity: O(1)

// Approach - GAP Method

public class Striver_MergeTwoSortedArrays_OptimalApproach {
    public static void swap(int[] arr1, int[] arr2, int x, int y){
        int temp = arr1[x];
        arr1[x] = arr2[y];
        arr2[y] = temp;
    }
    public static void sort(int[] arr1, int[] arr2, int l1, int l2){
        int gap = (int) Math.ceil((double)(l1+l2)/2.0);

        while(gap > 0){
            int ptr1 = 0;
            int ptr2 = gap;

            // Keep traversing until ptr2 reach the end of the combined array
            while(ptr2 < (l1+l2)){
                // if ptr2 lies within arr1 AND we find any element at ptr1 greater than ptr2, then swap
                if(ptr2 < l1 && arr1[ptr1] > arr1[ptr2]){
                    swap(arr1, arr1, ptr1, ptr2);
                }
                // if ptr2 lies within arr2 AND ptr1 lies within arr1 AND ptr1 element of arr1 is greater than ptr2 element of arr2, then swap
                else if(ptr2 >= l1 && ptr1 < l1 && arr1[ptr1] > arr2[ptr2 - l1]){
                    swap(arr1, arr2, ptr1, ptr2 - l1);
                }
                // if ptr2 lies within arr2 AND ptr1 also lies within arr2 AND ptr1 element of arr2 is greater than ptr2 element of arr2, then swap
                else if(ptr2 >= l1 && ptr1 >= l1 && arr2[ptr1 - l1] > arr2[ptr2 - l1]){
                    swap(arr2, arr2, ptr1 - l1, ptr2 - l1);
                }
                // Keep incrementing both pointers
                ptr2++;
                ptr1++;
            }
            // Keep dividing gap by 2 after each iteration, if it becomes 1, then stop
            if(gap == 1){
                gap = 0;
            } else{
                gap = (int) Math.ceil((double) gap / 2.0);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        int l1 = arr1.length;
        int l2 = arr2.length;

        sort(arr1, arr2, l1, l2);

        for(int ele: arr1){
            System.out.print(ele+" ");
        }
        System.out.println();

        for(int ele: arr2){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}

