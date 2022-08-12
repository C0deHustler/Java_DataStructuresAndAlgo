import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prepbytes_6_BufferedReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\File Handling\\Java\\Directory-1\\text2.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
    }
}
// Most advanced reader is the BufferedReader
// Most advanced writer is the PrintWriter
