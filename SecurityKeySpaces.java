/* Given a number, shift each digit k times, where k is a key.
 *
 * Input to console:
 * 20348403909
 * 2
 * Output:
 * 42560625121
 * */

/* The class CircularLinkedList holds what is called the Message Space.
 * The Message Space here is M = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,}
 * 
 * Bugs:
 * The array by the name "numbers" has one bad spot at its last block.
 * The array "strings" has an empty block, also.
 * "strings" and "numbers" have the same length, due to the way the program is written.
 * While using "numbers", the last element must not be used.
 * */

import java.io.*;
import java.util.*;
    
class CircularLinkedList
{
    class Node
    {
        public Node(int data)
        {
            this.data = data;
        }

        int data;
        Node next;
    }

    public CircularLinkedList(int begin, int end)
    {
        int x;
        Node node;

        start = new Node(begin);
        x = begin + 1;
        node = start;

        while (x < end + 1)
        {
            if (x < end)
            {
                node.next = new Node(x);
                node = node.next;
                x++;

            } else
            {
                node.next = new Node(x);
                last = node.next;
                last.next = start;
                x++;
            }

        }
    }
    
    /* An easy access point to the CircularLinkedList */
    Node start;

    /* This reference is used to bind the head to the tail,
             * which completes that circle
             */
    Node last;

    /* Go into the list and search for the node holding the target
             * data. Return the reference to that node.
             */
    public int nextInt(int integer)
    {
        Node node = start;

        while (true)
        {
            if (node.data == integer)
            {
                return node.next.data;
            }
            else
            {
                node = node.next;
            }
            
        }
    }
    
    

}
public class Solution {

    public static void main(String[] args) {
        int x;
        int shifts;
        int[] numbers;
        String[] strings;
        Scanner sc;
        String input;
        CircularLinkedList cLL;
        
        sc = new Scanner(System.in);
        input = new Long(sc.next()).toString();
        shifts = new Integer(sc.next()).intValue();
        sc.close();
        strings = input.split("");
        numbers = new int[strings.length];
        x = 0; /* Used for iterating through the numbers array*/
        
        
        cLL = new CircularLinkedList(0, 9);
        
        for (String str: strings)
        {
            if (!str.equals(""))
            {
                numbers[x] = Integer.parseInt(str);
                x++;
            }
               
        }
        
        for (int i = 0; i < numbers.length - 1; i++)
        {
            int c;
            c = 0;
            
            while (c < shifts)
            {
                c++;
                numbers[i] = cLL.nextInt(numbers[i]);
            }
            
        }
        
        for (int i = 0; i < numbers.length - 1; i++)
        {
            System.out.print(numbers[i]);
        }
    }
    
}
