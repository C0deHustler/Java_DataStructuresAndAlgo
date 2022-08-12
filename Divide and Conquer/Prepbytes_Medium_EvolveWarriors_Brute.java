public class Prepbytes_Medium_EvolveWarriors_Brute {
    public static int solve(int warriors, int gems, int costForW, int offer){
        int evolvedW = gems/costForW;
        int gemsLeft = gems % costForW;
        int warriorsLeft = warriors - evolvedW;

        int x = 0;
        while(warriorsLeft != 0){
            warriorsLeft--;
            gemsLeft += offer;

            if(gemsLeft >= costForW && warriorsLeft != 0){
                evolvedW += (gemsLeft/costForW);
                x = gemsLeft / costForW;
                warriorsLeft = warriorsLeft - x;
                gemsLeft = gemsLeft % costForW;
            }
        }
        return evolvedW;
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
    }
}
