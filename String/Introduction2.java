public class Introduction2 {
    public static void main(String args[]) {
        String string1 = "Hello";
        String string2 = "Hello";

        // For comparison, (.compareTo) function returns 3 options :
        // 1 :- s1 > s2 : +ve value
        // 2 :- s1 == s2 : 0
        // 3 :- s1 < s2 : -ve value

        // Eg. 1 :- Hello and Hello -> 0
        // Eg. 2 :- Hello and Wello -> -ve value because W is greater than H
        // Eg. 3 :- Hello and Cello -> +ve value because H is greater than C
        // Eg. 4 :- aaHello and aaBello -> -ve value since "aa" are common in both but B is greater than H

        if (string1.compareTo(string2) == 0) {
            System.out.println("Both strings are equal.");
        } else if (string1.compareTo(string2) > 0) {
            System.out.println("string1 is greater than string2.");
        } else {
            System.out.println("string2 is greater than string1.");
        }

        // Also
        if (string1 == string2) { // we can also use this method but it can produce error in some cases
            // so we'll use .compareTo method all time
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are NOT equal");
        }

        // Example where (==) will give error
        if (new String("Hamza") == new String("Hamza")) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
        //"Hamza" and "Hamza" are equal but still it will give error because in Java
        // String are object (not regular primitive datatypes)
        // Functioning of both objects and primitive datatype variables is different that we'll study later in next video in String Builder

        // Substring Function
        // .substring(beginning index, ending index)
        // ending index is exclusive(i.e. non-inclusive) which means for index 0 to 4, it will return substring from index 0 to 3.
        String sentence = "My name is Ahmad Hamza Khan"; //indexing starts from i=0
        String name1 = sentence.substring(0, 11);
        String name2 = sentence.substring(11, 22);
        String name3 = sentence.substring(11, 21);
        String name4 = sentence.substring(11); // if the default indexing not mentioned then it will consider till last index by default
        System.out.println("Your substring for name1 : "+name1);
        System.out.println("Your substring for name2 : "+name2);
        System.out.println("Your substring for name3 : "+name3);
        System.out.println("Your substring for name4 : "+name4);
    }
}
