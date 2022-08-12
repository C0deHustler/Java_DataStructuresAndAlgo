import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prepbytes_Easy_SplitMethod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "doot";

        System.out.println((s.split("")[0]));
        System.out.println((s.split("")[1]));
        System.out.println((s.split("")[2]));
    }
}
