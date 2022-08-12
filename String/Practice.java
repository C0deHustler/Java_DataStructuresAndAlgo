import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('e', 0);
        map.put('g', 1);
        map.put('g', 2);

        System.out.println(map);
    }
}
