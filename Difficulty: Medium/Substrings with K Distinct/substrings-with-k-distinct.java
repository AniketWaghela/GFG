// User function Template for Java

class Solution {
    int countSubstr(String s, int k) {
        // your code here
        
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int distinct = 0;

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                if (freq[ch - 'a'] == 0) distinct++;
                freq[ch - 'a']++;

                if (distinct == k) count++;
                else if (distinct > k) break;  // No need to check further
            }
        }

        return count;
        
    }
}