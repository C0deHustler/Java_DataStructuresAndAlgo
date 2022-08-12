import java.util.Stack;
// Problem and Explanation - https://www.youtube.com/watch?v=7m1DMYAbdiY    Timestamp - 31:25
// See video for logic explanation

public class ApnaCollege_ReverseAStack {
    public static void pushAtBottom(int data, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(data, st);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(top, st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        reverse(st);

        while(!(st.isEmpty())){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
