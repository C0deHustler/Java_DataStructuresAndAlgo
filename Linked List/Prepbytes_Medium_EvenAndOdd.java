public class Prepbytes_Medium_EvenAndOdd {
    // Complete the reverseEvenEnd function below.

/*
For your reference:

SinglyLinkedListNode {
int data;
SinglyLinkedListNode next;
}
To create a new node use below constructor
public SinglyLinkedListNode(int nodeData)
*/

//    static SinglyLinkedListNode reverseEvenEnd(SinglyLinkedListNode head) {
//        //write your code here
//        SinglyLinkedListNode oddStart = null;
//        SinglyLinkedListNode oddEnd = null;
//        SinglyLinkedListNode evenStart = null;
//        SinglyLinkedListNode evenEnd = null;
//        SinglyLinkedListNode current = head;
//
//        while(current != null){
//            if(current.data % 2 != 0){
//                if(oddStart == null){
//                    oddStart = current;
//                    oddEnd = oddStart;
//                }
//                else{
//                    oddEnd.next = current;
//                    oddEnd = oddEnd.next;
//                }
//            }
//            else{
//                if(evenStart == null){
//                    evenStart = current;
//                    evenEnd = evenStart;
//                }
//                else{
//                    evenEnd.next = current;
//                    evenEnd = evenEnd.next;
//                }
//            }
//            current = current.next;
//        }
//
//        if(evenStart != null){
//            evenEnd = evenStart;
//            evenStart = reverse(evenStart);
//        }
//
//        if(oddEnd != null){
//            oddEnd.next = evenStart;
//        }
//        if(evenEnd != null){
//            evenEnd.next = null;
//        }
//        if(oddStart != null){
//            return oddStart;
//        }
//        else{
//            return evenStart;
//        }
//    }
//
//    static SinglyLinkedListNode reverse(SinglyLinkedListNode head){
//        SinglyLinkedListNode current = head;
//        SinglyLinkedListNode next = null;
//        SinglyLinkedListNode previous = null;
//
//        while(current != null){
//            next = current.next;
//            current.next = previous;
//            previous = current;
//            current = next;
//        }
//        head = previous;
//        return head;
//    }



}
