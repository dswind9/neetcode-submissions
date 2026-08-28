class Solution:
    def climbStairs(self, n: int) -> int:
        i = 0
        prev = 0
        nex = 1


        while i < n:
            tmp = nex
            nex = prev + nex
            prev = tmp
            i += 1

        return nex