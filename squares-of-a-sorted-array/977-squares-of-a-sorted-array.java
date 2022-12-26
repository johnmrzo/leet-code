class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int right = len - 1;
        int left = 0;
        int[] result = new int[len];
        
        for (int i = len - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }
        return result;
    }
}