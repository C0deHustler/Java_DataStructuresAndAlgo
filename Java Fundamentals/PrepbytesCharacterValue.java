import java.util.*;

public class PrepbytesCharacterValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char x  = sc.next().charAt(0);

        if(x == 'p' || x == 'P'){
            System.out.println("Prepbytes");
        }
        else if(x == 'z' || x == 'Z'){
            System.out.println("Zenith");
        }
        else if(x == 'e' || x == 'E'){
            System.out.println("Expert Coder");
        }
        else if(x == 'd' || x == 'D'){
            System.out.println("Data Structures");
        }
    }
}
