import java.io.*;
import java.util.*;
// Problem - https://www.prepbytes.com/panel/mycourses/program-one/dsalgo/week/7/linked-list/codingAssignment/ARRNGEVC
// Explanation - https://www.geeksforgeeks.org/arrange-consonants-vowels-nodes-linked-list/
// Must read the gfg article, detailed explanation of each step mentioned in each line of code

// Explanation - https://www.prepbytes.com/blog/linked-list/arrange-consonants-and-vowels-nodes-in-a-linked-list/

public class Prepbytes_Medium_VowelAndConsonants {
    static class SinglyLinkedListNode {
        public char data;
        public SinglyLinkedListNode next;
        public SinglyLinkedListNode(char nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;
        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
        public void insertNode(char nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }
            this.tail = node;
        }
    }
    static void printLinkedList(SinglyLinkedListNode head)
    {
        SinglyLinkedListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    // Complete the arrangeVowCon function below.

    /*
    For your reference:

    SinglyLinkedListNode {
    char data;
    SinglyLinkedListNode next;
    }
    If you want to create a new node with value, below constructor is defined
    public SinglyLinkedListNode(char nodeData)
    */
    static boolean isVowel(char x){
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
            return true;
        }
        else{
            return false;
        }
    }

    static SinglyLinkedListNode arrangeVowCon(SinglyLinkedListNode head) {
        SinglyLinkedListNode newHead = head;
        SinglyLinkedListNode latestVowel;
        SinglyLinkedListNode current = head;

        if(head == null){
            return null;
        }

        if(isVowel(head.data) == true){
            latestVowel = head;
        }
        else{
            while(current.next != null && !(isVowel(current.next.data))){
                current = current.next;
            }
            if(current.next == null){
                return head;
            }
            latestVowel = newHead = current.next;
            current.next = current.next.next;
            latestVowel.next = head;
        }

        while(current != null && current.next != null){
            if(isVowel(current.next.data) == true){
                if(current == latestVowel){
                    latestVowel = current = current.next;
                }
                else{
                    SinglyLinkedListNode temp = latestVowel.next;
                    latestVowel.next = current.next;
                    latestVowel = latestVowel.next;
                    current.next = current.next.next;
                    latestVowel.next = temp;
                }
            }
            else{
                current = current.next;
            }
        }
        return newHead;
    }


    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            SinglyLinkedList llist = new SinglyLinkedList();
            int llistCount = scanner.nextInt();
            for(int i=0;i<llistCount;i++)
                llist.insertNode(scanner.next().charAt(0));
            printLinkedList(arrangeVowCon(llist.head));
        }
        scanner.close();
    }
}