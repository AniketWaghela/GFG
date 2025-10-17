/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
} */

class Solution {
    static int sum=0;
    static void solve(Node root){
        if(root == null) return;
        
        solve(root.right);

        sum += root.data;
        root.data = sum - root.data;
        
        solve(root.left);
        
    }
    
    public static void transformTree(Node root) {
        // code here
        sum =0;
        solve(root);
         
    }
}