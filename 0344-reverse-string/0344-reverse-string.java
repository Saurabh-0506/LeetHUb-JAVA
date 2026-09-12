class Solution {
    public void reverseString(char[] s) {

        // two pointer approach

        int i =0;
        int j = s.length -1;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            
            // pointer aage badho do
            i = i+1;
            j = j-1;
        }
    }
}