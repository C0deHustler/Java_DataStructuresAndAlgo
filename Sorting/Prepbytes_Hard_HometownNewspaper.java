import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/6/sorting/codingAssignment/NEWS
// Explanation - https://www.prepbytes.com/blog/sorting-interview-programming/hometown-newspaper/
// Use mergeSort Technique, don't directly use Arrays.sort(arr);

public class Prepbytes_Hard_HometownNewspaper {
    public static void merge(int[] arr, int start, int mid, int end){
        int left = mid - start +1;
        int right = end - (mid+1) + 1;

        int[] leftArray = new int[left];
        int[] rightArray = new int[right];

        for(int i=0; i<left; i++){
            leftArray[i] = arr[start+i];
        }
        for(int i=0; i<right; i++){
            rightArray[i] = arr[mid+1 + i];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while(i<left && j<right){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }

        while(i < left){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < right){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start+(end-start)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            String[] news = new String[n];
            int[] priorityHome = new int[999999];
            int[] priorityAway = new int[999999];
            int[] indexing = new int[999999];

            int home = 0;
            int away = 0;

            for(int i=0; i<n; i++){
                news[i] = sc.next();
                int tempPriority = sc.nextInt();
                int tempOrigin = sc.nextInt();

                if(tempOrigin == 1){
                    priorityHome[home++] = tempPriority;
                }
                else{
                    priorityAway[away++] = tempPriority;
                }
                indexing[tempPriority] = i;
            }

            if(home>0){
                mergeSort(priorityHome, 0, home-1);
            }
            if(away>0){
                mergeSort(priorityAway, 0, away-1);

            }

            if(home > 0){
                for(int i=home-1; i>=0; i--){
                    System.out.println(news[indexing[priorityHome[i]]]);
                }
            }
            if(away > 0){
                for(int i=away-1; i>=0; i--){
                    System.out.println(news[indexing[priorityAway[i]]]);
                }
            }
        }
    }
}
