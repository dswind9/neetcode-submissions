class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        arr = []
        k = 0
        new_arr_length = len(nums) * 2

        for i in range(new_arr_length):
            if i == len(nums):
                k = 0
            
            arr.append(nums[k])

            k += 1

        return arr