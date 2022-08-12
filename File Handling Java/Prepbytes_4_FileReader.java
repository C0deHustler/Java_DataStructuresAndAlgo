import java.io.*;
import java.util.Scanner;

public class Prepbytes_4_FileReader {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // mentioning the path of the file in object f
        File f = new File("C:\\File Handling\\Java\\FileWriter Example.txt");
        // Using method-2 of declaring FileReader to mention the file whose data has to be read
        FileReader fr = new FileReader(f);

        // int ele - because char are read and returned in unicode values, so they will be stored in int datatype
        int ele = fr.read();
        while(ele != -1){   // till the time ele doesn't return -1 i.e. null value
            System.out.print((char)ele);    // typecasting unicode value into char datatype
            ele = fr.read();    // then ele will store the next character that will be read
        }

        // Reading data using char[] array
        File g = new File("C:\\File Handling\\Java\\Directory-1\\text1.txt");
        FileReader gr = new FileReader(g);

        char[] ch = new char[(int)g.length()];  // g.length() will return value of long datatype,
        // and long type cannot be the size of an array, so type cast it into int
        gr.read(ch);
        for(char c:ch){
            System.out.print(c);
        }
        System.out.println();



        // this code will print an empty char array because fr has already been read, so nothing new will be printed
        // even if we try to read fr again by using "int ele" method, then also nothing wil be printed, because fr has been already read before,
        // so the 1st value that will be returned to ele will be -1.
        char[] x = new char[(int)f.length()];
        fr.read(x);
        for(char c: x){
            System.out.print(c);
        }
        System.out.println();
    }
}
// Most advanced reader is the BufferedReader
// Most advanced writer is the PrintWriter
