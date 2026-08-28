class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        closing_paren = {"]": "[", "}": "{", ")": "("}

        for p in s:
            if p in closing_paren:
                if not stack or stack.pop() != closing_paren[p]:
                    return False
            else:
                stack.append(p)

        return not stack