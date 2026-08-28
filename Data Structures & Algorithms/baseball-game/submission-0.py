class Solution:
    def calPoints(self, operations: List[str]) -> int:
        score = []

        for value in operations:
            try:
                score.append(int(value))
            except ValueError:
                if value == "+":
                    score.append(score[-1] + score[-2])
                elif value == "D":
                    score.append(2 * score[-1])
                elif value == "C":
                    score.pop()

        return sum(score)