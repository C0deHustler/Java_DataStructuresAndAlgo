import java.util.Arrays;
import java.util.Comparator;
// Problem and Explanation - Prepbytes Video

public class Prepbytes_FractionalKnapsack {
    static class Product{
        float weight;
        float profit;
        float profitByWeight;

        Product(float w, float p){
            weight = w;
            profit = p;
            profitByWeight = p / w;
        }
    }

    public static float fractionalKnapsack(Product[] ratio, float capacity){
        // Sorting the ratio array on the basis of profit/weight
        Arrays.sort(ratio, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                // If we'll use Comparator in its standard format i.e. as used in Prepbytes_SortAccordingToKeys.java, then it will give error,
                // because this is used to compare only "int" datatype, and here we're using "float" datatype, so we need to handle all if-else
                // conditions by ourselves
                if(o1.profitByWeight - o2.profitByWeight > 0){
                    return 1;
                }
                else if(o1.profitByWeight - o2.profitByWeight == 0){
                    return 0;
                }
                else{
                    return -1;
                }
            }
        });

        int flag = 0;   // This flag will keep track whether, 1. Loop is terminated because 100% capacity has been achieved, or
                        // 2. Loop has been terminated because still some capacity is left, but the current weight is greater than
                        // remaining capacity, and thus we need to add a fraction of the profit in our maxProfit
        float maxProfit = 0;
        int i = 0;      // 'i' is declared outside, because value of 'i' will be required when we've to add the fraction of profit in maxProfit

        for(i=ratio.length - 1; i>=0; i--){     // Traversing in reverse, since array is sorted in increasing order, and we need maxProfit,
                                                // which we'll get by iterating the array from last to first element
            float currWeight = ratio[i].weight;
            float currProfit = ratio[i].profit;

            if(capacity > 0 && currWeight <= capacity){     // 1. If we still have some capacity to add more weight AND 2. currWeight is less than
                                                            // current capacity (current capacity because after each iteration, we'll keep updating
                                                            // capacity by subtracting the currentWeight added in the knapsack
                maxProfit += currProfit;
                capacity -= currWeight;
            }
            else{   // it means there is still some space left in knapsack i.e. (capacity != 0), but we need to terminate "for" loop because
                    // the currWeight to be added in knapsack is greater than space left in knapsack
                flag = 1;
                break;
            }
        }

        if(flag == 1){  // capacity != 0, and we want to add more weight i.e. maximise our profit, so we'll add the fraction of the currWeight
                        // such that capacity becomes 0 (i.e. knapsack becomes full), and we get our maxProfit
            maxProfit = maxProfit +  ((capacity / ratio[i].weight) * ratio[i].profit);  // capacity is the amount of space left in knapsack
                                                                                        // (See note pic for better understanding)
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        float capacity = 20;
        float[] weight = {18, 15, 10};
        float[] profit = {25, 24, 15};

        Product[] ratio = new Product[3];
        for(int i=0; i< ratio.length; i++){
            ratio[i] = new Product(weight[i], profit[i]);
        }
        float ans = fractionalKnapsack(ratio, capacity);
        System.out.println(ans);


        float capacity2 = 15;
        float[] weight2 = {1, 3, 5, 4, 1, 3, 3};
        float[] profit2 = {5, 10, 15, 7, 8, 9, 4};

        Product[] ratio2 = new Product[7];
        for(int i=0; i< ratio2.length; i++){
            ratio2[i] = new Product(weight2[i], profit2[i]);
        }
        float ans2 = fractionalKnapsack(ratio2, capacity2);
        System.out.println(ans2);



        float capacity3 = 50;
        float[] weight3 = {10, 20, 30};
        float[] profit3 = {60, 100, 120};

        Product[] ratio3 = new Product[3];
        for(int i=0; i< ratio3.length; i++){
            ratio3[i] = new Product(weight3[i], profit3[i]);
        }
        float ans3 = fractionalKnapsack(ratio3, capacity3);
        System.out.println(ans3);
    }
}
