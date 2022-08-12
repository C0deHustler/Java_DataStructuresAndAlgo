public class Prepbytes_Medium_EvolveWarriors_Optimal {

    public static int solve(int warriors, int gems, int cost, int offer){
        int low = 0;    // least we can evolve 0 warriors
        int high = warriors;    // at max, we can evolve all warriors

        int ans = 0;
        while(low < high){

            int mid = (1 + low + high)/2;   //  mid is the numbers of warriors selected to be evolved

            int gemsRequired = mid * cost;  // gems required for evolving "mid" warriors
            int warriorsLeft = warriors - mid;  // warriors left after selecting "mid" warriors from total warriors
            int gemsFromOffer = warriorsLeft * offer;   // gems gained by exchanging remaining warriors as per offer available
            int gemsAvailable = gems + gemsFromOffer;   // total gems finally available for evolving warriors

            if(gemsAvailable >= gemsRequired){
                low = mid;  // we've enough gems, so we can move in right half to select more warriors for evolving i.e. bigger value for "mid"
                ans = low;  // storing current ans, in case moving to the right half turns out to be of no use
            }
            else{
                high = mid - 1; // we've lesser gems, so we need to move in left half to select lesser warriors for evolving i.e. smaller value for "mid"
                ans = high; // storing current ans, in case moving to the left half turns out to be of no use
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 10;
        int x = 4;
        int y = 2;
        int ans = solve(n, m, x, y);
        System.out.println(ans);

        int n2 = 15;
        int m2 = 37;
        int x2 = 17;
        int y2 = 26;
        int ans2 = solve(n2, m2, x2, y2);
        System.out.println(ans2);

        int n3 = 5;
        int m3 = 3;
        int x3 = 7;
        int y3 = 9;
        int ans3 = solve(n3, m3, x3, y3);
        System.out.println(ans3);

        int n4 = 73929;
        int m4 = 433244;
        int x4 = 434;
        int y4 = 834;
        int ans4 = solve(n4, m4, x4, y4);
        System.out.println(ans4);

        int n5 = 4328;
        int m5 = 3484832;
        int x5 = 793;
        int y5 = 432;
        int ans5 = solve(n5, m5, x5, y5);
        System.out.println(ans5);
    }
}
