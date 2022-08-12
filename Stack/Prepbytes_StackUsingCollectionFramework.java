import java.util.Stack;

public class Prepbytes_StackUsingCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(5);
        st.push(7);
        st.push(9);
        st.push(11);

        int x = st.get(2);
        System.out.println(x);
        System.out.println();

        while(!(st.isEmpty())) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}


