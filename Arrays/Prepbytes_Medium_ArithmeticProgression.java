import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/ARITHPRO
public class Prepbytes_Medium_ArithmeticProgression {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] visitCount = new int[100001];
        for(int i=0; i<100001; i++){
            visitCount[i] = 0;
        }
        int[] commonDiff = new int[100001];
        for(int i=0; i<100001; i++){
            commonDiff[i] = 0;
        }
        int[] prevIndex = new int[100001];
        for(int i=0; i<100001; i++) {
            prevIndex[i] = 0;
        }

        for(int i=0; i<n; i++){
            if(visitCount[arr[i]] == -2) {
                continue;
            }
            visitCount[arr[i]]++;

            if (visitCount[arr[i]] == 2) {
                commonDiff[arr[i]] = (i - prevIndex[arr[i]]);
            }

            else if(visitCount[arr[i]] > 2){
                if(i - prevIndex[ arr[i]]  != commonDiff[arr[i] ]){
                    visitCount[ arr[i] ] = -2;
                    continue;
                }
            }
            prevIndex[ arr[i] ] = i;
        }

        int count=0;
        for(int i=0; i<100001; i++){
            if(visitCount[i] > 0){
                count++;
            }
        }
        System.out.println(count);

        for(int i=0; i<100001; i++){
            if(visitCount[i] > 0){
                System.out.println(i+" "+commonDiff[i]);
            }
        }
    }
}
