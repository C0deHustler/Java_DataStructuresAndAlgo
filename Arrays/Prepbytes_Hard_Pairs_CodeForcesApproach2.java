import java.util.Scanner;

public class Prepbytes_Hard_Pairs_CodeForcesApproach2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        if (m <= 2) {
            System.out.println("YES");
        } else {
            int[] a = new int[m];
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                int x = in.nextInt();
                int y = in.nextInt();

                a[i] = x;
                b[i] = y;
            }

            int cnt1 = 0;
            int cnt2 = 0;
            int max1 = 0;
            int max2 = 0;
            int[] map1 = new int[300005];
            int[] map2 = new int[300005];
            for (int i = 1; i < m; i++) {
                if (a[i] == a[0] || b[i] == a[0]) {
                    cnt1++;
                } else {
                    map1[a[i]]++;
                    map1[b[i]]++;
                    max1 = Math.max(max1, Math.max(map1[a[i]], map1[b[i]]));
                }

                if (a[i] == b[0] || b[i] == b[0]) {
                    cnt2++;
                } else {
                    map2[a[i]]++;
                    map2[b[i]]++;
                    max2 = Math.max(max2, Math.max(map2[a[i]], map2[b[i]]));
                }
            }
            if (cnt1 + max1 == m - 1 || cnt2 + max2 == m - 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}