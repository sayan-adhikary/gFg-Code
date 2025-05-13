//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] troops = br.readLine().trim().split("\\s+");
            int[] arr = Arrays.stream(troops).mapToInt(Integer::parseInt).toArray();
            int k = Integer.parseInt(br.readLine().trim());

            Solution obj = new Solution();
            System.out.println(obj.minSoldiers(arr, k));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// import java.util.*;

class Solution {
    public int minSoldiers(int[] arr, int k) {
        int n = arr.length;
        int lucky = 0;
        List<Integer> toTrain = new ArrayList<>();

        for (int num : arr) {
            if (num % k == 0) {
                lucky++;
            } else {
                toTrain.add(k - (num % k)); // soldiers needed to make it lucky
            }
        }

        int required = (n + 1) / 2; // At least half (ceiling)
        int needToMakeLucky = required - lucky;

        if (needToMakeLucky <= 0) {
            return 0; // Already enough lucky troops
        }

        // Sort required additions in ascending order
        Collections.sort(toTrain);

        int result = 0;
        for (int i = 0; i < needToMakeLucky; i++) {
            result += toTrain.get(i);
        }

        return result;
    }
}
