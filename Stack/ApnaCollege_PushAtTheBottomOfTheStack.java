import java.util.Stack;
// Problem and Explanation - https://www.youtube.com/watch?v=7m1DMYAbdiY    Timestamp - 25:14
// See video for logic explanation
public class ApnaCollege_PushAtTheBottomOfTheStack {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        pushAtBottom(4, st);

        while(!(st.isEmpty())){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
