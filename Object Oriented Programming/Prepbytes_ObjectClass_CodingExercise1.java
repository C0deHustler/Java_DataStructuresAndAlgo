import java.util.*;

public class Prepbytes_ObjectClass_CodingExercise1 {
    static double areaCircle(){
        System.out.println("Enter the radius of the circle : ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();  
        double area = 3.14*s*s;
        System.out.println(area);
        return area;
    }
    static int areaSquare(){
        System.out.println("Enter the side of the square : ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int area = s*s;
        System.out.println(area);
        return area;
    }
    static int areaRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square : ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of the square : ");
        int b = sc.nextInt();
        int area = 2*(l+b);
        System.out.println(area);
        return area;
    }
    public static void main(String[] args){

        char ch;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a valid operation number from the menu below : \n 1. Calculate the area of circle. \n 2. Calculate the area of square. \n 3. Calculate the area of rectangle.");
            int n = sc.nextInt();

            switch(n) {
                case 1:
                    areaCircle();
                    break;
                case 2:
                    areaSquare();
                    break;
                case 3:
                    areaRectangle();
                    break;
                default:
                    System.out.println("Invalid operation number entered.");
            }
            System.out.println("Do you again want to perform operation : (Y/N)");
            ch = sc.next().charAt(0);
        } while(ch == 'Y' );


    }
}
