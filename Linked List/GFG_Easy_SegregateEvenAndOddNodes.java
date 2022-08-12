// Problem - https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1#
// Explanation - https://www.youtube.com/watch?v=Gm8gHjYyNwo

public class GFG_Easy_SegregateEvenAndOddNodes {
//    class Solution{
//        Node divide(int N, Node head){
//            Node oddStart = null;
//            Node oddEnd = null;
//            Node evenStart = null;
//            Node evenEnd = null;
//            Node current = head;
//
//            while(current != null){
//                if(current.data % 2 != 0){
//                    if(oddStart == null){
//                        oddStart = current;
//                        oddEnd = oddStart;
//                    }
//                    else{
//                        oddEnd.next = current;
//                        oddEnd = oddEnd.next;
//                    }
//                }
//                else{
//                    if(evenStart == null){
//                        evenStart = current;
//                        evenEnd = evenStart;
//                    }
//                    else{
//                        evenEnd.next = current;
//                        evenEnd = evenEnd.next;
//                    }
//                }
//                current = current.next;
//            }
//
//
//            if(evenEnd != null){
//                evenEnd.next = oddStart;
//            }
//            if(oddEnd != null){
//                oddEnd.next = null;
//            }
//            if(evenStart != null){
//                return evenStart;
//            }
//            else{
//                return oddStart;
//            }
//        }
//
//        static Node reverse(Node head){
//            Node current = head;
//            Node next = null;
//            Node previous = null;
//
//            while(current != null){
//                next = current.next;
//                current.next = previous;
//                previous = current;
//                current = next;
//            }
//            head = previous;
//            return head;
//        }
//    }
}