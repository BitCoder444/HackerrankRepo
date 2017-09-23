import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] array)
    {       
        int arrLength = array.length;
        
        
        for (int i = 1; i < arrLength; i++)
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
                }
                k--;
            }
            
            printArray(array);
        }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}

