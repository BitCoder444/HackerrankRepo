/* We are given n, and n input numbers that are integers.
 * The task is to find and print the inverse value of the inverse value for each original value that is
 * given.
Sample Input#00

3
2 3 1

Sample Output#00

3
1
2

In greater detail, 2 is at index one, 3 is at index two, and 1 is at index three.
Each index is also the input value, or x.
So, for input 1, two is given. Then, for input 2, three is given.
Therefore, three is the first ouput.

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc;
        int length;
        Map<Integer, Integer> map;
        
        map = new HashMap<Integer, Integer>();
        sc = new Scanner(System.in);
        length = sc.nextInt();
        
        for (int i = 1; i < length + 1; i++)
        {
            map.put(i, sc.nextInt());
        }
        
        sc.close();
        
        for (int i = 1; i < length + 1; i++)
        {
            System.out.println(map.get(map.get(i)));
        }
    }

}
