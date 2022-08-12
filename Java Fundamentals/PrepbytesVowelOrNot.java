import java.util.*;

public class PrepbytesVowelOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char input = sc.next().charAt(0);

//        if( input == 'a' || input =='A' || input == 'e' || input == 'E' || input == 'i' || input == 'I' || input == 'o' || input == 'O' || input == 'u' || input == 'U'){
//            System.out.println(input+" is a vowel.");
//        } else {
//            System.out.println(input+" is not a vowel.");
//        }

//        switch (input) {
//            case 'a' :
//                System.out.println(input+" is a vowel.");
//                break;
//            case 'e' :
//                System.out.println(input+" is a vowel.");
//                break;
//            case 'i' :
//                System.out.println(input+" is a vowel.");
//                break;
//            case 'o' :
//                System.out.println(input+" is a vowel.");
//                break;
//            case 'u' :
//                System.out.println(input+" is a vowel.");
//                break;
//            default :
//                System.out.println(input+" is not a vowel.");
//        }

        switch (input) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println(input+" is a vowel.");
                break;
            default :
                System.out.println(input+" is not a vowel.");
        }
    }
}
