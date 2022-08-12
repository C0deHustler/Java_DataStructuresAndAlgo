import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prepbytes_8_ReadFromFile_II {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\File Handling\\Java\\Read From File part-1.txt");
        BufferedReader br = new BufferedReader(fr);

        // In the file mentioned in the path, data present in it is also in the same order i.e. int, then double, then string, then an int array
        int val = Integer.parseInt(br.readLine());
        double d = Double.parseDouble(br.readLine());
        String str = br.readLine();

        System.out.println(val+" "+d+" "+str);

        // Taking array as input
        String str1 = br.readLine();    // since the data is stored in string form by the PrintWriter,
                                        // so we will store the array into a String variable
        String[] str2 = str1.trim().split(" ");    // to convert the string into string array,
                                                        // where each character of the string will be stored in each block of the array
                                                        // with the help of using trim and split method
                                                        // trim is used to remove extra white spaces
                                                        // split will split the string whenever a space i.e." " will be encountered
        int[] arr = new int[str2.length];   // making a new int array to store elements of string array in int format
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(str2[i]);
            System.out.print(arr[i]+" ");
        }
    }
}
