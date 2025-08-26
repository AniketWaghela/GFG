class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int s1_pointer = 0;
        for(int i=0;i<s2.length();i++){
            if(s1_pointer == s1.length()) return true;
            if( s2.charAt(i) == s1.charAt(s1_pointer)){
                // System.out.println( s2.charAt(i) +" "+ s1.charAt(s1_pointer) );
                s1_pointer++;
            }
            
        }
        
        return s1_pointer == s1.length() ? true : false;
    }
};