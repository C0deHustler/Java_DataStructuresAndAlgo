public class Wipro_Niranjan_FindKey_Niranjan {
    public static int solve(int input1, int input2, int input3){
        int u=0,t=0,h=0,th=0;
        int length = 4;
        while(length!=0){
            if(length == 4) {
                u = maxOfThree(input1%10,input2%10,input3%10) - minOfThree(input1%10,input2%10,input3%10);
            }
            if(length == 3){
                t = maxOfThree(input1%10,input2%10,input3%10) - minOfThree(input1%10,input2%10,input3%10);
            }
            if(length == 2){
                h = maxOfThree(input1%10,input2%10,input3%10) - minOfThree(input1%10,input2%10,input3%10);
            }
            if(length == 1){
                th = maxOfThree(input1%10,input2%10,input3%10) - minOfThree(input1%10,input2%10,input3%10);
            }
            input1/=10;
            input2/=10;
            input3/=10;
            length--;

            String str = "101";
            long x = Long.parseLong(str, 2);
            System.out.println(x);
        }
        return th*1000+h*100+t*10+u;
    }
    static int maxOfThree(int x, int y, int z) {
        return Math.max(z, (Math.max(x, y)));
    }

    static int minOfThree(int a, int b, int c) {
        return (a<b)?(Math.min(a, c)):(Math.min(b, c));
    }

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;

        int ans = solve(input1, input2, input3);
        System.out.println(ans);
    }
}
