class Solution {
    public void sortColors(int[] nums) {

        //Dutch National Flag Problem
        int i =0; // i ke piche saare 0 hone chahiye
        int j =nums.length-1; // iske piche saare 1 hone chahiye
        int k =0; // k ke piche i tak saare 1 hone chahiye

        while(k<=j){

            // 1 ke liye check
            if(nums[k] == 1){
                k =k+1;
            }
            // 2 ke liye check
            else if(nums[k] == 2){
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;

                j = j-1;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                 i= i+1;
                 k =k+1;
                
            }
        }

        
    }
}