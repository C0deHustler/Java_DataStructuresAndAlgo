public class PrepbytesIncrementDecrementOperator {
    public static void main(String[] args){
        int x = 5;
        int y = 5;

        int b = ++x;
        System.out.println(x);  //6
        System.out.println(b);  //6

        int c = y++;
        System.out.println(y);  //6
        System.out.println(c);  //5
    }
}
