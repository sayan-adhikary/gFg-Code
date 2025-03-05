//{ Driver Code Starts
// // Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution ob = new Solution();
            ob.rotate(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends



class Solution {
    public void rotate(int[] arr) {
        int n = arr.length;
        int[] num = new int[n]; 
        int temp = arr[n-1];
        for (int i = 1; i <= n-1; i++) {
            num[i] = arr[i-1];
        }
        num[0] = temp;
        for (int i = 0; i < n; i++) {
            arr[i] = num[i];
        }
    }
}

