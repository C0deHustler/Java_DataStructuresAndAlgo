import java.util.Arrays;
import java.util.Comparator;
// Problem and Explanation - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/14/greedy-algo/video/fd0862a456054cb484281c551f40af59

public class Prepbytes_SortAccordingToKeys {
    static class Items{
        int firstValue;
        int secondValue;
        int totalValue;

        Items(int fv, int sv){
            firstValue = fv;
            secondValue = sv;
            totalValue = fv + sv;
        }
    }

    public static void main(String[] args) {
        Items[] arr = new Items[5];

        arr[0] = new Items(1, 2);
        arr[1] = new Items(2, 4);
        arr[2] = new Items(3, 1);
        arr[3] = new Items(1, 1);
        arr[4] = new Items(2, 2);

        // Soring on the basis of totalValue
        Arrays.sort(arr, new Comparator<Items>() {
            @Override
            public int compare(Items o1, Items o2) {
                return o1.totalValue - o2.totalValue;   // Sorting done on the basis of totalValue
            }
        });

//        Arrays.sort(arr, (a, b) -> Integer.compare(b[0],a[0]));   // sort a 2D array in decreasing order
//        Arrays.sort(arr, (a, b) -> Integer.compare(a[0],b[0]);    // sort a 2D array in increasing order

        System.out.println("Array is sorted in the basis of totalValue");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i].firstValue+" + "+arr[i].secondValue+" = "+arr[i].totalValue);
            System.out.println();
        }
        System.out.println();


        // sorting on the basis of totalValue, but if any two or more elements will have same totalValue,
        // then sorting will be done on the basis of firstValue
        Arrays.sort(arr, new Comparator<Items>() {
            @Override
            public int compare(Items o1, Items o2) {
                if(o1.totalValue == o2.totalValue){
                    return o1.firstValue - o2.firstValue;
                }
                else{
                    return o1.totalValue - o2.totalValue;
                }
            }
        });

        System.out.println("Array is sorted in the basis of totalValue, and if totalValue is same for some elements, then sorting is done on basis of firstValue : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i].firstValue+" + "+arr[i].secondValue+" = "+arr[i].totalValue);
            System.out.println();
        }
    }
}
