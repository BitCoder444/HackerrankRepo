/*
You have an empty sequence, and you will be given queries. Each query is one of these three types:

1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.

Input Format

The first line of input contains an integer, . The next lines each contain an above mentioned query. (It is guaranteed that each query is valid.)

Constraints
1 <= N <= 10^5
1 <= x <= 10^9
1 <= type <= 3
Output Format

For each type query, print the maximum element in the stack on a new line.

Sample Input

10
1 97
2
1 20
2
1 26
1 20
2
3
1 91
3

Sample Output

26
91
 
*/
import java.io.*;
import java.util.*;

public class Solution {
    
    class Stack
    {
        ArrayList<Integer> stack;
        
        public Stack(int size)
        {
            stack = new ArrayList<Integer>(size);
        }
        
        public void push(int data)
        {
            stack.add(data);
        }
        
        public void delete()
        {
            if (stack.size() > 0)
            stack.remove(stack.size() - 1);
        }
        
        public void printGreatestValue()
        {
            int greatest = stack.get(0);
            for (Integer num: stack)
            {
                if (greatest < num.intValue())
                {
                    greatest = num.intValue();
                }
            }
            System.out.println(greatest);
        }
        
        public ArrayList getStack()
        {
            return stack;
        }

    }

    public static void main(String[] args)
    {
        Solution sol = new Solution();
        sol.runStack();
    }
    
    public void runStack()
    {
        int latestValue;
        int length;
        Scanner sc;
        Stack stack;
        
        sc = new Scanner(System.in);
        length = sc.nextInt();
        latestValue = 0;
        stack = new Stack(length);
        
        while (0 < length--)
        {
            int query = sc.nextInt();
 
            switch (query)
            {
                case 1:
                    int data = sc.nextInt();
                    stack.push(data);
                break;
                case 2: 
                    stack.delete();
                break;
                case 3:
                    stack.printGreatestValue();
                break;
            }
        }
    }
}
