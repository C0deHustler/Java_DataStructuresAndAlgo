//import java.util.*;
//public class Prepbytes_BankManager {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        while(T-- > 0){
//            int N = sc.nextInt();
//            int count = 0;
//            int a = 0;
//            if(N%2 != 0)
//            {
//                count = N;
//                System.out.println(count);
//            }
//            else
//            {
//                while((N%2 == 0) && (N!=2)){
//                    count = count+2;
//                    N = N/2;
//                }
//                if(N==2)
//                {
//                    count = count+2;
//                }
//                else
//                {
//                    count = count+N;
//                }
//                System.out.println(count);
//            }
//        }
//    }
//}

//import java.util.*;
//import java.io.*;
//
//public class Prepbytes_BankManager {
//    public static void main(String args[]) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//
//        while(T-- > 0){
//            int N = sc.nextInt();
//            int count = 0;
//
//            if(N%2 != 0){
//                count = N;
//                System.out.println(count);
//            }
//            else{
//                while((N%2 == 0)  && (N != 2)){
//                    count = count+2;
//                    N = N/2;
//                }
//                if(N==2){
//                    count = count+2;
//                }
//                else{
//                    count = count+N;
//                }
//
//                System.out.println(count);
//            }
//        }
//
//    }
//}

public class Prepbytes_BankManager {
    public int find(int number){
        int res = 0;
        for(int i=2;i<=number;i++){
            while(number%i == 0){ //check if problem can be broken into smaller problem
                res+= i; //if yes then add no of smaller problems to result. If number = 25  i = 5 then 5*5 = 25 so add 5 to results
                number=number/i; // create smaller problem
            }
            System.out.println(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Prepbytes_BankManager m = new Prepbytes_BankManager();
        int n = 30;
        System.out.println("Minimum Operations: " + m.find(n));

    }
}