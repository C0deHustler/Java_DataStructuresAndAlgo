public class Prepbytes_Medium_FirstNonRepeatingCharacter_IndexMethod {
    public static void main(String args[]) {

        String s ="bcadbcae";

        for(char i :s.toCharArray()){    // ???
            if ( s.indexOf(i) == s.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: "+i);
                break;
            }
        }
    }
}
