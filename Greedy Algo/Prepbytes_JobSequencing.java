import java.util.Arrays;
// Problem - https://practice.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1
// Prepbytes Video and Gallery Pic

public class Prepbytes_JobSequencing {
    static class Job{
        int id;
        int deadline;
        int profit;

        Job(int ID, int DEADLINE, int PROFIT){
            id = ID;
            deadline = DEADLINE;
            profit = PROFIT;
        }
    }

    public static int jobSequencing(Job[] arr) {
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> {
           return b.profit - a.profit;  // Sorting the array in descending order on the basis of profit
        });

        int[] result = new int[n];  // this array will be the timeline which will keep track that which job can be scheduled on which day
        boolean[] slot = new boolean[n];    // this array will keep track whether a day is available for scheduling or not, or it is already occupied
        for(int i=0; i<n; i++){     // traversing through main array

            // j = Math.min of (n-1), because, suppose we've 10 jobs to do, and deadline for one of the job is 50, but if we can do 1 job in 1 day,
            // then why delay this task for 50 days, this shows that for doing 10 jobs, maximum of 10 days are enough.
            // j = Math.min of arr[i].deadline, because, suppose we've 10 jobs to do, and deadline for one of the job is 5, so in this case, 10 days for
            // 10 jobs is of no use, instead we need to consider the deadline
            // So depending upon different cases, in each inner "for" loop, we'll consider minimum of array size (n-1) and deadline (arr[i].deadline)
            // for that particular job
            for(int j = Math.min(n - 1, arr[i].deadline - 1); j >= 0; j--){
                if(!slot[j]){   // if that slot is available
                    result[j] = i;  // then add this job in timeline
                    slot[j] = true; // and update that slot as busy/occupied
                    break;  // if the job has been scheduled at the closest date to deadline, then exit, and set schedule for next job
                }
            }
        }

        int totalProfit = 0;
        System.out.print("Jobs that will be done : ");
        for(int i=0; i<n; i++){
            if(slot[i]){    // if that day has been allotted to a job
                System.out.print("Job" + arr[result[i]].id + " ");
                totalProfit += arr[result[i]].profit;   // add that job profit in the total profit
            }
        }
        System.out.println();
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] id = {1,2,3,4};
        int[] deadline = {3,2,1,1};
        int[] profit = {40,30,20,10};

        Job[] arr = new Job[4];
        for(int i=0; i<arr.length; i++){
            int ID = id[i];
            int DEADLINE = deadline[i];
            int PROFIT = profit[i];

            arr[i] = new Job(ID, DEADLINE, PROFIT);
        }

        int ans = jobSequencing(arr);
        System.out.println("TotalProfit : " + ans);



        int[] id2 = {1,2,3,4};
        int[] deadline2 = {4,1,1,1};
        int[] profit2 = {20,10,40,30};

        Job[] arr2 = new Job[4];
        for(int i=0; i<arr2.length; i++){
            int ID = id2[i];
            int DEADLINE = deadline2[i];
            int PROFIT = profit2[i];

            arr2[i] = new Job(ID, DEADLINE, PROFIT);
        }

        int ans2 = jobSequencing(arr2);
        System.out.println("TotalProfit : " + ans2);
    }
}
