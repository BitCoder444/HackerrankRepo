import java.io.*;
import java.util.*;

/*Takes in first int length, then a series of ints.
  each int is printed out by the program.*/

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
     public static Node insert(Node head, int data) {
        /*If the head is null*/
        if (head == null)
        {
            head = new Node(data);
            return head;
        }
        
        /*If the head points to null*/
        else if (head.next == null)
        {
            head.next = new Node(data);
        }
        
        /*Search for the next null spot, then place a node there*/
        else
        {
            insert(head.next, data);
        }
        
        
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
