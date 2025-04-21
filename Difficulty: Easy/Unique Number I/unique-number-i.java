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
            int ans = ob.findUnique(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findUnique(int[] arr) {
        // code here
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if( map.containsKey(arr[i]) ) map.remove(arr[i]);
            else map.put(arr[i],1);
        }
        
        
        
        return map.keySet().iterator().next();
        
    }
}