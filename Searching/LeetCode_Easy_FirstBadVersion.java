// Problem - https://leetcode.com/problems/first-bad-version/
// Explanation - https://www.youtube.com/watch?v=9jpAljXgQ5I

// T.C - O(log n), due to binary search
// S.C - O(1)

public class LeetCode_Easy_FirstBadVersion {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//    public class Solution extends VersionControl {
//        public int firstBadVersion(int n) {
//            int low = 1;
//            int high = n;
//            int firstBadVersion = -1;
//
//            while(low <= high){
//                int mid = low + (high - low)/2;
//
    // if we've found the bad version, then there are 2 possibilities,
    // 1. mid is the first bad version, or
    // 2. first bad version may exist to the left of the mid, so continue the search there
    // 3. if bad version is still not found, then obviously it will exist toward right side of mid (we're searching for the 1st bad version,
    // and we know that all the versions after 1st bad version will also be bad, so point-1 and point-2 are justified if we found any bad version.
    // But in case 1st bad version is still not found, then it's obvious that it lies ahead our current mid, and we need to continue search in right half)

//                if(isBadVersion(mid)){
//                    firstBadVersion = mid;    // 1.
//                    high = mid - 1;   // 2.
//                }
//                else{     // 3.
//                    low = mid + 1;
//                }
//            }
//            return firstBadVersion;
//        }
//    }
}
