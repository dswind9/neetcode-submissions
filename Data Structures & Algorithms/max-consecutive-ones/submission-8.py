class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_count = 0
        tmp = 0

        for num in nums:
            if num == 1:
                tmp += 1;
            elif tmp > max_count:
                max_count = tmp
                tmp = 0
            else:
                tmp = 0
        
        if tmp > max_count:
            return tmp

        return max_count
