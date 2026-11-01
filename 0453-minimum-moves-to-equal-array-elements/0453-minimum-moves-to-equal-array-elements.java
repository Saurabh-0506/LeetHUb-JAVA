class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        long sum =0;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            if(i < min){
                min = i;
            }
            sum = sum +i;
        }
        return (int) (sum - ((long) min * n));
        
    }
}