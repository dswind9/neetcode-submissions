class Solution:
    def climbStairs(self, n: int) -> int:
        step_one = 0
        step_two = 1

        for i in range(n):
            tmp = step_two
            step_two = step_one + step_two
            step_one = tmp
        
        return step_two