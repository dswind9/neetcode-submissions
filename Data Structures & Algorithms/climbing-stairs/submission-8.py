class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 1:
            return n
        
        step_one = 1
        step_two = 1

        for i in range(n-1):
            tmp = step_two
            step_two = step_one + step_two
            step_one = tmp
        
        return step_two