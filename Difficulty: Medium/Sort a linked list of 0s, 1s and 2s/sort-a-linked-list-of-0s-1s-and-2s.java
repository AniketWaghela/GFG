/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        Node curr = head;
        int zero = 0, one =0, two =0;
        
        while( curr != null ){
            if( curr.data == 0 ) zero++; 
            else if( curr.data == 1 ) one++; 
            // else two++;
            curr.data =2;
            curr = curr.next;
        }
        // System.out.println(zero +" "+one+" "+ two);
        curr = head;
        while( curr != null ){
            if( zero > 0 ){
                curr.data = 0;
                zero--;
            } 
            else if( one > 0 ){
                curr.data = 1;
                one--;
            }
            if( one == 0 && zero == 0) break;
            // else{
            //     curr.data = 2;
            // }
            curr = curr.next;
        }
        return head;
    }
}