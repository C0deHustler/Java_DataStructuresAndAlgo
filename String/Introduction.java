import java.util.*;

public class Introduction {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        //String name = sc.next(); //for input of a single word
        //String sentence = sc.nextLine(); //for input of a full sentence

        //System.out.println("Your entered details are : "+name+" "+sentence);

        //Concatenation
        String firstName = "Ahmad Hamza";
        String lastName = "Khan";
        String fullName = firstName +" "+ lastName; //Concatenation i.e. to add
        System.out.println("Your full name is : "+fullName);

        //To find length of the string
        System.out.println("Length of your string is : "+fullName.length());

        //To print each and every single character of a string
        System.out.println("Each and every character of your string are : ");
        for(int i=0; i<fullName.length(); i++){ // like arrays, in String also, indexing starts from i=0
            System.out.println(fullName.charAt(i));
        }
    }
}
