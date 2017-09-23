import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        int shifts = 0;
        
        for (int i = 0; i < arrayLength; i++)
        {
            array[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arrayLength; i++)
        {
            int k = i;
            
            while (k > 0)
            {
                int j = k - 1;
                
                int left = array[j];
                int right = array[k];
                if (left > right)
                {
                    array[k] = left;
                    array[j] = right;
                    shifts++;
                }
                k--;
            }
        }
        
        System.out.println(shifts);
    }
        
        
}
