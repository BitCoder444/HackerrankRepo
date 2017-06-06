import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void insertIntoSorted(int[] array) {
        Scanner sc = new Scanner(System.in);
        
        int arrLength = array.length;
        int num = array[arrLength - 1];
        
        for (int i = arrLength - 1; i > 0; i--)
        {   
            //If left is greater than right, right = left
            if (array[i - 1] > num)
            {
                array[i] = array[i - 1];
                printArray(array);
                continue;
            }
            
            else
            {
                array[i] = num;
                printArray(array);
                break;
            }
        }
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 

