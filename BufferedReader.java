import java.util.*;
import java.io.*;

/*Just a program that demonstrates how to use BufferedReader*/

public class Solution {

    public static void main(String[] args) {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        
        try 
        {
            System.out.println(buff.readLine());
            System.out.println(buff.readLine());
            System.out.println(buff.readLine());
            buff.close();
        }
        catch (IOException io)
        {
            System.out.print(io);
        }
        
        
    }
}
