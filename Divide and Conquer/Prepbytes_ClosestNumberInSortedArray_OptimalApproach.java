// Problem and Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/13/divide-and-conquer/video/9737739f28434d819c0c813aa70a951e
// T.C - O(log n)
public class Prepbytes_ClosestNumberInSortedArray_OptimalApproach {
    public static int solve(int[] arr, int k){
        // if k exists before starting of the array
        if(k <= arr[0]){
            return 0;
        }
        // if k exists after ending of the array
        if(k >= arr[arr.length - 1]){
            return arr.length - 1;
        }
        // if k exists in between the array, we'll do a binary search of k in the sorted array
        else{
            int start = 0;
            int end = arr.length - 1;

            while(start <= end){
                int mid = start + (end - start)/2;

                if(arr[mid] == k){
                    return mid;
                }
                // See this e.g. reference in the main function
                // e.g. if arr[mid] = 9 and k = 7
                if(arr[mid] > k){
                    // we'll check whether k (i.e. 7) exists between mid and mid-1 index i.e. btw 9 and 6, if not,
                    // then we'll keep searching in the 1st half
                    // we're checking whether 7 is greater than arr[mid-1] i.e. 6
                    if(mid != 0 && k > arr[mid - 1]){   // mid != 0 to avoid ArrayIndexOutOfBoundException
                        int diff1 = arr[mid] - k;  // diff btw 9 and 7
                        int diff2 = k - arr[mid];  // diff btw 7 and 6
                        // the more minimum the difference, the more closer is k to the element
                        if(diff1 < diff2){
                            return mid;
                        }
                        else{
                            return mid - 1;
                        }
                    }
                    // if k is not between arr[mid] and arr[mid-1], then we'll update "end", so that further search can be continued in 1st half
                    else{
                        end = mid - 1;
                    }
                }
                // e.g. if k = 14, arr[mid] = 12
                else if(arr[mid] < k){
                    // we'll check whether k (i.e. 14) exists between mid and mid+1 index i.e. btw 12 and 15, if not,
                    // then we'll keep searching in the 2nd half
                    // we're checking whether k i.e. 14 is less than arr[mid+1] i.e. 15
                    if(mid < arr.length - 1 && k < arr[mid + 1]){   // mid < arr.length to avoid ArrayIndexOutOfBoundException
                        int diff1 = k - arr[mid];  // diff btw  14 and 12
                        int diff2 = arr[mid+1] - k;    // diff btw 15 and 14
                        // the more minimum the difference, the more closer is k to the element
                        if(diff1 < diff2){
                            return mid;
                        }
                        else{
                            return mid + 1;
                        }
                    }
                    // if k is not between arr[mid] and arr[mid+1], then we'll update "start", so that further search can be continued in 2nd half
                    else{
                        start = mid + 1;
                    }
                }
            }
        }
        return 0;   // it means that k does not exist btw the array, but maybe it exists before or after array
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9, 11, 12, 15, 16};
        int k = 7;
        int l = 14;
        int m = 0;
        int n = 18;

        int ans1 = solve(arr, k);
        System.out.println(k+" is closest to "+arr[ans1]);

        int ans2 = solve(arr, l);
        System.out.println(l+" is closest to "+arr[ans2]);

        int ans3 = solve(arr, m);
        System.out.println(m+" is closest to "+arr[ans3]);

        int ans4 = solve(arr, n);
        System.out.println(n+" is closest to "+arr[ans4]);
    }
}
