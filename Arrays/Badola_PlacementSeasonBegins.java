public class Badola_PlacementSeasonBegins {
    public static int[] placement(int input1, int[] input2){
        int[] result = new int[input1];

        result[0] = 0;
        for(int i=1; i<input2.length; i++){
            int count = 0;
            for(int j=0; j<=i; j++){
                if(input2[j] > input2[i]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {4,9,5,3,2,10};

        int[] ans = placement(n, arr);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
        System.out.println();

        int n2 = 5;
        int[] arr2 = {3,4,1,5,2};

        int[] ans2 = placement(n2, arr2);
        for(int ele : ans2){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
