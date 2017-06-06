import java.util.*;
public class Solution {
       
       static void quickSort(int[] ar, int low) {
           
           if (low < ar.length - 1)
           {
              partition(ar, low+1);
              quickSort(ar, low+1);
           }
           
       }   
    
       static void partition(int[] array, int p) {
              int pivot;
              
              int length = array.length;
              int l = 0;
              int r =  length - 1;
              
              pivot = array[p];
              
              while (true)
              {
                  
                  while (array[l] < pivot)
                  {
                      l++;
                  }
                  
                  while (array[r] > pivot)
                  {
                      r--;
                  }
                  
                  if (l >= r)
                  {
                      break;
                  }
                  
                  else
                  {
                      int num = array[l];
                      array[l] = array[r];
                      array[r] = num;
                  }
                  
              }
              
          }
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
         System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           quickSort(ar, 0);
           printArray(ar);
       }    
   }
