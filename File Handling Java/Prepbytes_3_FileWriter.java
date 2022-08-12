import java.io.FileWriter;
import java.io.IOException;

public class Prepbytes_3_FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\File Handling\\Java\\FileWriter Example.txt",true);// by using true, instead of over writing the data,
                                                                                                                // new data will be appended
        fw.write(65);
        fw.write(108);
        fw.write(108);
        fw.write("\n");

        fw.write("of you must be doing fine"+"\n");

        char[] ch = {'x', 'y', 'z'};
        fw.write(ch);
        fw.write("\n");

        fw.flush();
        fw.close();
    }
}
// Most advanced reader is the BufferedReader
// Most advanced writer is the PrintWriter
