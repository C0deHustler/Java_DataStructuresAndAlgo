import java.util.ArrayList;

public class Prepbytes_StackUsingArrayList {
    static class stackArrayList{
        static ArrayList<Integer> list = new ArrayList<>();

        boolean isEmpty(){
            if(list.size() == 0){
                return true;
            }
            return false;
        }
        void push(int data){
            list.add(data); // elements are added at the tail
        }
        int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        stackArrayList sal = new stackArrayList();

        sal.push(2);
        sal.push(4);
        sal.push(6);
        sal.push(8);

        while(!(sal.isEmpty())){
            System.out.println(sal.peek());
            sal.pop();
        }
    }
}
