import java.util.*;

public class Prepbytes_Hard_Pairs_CodeForcesApproach1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[] = new int[m];
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        int x = a[0];
        for(int i=0;i<m;i++){
            if(a[i]==x || b[i]==x){
                continue;
            }
            else{
                if(check(x,a[i],a,b) || check(x,b[i],a,b)){
                    System.out.println("YES");
                    return;
                }
                else if(check(b[0],a[i],a,b) || check(b[0],b[i],a,b)){
                    System.out.println("YES");
                    return;
                }
                else{
                    x = b[0];
                    if(x == a[i]){
                        x = a[i];
                        continue;
                    }
                    else if(x==b[i]){
                        x = b[i];
                        continue;
                    }
                    else{
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        if(check(a[0],-1,a,b) || check(b[0],-1,a,b)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        scanner.close();
    }
    public static boolean check(int x,int y,int a[],int b[]){
        for(int i=0;i<a.length;i++){
            if(a[i]==x || a[i]==y || b[i]==x || b[i]==y){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

}