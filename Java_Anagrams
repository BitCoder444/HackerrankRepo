import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        char[] arr1;
        char[] arr2;
        
        arr1 = a.toLowerCase().toCharArray();
        arr2 = b.toLowerCase().toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
