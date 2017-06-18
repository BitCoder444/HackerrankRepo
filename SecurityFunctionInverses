/* This problem is different. I was given n, and n input numbers that were integers.
 * My task was to find and print the inverse value for each original value that was
 * given to me.
Sample Input#00

3
1 2 3

Sample Output#00

1
2
3

Sample Input#01

3
2 3 1

Sample Output#01

3
1
2
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
            map.put(sc.nextInt(), i);
        }
        
        sc.close();
        
        for (int i = 1; i < length + 1; i++)
        {
            System.out.println(map.get(i));
        }
    }

}
