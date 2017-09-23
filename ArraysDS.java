import java.io.*;
import java.util.*;

public class ArraysDS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of numbers please.");
        int length = sc.nextInt();
        int[] array = new int[length];
		
        for (int i = length - 1; i >= 0; i--)
        {
            array[i] = sc.nextInt();
        }
        
        for (int num: array)
        {
            System.out.println(num + " ");
        }
		sc.close();
    }
}
