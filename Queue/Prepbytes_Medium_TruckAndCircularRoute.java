import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/9/queues/codingAssignment/GASSTAT
// Problem - https://leetcode.com/problems/gas-station/
// Problem - https://practice.geeksforgeeks.org/problems/circular-tour/1

// Very Important Problem (Watch this video again and again)
// Logic + Code Video Explanation - https://www.youtube.com/watch?v=_gJ3to4RyeQ

public class Prepbytes_Medium_TruckAndCircularRoute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] petrol = new int[n];
        int[] distance = new int[n];
        for(int i=0; i<n; i++){
            petrol[i] = scanner.nextInt();
        }
        for(int i=0; i<n; i++){
            distance[i] = scanner.nextInt();
        }

        int deficit = 0;    // the amount of petrol jo kam padd jayega while going from one station to another
        int balance = 0;    // it will store the cost of going from one station to another i.e. petrol - distance
        int start = 0;  // it will keep track of the index from where we started

        for(int i=0; i<n; i++){
            balance += petrol[i] - distance[i];
            if(balance < 0){
                deficit += balance; // store the amount of petrol jo kamm padd gaya in deficit
                start = i+1;    // jiss index par petrol ki kami padd gayi, ussi ke next index par start aa jayega
                balance = 0;    // reset balance to 0
            }
        }
        // Most optimal step taken to avoid traversing each index 2 times in the worst case scenario
        // instead of again traversing those indexes jaha petrol kamm padd gaya thha, we are directly checking by adding deficit to current balance
        if(deficit + balance >= 0){ // deficit me pehle hi wo amount of petrol hoga jo kamm padd gaya thha
                                    // if sum of deficit and balance is greater than 0, then surely truck can complete 1 full cycle
            System.out.println(start);
        }
        else{
            System.out.println(-1);
        }
    }
}
