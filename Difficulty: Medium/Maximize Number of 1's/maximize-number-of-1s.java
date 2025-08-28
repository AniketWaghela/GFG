class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        
        int n= arr.length;
        int count =0;
        int j=0,ans=0;
        
        for(int i=0; i<n ;i++){
            
            if( arr[i] == 0 ) count++;
            
            // System.out.println(arr[i]+" "+count+" "+ans);
            
            while( count > k && j<n ){
                // System.out.println(i+"j: "+j+" "+arr[j]);
                if( arr[j++] == 0 ) count--;
            }
            
            ans = Math.max(ans , i-j+1);
        }
        
        return ans;
    }
}