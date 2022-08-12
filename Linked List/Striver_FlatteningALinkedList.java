// Problem - https://takeuforward.org/data-structure/flattening-a-linked-list/
// Problem - https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1

// Explanation - https://www.youtube.com/watch?v=ysytSSXpAI0&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=39

// Time Complexity: O(N), where N is the total number of nodes present
// Reason: We are visiting all the nodes present in the given list.

// Space Complexity: O(1)
// Reason: We are not creating new nodes or using any other data structure.

public class Striver_FlatteningALinkedList {
    /** Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;

	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
    **/

//    class GfG
//    {

    // This method works same as Striver_MergeTwoSortedLinkedList.java
    // except, instead of moving "next", we'll move towards "bottom", since head of all these lists are connected through "next" to each other
    // so if we want to traverse any particular list, we need to use "node.bottom" for traversal

//        Node mergeTwoLists(Node list1, Node list2){
//            if(list1 == null || list2 == null){
//                return (list1 != null ? list1 : list2);
//            }
//
//            Node dummy = new Node(-1);
//            Node previous = dummy;
//
//            Node c1 = list1;
//            Node c2 = list2;
//
//            while(c1 != null && c2 != null){
//                if(c1.data < c2.data){
//                    previous.bottom = c1;
//                    c1 = c1.bottom;
//                }
//                else{
//                    previous.bottom = c2;
//                    c2 = c2.bottom;
//                }
//                previous = previous.bottom;
//            }
//
//            previous.bottom = c1 != null ? c1 : c2;
//
//            return dummy.bottom;
//        }
//
    // See timestamp 9:00 for understanding this block of code, specifically 9:50
//        Node flatten(Node root){
//            if(root == null || root.next == null){
//                return root;
//            }
//
//            root.next = flatten(root.next);
//
//            root = mergeTwoLists(root, root.next);
//
//            return root;
//        }
//    }
}
