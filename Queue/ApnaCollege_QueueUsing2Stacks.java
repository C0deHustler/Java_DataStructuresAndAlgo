import java.util.Stack;
// Problem and Explanation - https://www.youtube.com/watch?v=va_6RmSrKCg&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=31&t=74s   Timestamp - 37:04
public class ApnaCollege_QueueUsing2Stacks {
    static class queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        boolean isEmpty(){
            return s1.isEmpty();
        }
        void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return s1.pop();
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
