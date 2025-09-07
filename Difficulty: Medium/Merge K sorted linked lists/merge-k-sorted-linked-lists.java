/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        // code here
        // System.out.println(arr[0]);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i< arr.length;i++){
            Node curr = arr[i];
            while( curr != null ){
                pq.add(curr.data);
                curr= curr.next;
            }
            // System.out.println();
        }
        // System.out.println();
        Node head= new Node(pq.poll()) ,curr = head;
        while(!pq.isEmpty()){
            
            curr.next = new Node(pq.poll());
            curr = curr.next;
        }
        return head;
    }
}