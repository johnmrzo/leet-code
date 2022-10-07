class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        
        result[0] = nums[0];
        int counter = nums[0];
        for (int i = 1; i < nums.length; i++){
            counter += nums[i];
            result[i] = counter;
        }
        return result;   
    }
}