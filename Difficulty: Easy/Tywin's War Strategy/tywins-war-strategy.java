class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n;
        if( arr.length%2 == 1) n= (arr.length/2)+1;
        else n= arr.length/2;
        
        for(int i=0;i< arr.length ;i++){
            if( arr[i]%k ==0 ) pq.add( 0 );
            else pq.add( k-(arr[i]%k) );
            // System.out.println(k-(arr[i]%k));
            // if(pq.size() > n) pq.poll();
        }
        
        int ans=0;
        for(int i=0;i< n ;i++) ans+=pq.poll();
        return ans;
    }
}