import java.io.File;
import java.io.IOException;

public class Prepbytes_1_FileCreating {
    public static void main(String[] args) throws IOException {
        // Creating new file
        File f = new File("C:\\File Handling\\Java\\textfile.txt");
        System.out.println(f.exists()); // this will give false when we will run this code before writing "f.createNewFile();"
                                        // but once we will write that, it will give true
        f.createNewFile();  // new file created in the path mentioned in the "new File("...\\...\\...\\...");"
        System.out.println(f.exists()); // now it will return true

        // Creating new folder(depository)
        File k = new File("C:\\File Handling\\Java\\Directory-1");
        System.out.println(k.exists());
        k.mkdir();
        System.out.println(k.exists());
    }
}
