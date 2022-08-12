import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prepbytes_Medium_PlayingCards {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());    // Parsing String into int, since in bufferedReader, default input type is String
        while(t-- > 0) {
            String cardOnTable = br.readLine();
            String cardsInHand = br.readLine();
            boolean flag = false;

            if( cardsInHand.contains(cardOnTable.split("")[0])){    // checking whether index 0 of cardOnTable is contained anywhere in cardsInHands
                flag = true;
            }
            else if( cardsInHand.contains(cardOnTable.split("")[1])){   // checking whether index 1 of cardOnTable is contained anywhere in cardsInHands
                flag = true;
            }

            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
