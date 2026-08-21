class Solution {
    public void rotate(int[] nums, int k) {
        
        int n =nums.length;
        int temp[] = new int[n]; // array intialise
        
        for(int i=0;i<nums.length;i++){
            temp[(i+k)%n] = nums[i]; // temp wali mein store
        }
        // copy karna hai orignial wali mein
        for(int i =0;i<n;i++){
            nums[i] = temp[i];
        }
        
    }
}