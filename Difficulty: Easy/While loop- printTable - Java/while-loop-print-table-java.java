//{ Driver Code Starts

// } Driver Code Ends

//Back-end complete function Template for Java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scanner = new Scanner(System.in);
        
        // Taking the input number n
        int n = scanner.nextInt();
        
        // Initialize the multiplier to 10 (for reverse order)
        int i = 10;
        
        // Use the while loop to print the reverse table
        while (i >= 1) {
            System.out.print((n * i+" "));
            i--; // Decrease the multiplier
        }
        
        scanner.close();
    }
}



//{ Driver Code Starts.
// } Driver Code Ends