/**
 * swap
 */
import java.util.*;


public class swap {
   public static void main(String[] args) {
    int a = 20, b = 30;
    swap(a, b);
   }

    private static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;  
        b = temp;
        System.out.println(a + " " + b);
    }
    
}