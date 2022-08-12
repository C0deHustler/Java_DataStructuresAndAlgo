// Problem - https://www.assignmentexpert.com/homework-answers/programming-and-computer-science/java-jsp-jsf/question-223737

import java.util.Scanner;
public class CISCO_CharlesAndNecklace {
    static int c;

    private static void print(int s, int n, int x, String p) {
        if (x == 0)
            for (int i = s; i <= n; i++) {
                System.out.println(p + i);
                c++;
            }
        else
            for (int i = s; i <= n - x; i++)
                print(i + 1, n, x - 1, p + i + " ");
    }

    public static void main(String[] args) {
        c = 0;
        System.out.print("Enter N : ");
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < n; i++)
            print(1, n, i, "");
        System.out.println("The count is : " + c);
    }
}
