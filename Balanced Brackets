import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        solution.run();
    }
    
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        sc.nextLine(); /*The first line of input is not needed*/

        while (sc.hasNext())
        {
            Stack stack;
            String[] array;
            String input;
            int count;
            
            stack = new Stack();
            input = sc.nextLine();
            array = input.split("");            
            count = 0;
            while (count < array.length)
            {
                stack.push(array[count]);
                count++;
            }
            //System.out.print(array.length);
            Solution.checkStacks(stack);
        }
    }
    
    public static void checkStacks(Stack stack)
    {
        int numOfLeftBrackets;
        int numOfLeftParentheses;
        int numOfLeftBraces;
        int numOfRightBrackets;
        int numOfRightParentheses;
        int numOfRightBraces;
        
        numOfLeftBrackets = 0;
        numOfLeftParentheses = 0;
        numOfLeftBraces = 0;
        numOfRightBrackets = 0;
        numOfRightParentheses = 0;
        numOfRightBraces = 0;
        while (!stack.empty())
        {
            String str;
            str = stack.pop().toString();
            switch (str)
            {
                case "{":
                        numOfLeftBraces++;
                        break;                         
                case "[":
                        numOfLeftBrackets++;
                        break;
                case "(":
                        numOfLeftParentheses++;
                        break; 
                case "}":
                        numOfRightBraces++;
                        break; 
                case "]":
                        numOfRightBrackets++;
                        break; 
                case ")":
                        numOfRightParentheses++;
                        break;
                default:

             }      
        }
        if (!(numOfLeftBraces == numOfRightBraces) ||
            !(numOfLeftBrackets == numOfRightBrackets))
        {
            System.out.println("NO");
        } else if (!(numOfLeftParentheses == numOfRightParentheses))
        {
            System.out.println("NO");
        } else
        {
            System.out.println("YES");
        }
        
    }
}
