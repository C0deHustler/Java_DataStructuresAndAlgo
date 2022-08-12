import java.io.IOException;
import java.io.PrintWriter;

public class Prepbytes_8_ReadFromFile_I {
    public static void main(String[] args)  throws IOException {
        PrintWriter pw = new PrintWriter("C:\\File Handling\\Java\\Read From File part-1.txt");

        pw.println(13579);
        pw.println(234.5432);
        pw.println("Good morning to al of you.");
        for(int i=0; i<5; i++){
            pw.print(i+" ");
        }
        pw.flush();
        pw.close();
    }
}
