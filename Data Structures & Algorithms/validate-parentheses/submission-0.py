class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        closing_paren = {
            "]" : "[",
            "}" : "{",
            ")" : "("
        }

        for p in s:
            if p in closing_paren and len(stack) == 0:
                return False
            
            if p in closing_paren:
                match = stack.pop()
                if closing_paren[p] != match:
                    return False
            
            else:
                stack.append(p)
        
        if stack:
            return False
        
        return True