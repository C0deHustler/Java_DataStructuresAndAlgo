// Problem - https://www.codingninjas.com/codestudio/problems/find-pair-with-a-given-sum-in-a-doubly-linked-list_1164172?leftPanelTab=0
// Explanation - https://www.youtube.com/watch?v=FPIstRkXQ_g

public class CodeStudio_FindPairWithGivenSumInSortedDLL {
    // 2 pointer approach will be used with one pointer at the start and the other pointer at the end.
    // if sum of start and end node is smaller than k, then increment start (move start pointer to next node)
    // else if sum of start and end is greater than k, then decrement end (move end node to previous node)

    // this logic is possible if and only if -
    // 1. linked list is sorted
    // 2. linked list is a doubly linked list, because end pointer can move backward only in case of DLL (by using end.prev)

//    public static boolean findPair(Node<Integer> head, int k) {
//        Node<Integer> start = head;
//        Node<Integer> end = head;
//
//        while(end.next != null){
//            end = end.next;
//        }
//
//        while(start != end && end.next != start){
//            if(start.data + end.data == k){
//                return true;
//            }
//            else if(start.data + end.data < k){
//                start = start.next;
//            }
//            else{
//                end = end.prev;
//            }
//        }
//        return false;
//    }
}
