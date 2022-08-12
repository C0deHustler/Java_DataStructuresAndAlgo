import java.io.IOException;
import java.io.PrintWriter;

public class Prepbytes_7_PrintWriter {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("C:\\File Handling\\Java\\PrintWriter Example.txt");

        pw.print('H');
        pw.print(23);
        pw.println();
        pw.println(true);
        pw.print("Hello fellas !!!");
        pw.println("God helps a good man.");
        pw.println("So be a good man,");

        pw.flush();
        pw.close();
    }
}
// Most advanced reader is the BufferedReader
// Most advanced writer is the PrintWriter
