// https://codeforces.com/problemset/problem/466/A

import java.util.*;
import java.lang.*;

public class CodeForces_Medium_CheapTravel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cost = 0;

        if(a<=b/m){
            cost = n*a;
        }
        else{
            cost = (n/m)*b + Math.min( ((n%m)*a), b);
        }

        System.out.println(cost);
    }
}