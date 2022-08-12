// Problem - https://takeuforward.org/data-structure/find-the-duplicate-in-an-array-of-n1-integers/
// Explanation - https://www.youtube.com/watch?v=32Ll35mhWg0&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=2
// T.C - O(n)
// S.C - O(1)

public class Striver_FindDuplicate_OptimalApproach {
    public static int findDuplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[0];
        // must see the video to get the basic grasp of this concept with the help of diagram so that one can easily explain this concept in interview

        // we'll use a linked list cycle method with the help of 2 pointers (tortoise method i.e. slow and fast pointers),
        // slow pointer will move 1 step, while fast pointer will move 2 steps

        // we'll first make a cycle, in that cycle, slow will move 1 step, and fast will move 2 steps until they both collide
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        // once they collide, we'll take our fast pointer, and will place at the 1t element
        // now, we'll not use the tortoise method, and both pointers will simply move ahead by 1 step only
        fast = nums[0];
        // and the point at which both pointers will collide, it will be our duplicate element
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int n = arr.length;

        int ans = findDuplicate(arr);
        System.out.println(ans);

        int answer = findDuplicate(arr);
        System.out.println(answer);
    }
}
