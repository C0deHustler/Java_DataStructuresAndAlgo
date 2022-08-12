import java.io.File;
import java.io.IOException;

public class Prepbytes_2_FileClassConstructorsAndMethods {
    public static void main(String[] args) throws IOException {
        // Method-1
        File j = new File("C:\\File Handling\\Java");
        j.mkdir();

        File d1 = new File("C:\\File Handling\\Java\\Directory-1");
        d1.mkdir();

        File d2 = new File("C:\\File Handling\\Java\\Directory-2");
        d2.mkdir();

        // Method-2
        File d1_1 = new File("C:\\File Handling\\Java\\Directory-1", "text1.txt");
        d1_1.createNewFile();

        // Method-3
        File d1_2 = new File(d1,"text2.txt");
        d1_2.createNewFile();

        File d1_3 = new File(d1,"text3.txt");
        d1_3.createNewFile();

        // List() method to print list of all files and folders stored in a particular depository

        // Printing all the files and folders of "Java" Folder
        String str[] = j.list();
        for(String ele: str){
            System.out.println(ele);
        }
        System.out.println();

        // Printing all the files and folders of "Directory-1" Folder
        String str1[] = d1.list();
        for(String ele: str1){
            System.out.println(ele);
        }
        System.out.println();

        // Printing only the files of "Java" folder
        String str2[] = j.list();
        for(String ele: str2){
            File x = new File(j, ele);
            if(x.isFile()){
                System.out.println(ele);
                System.out.println(x.length()); // length of characters in textfile.txt
            }
        }
        System.out.println();

        // Printing only the folders/depositories of "Java" folder
        String str3[] = j.list();
        for(String ele: str3){
            File y = new File(j, ele);
            if(y.isDirectory()){
                System.out.println(ele);
            }
        }
        System.out.println();

        // Deleting a file
        d1_3.delete();
        String str4[] = d1.list();
        for(String ele: str4){
            System.out.println(ele);
        }
        System.out.println();
    }
}
