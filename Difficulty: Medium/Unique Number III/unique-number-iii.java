//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSingle(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSingle(int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if( map.getOrDefault(arr[i],-1) == 2 ) map.remove(arr[i]);
            else map.put(arr[i], map.getOrDefault( arr[i],0)+1);
        }
        
        return map.keySet().iterator().next();
    }
}