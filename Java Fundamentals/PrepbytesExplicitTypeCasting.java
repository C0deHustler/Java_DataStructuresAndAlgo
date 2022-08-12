public class PrepbytesExplicitTypeCasting {
    public static void main(String[] args){
        int i = 11;
        //char ch1 = (char)i + 97;  // not valid
        //System.out.println(ch1);
        char ch = (char)10 + 97;  // valid
        System.out.println(ch);
    }
}
// variable operand literal (Not valid)
// literal operand literal (Valid)
// They both have different functioning