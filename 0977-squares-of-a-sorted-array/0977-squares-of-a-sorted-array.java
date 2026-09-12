class Solution {
    public int[] sortedSquares(int[] nums) {

        int i =0,j= nums.length-1;

        int[] result = new int[nums.length];

        int k = nums.length-1; // result array mein value daalne ke liye &&
        // aur ye result array mein end se bharte aayega
        while(i <=j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                result[k] = nums[i] * nums[i];
                i =i+1;
                k = k-1;
            }
            else{
                result[k] = nums[j] * nums[j];
                j =j-1;
                k = k-1;
            }            
        }
        return result;
        
    }
}