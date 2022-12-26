class Solution(object):
    def findErrorNums(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        nums.sort()
        
        # find the repeated number
        double = -1
        for i in range(n-1):
            if nums[i] == nums[i+1]:
                double = nums[i]
        
        setNum = set(nums)
        
        # find the missing number
        missing = -1
        for j in range(1,n+1):
            if j not in setNum:
                missing = j
                
        if double != -1 and missing != -1:
            return [double, missing]
            