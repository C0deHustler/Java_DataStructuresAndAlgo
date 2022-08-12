import java.util.*;
public class CondStat_3_Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button){
            case 1 : System.out.println("Salaam");
            break;
            case 2 : System.out.println("Hello");
            break;
            case 3 : System.out.println("Namaste");
            break;
            default: System.out.println("Invalid button is pressed");
        }
    }
}
