import java.io.*;

public class Prepbytes_5_BufferedWriter {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\File Handling\\Java\\BufferedWriter Example.txt");
        f.createNewFile();

        FileWriter fr = new FileWriter(f);
        BufferedWriter br = new BufferedWriter(fr);

        br.write('H');
        br.write('i');
        br.newLine();
        br.write(120);
        br.newLine();
        br.write("My name is Ahmad Hamza Khan.");
        br.newLine();
        char[] ch = {'x', 'y', 'z'};
        br.write(ch);

        br.flush();
        br.close();
    }
}
// Most advanced reader is the BufferedReader
// Most advanced writer is the PrintWriter
