import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/5/searching/codingAssignment/FOGATH
// Explanation - https://www.prepbytes.com/blog/searching-interview-programming/magical-ropes/

public class Prepbytes_Hard_MagicalRopes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong(); // sum of length of ropes must sum up to x
        long k = sc.nextLong(); // length of selected rope must be greater than or equal to k

        long[] height = new long[(int)n];   // array for storing lengths of ropes
        long[] rate = new long[(int)n]; // array for storing rate of growth of ropes

        for(int i=0; i<n; i++){
            height[i] = sc.nextLong();
        }
        for(int i=0; i<n; i++){
            rate[i] = sc.nextLong();
        }

        long low = 0;
        long high = 1000000000000000000L;
        long minDays = 0;

        while(low<=high){
            long mid = low+(high-low)/2;
            long sum = 0;
            long flag = 0;
            for(int i=0; i<n; i++){
                long lengthOnDay = (mid*rate[i] + height[i]);
                if(lengthOnDay >= k){
                    sum += lengthOnDay;
                    if(sum > x){
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag == 1){
                minDays = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(minDays);
    }
}
