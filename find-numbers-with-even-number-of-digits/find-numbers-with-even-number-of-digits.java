class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int i = 0;
        
        for (int num: nums) {
            i = 0;
            while (num != 0) {
                num /= 10;
                i++;
            }
            
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}