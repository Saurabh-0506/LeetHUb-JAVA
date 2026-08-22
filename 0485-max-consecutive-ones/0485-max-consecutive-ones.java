class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1 = 0;
        int maxCount =0;

        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]==1){
                count1++;
                maxCount = Math.max(count1,maxCount);
            }
            else{
            count1 =0;
            }
            
        }
        return maxCount;
        
    }
}