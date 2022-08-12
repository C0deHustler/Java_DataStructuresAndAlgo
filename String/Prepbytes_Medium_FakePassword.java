import java.util.Scanner;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/java/week/3/strings/codingAssignment/ROTATETWO
public class Prepbytes_Medium_FakePassword {
    public static int leftRotation(char[] a, String original){
        char temp1;
        for(int i=0; i<2; i++){
            temp1 = a[0];
            for(int j=0; j<a.length-1; j++){
                a[j] = a[j+1];
            }
            a[a.length-1] = temp1;
        }
        String x = new String(a);

        if(x.equals(original)){
            return 1;
        }
        else{
            return -1;
        }
    }

    public static int rightRotation(char[] b, String authentic){
        char temp2;
        for(int i=1; i<=2; i++){
            temp2 = b[b.length-1];
            for(int j=b.length-1; j>0; j--){
                b[j] = b[j-1];
            }
            b[0] = temp2;
        }
        String y = new String(b);

        if(y.equals(authentic)){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String O = sc.next();
            String F = sc.next();

            char[] left = F.toCharArray();
            char[] right = F.toCharArray();

            if(leftRotation(left, O) == 1){
                System.out.println("Yes");
            }
            else if(rightRotation(right, O) == 1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
