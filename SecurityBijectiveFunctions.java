/* Here, my program has to print YES if the given input is that of a bijective function,
 * or NO if the input is not of a bijective function. The input is valid if every element
 * of the codomain is mapped to by excatly one element of the domain. In simpler terms,
 * none of the input should be a duplicate of any other inputs.*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc;
        int n;
        int count;
        ArrayList<Integer> list;
        boolean bijective;
        
        sc = new Scanner(System.in);
        n = sc.nextInt();
        count = 0;
        list = new ArrayList();
        bijective = true;
        
        while (count < n)
        {
            int number = sc.nextInt();
            
            if (list.contains(new Integer(number)))
            {
                System.out.print("NO");
                bijective = false;
            }
            list.add(number);
            count++;
        }
        
        sc.close();
                
        if (bijective)
                System.out.println("YES");
    }
}
