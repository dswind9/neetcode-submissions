# Definition for a pair.
# class Pair:
#     def __init__(self, key: int, value: str):
#         self.key = key
#         self.value = value
class Solution:
    def insertionSort(self, pairs: List[Pair]) -> List[List[Pair]]:
        if len(pairs) == 0:
            return pairs
        copy = pairs.copy()
        new_list = []
        new_list.append(copy)
        
        i = 1

        while (i < len(pairs)):
            j = i - 1
            
            while (j >= 0 and pairs[j].key > pairs[j + 1].key):
                tmp = pairs[j]
                pairs[j] = pairs[j + 1]
                pairs[j + 1] = tmp

                j -= 1
            
            copy = pairs.copy()
            new_list.append(copy)

            i += 1
        
        return new_list
