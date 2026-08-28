class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;

        while (i < matrix.length) {
            int guess = matrix[i][matrix[i].length - 1];
            if (target == guess) {
                return true;
            }
            if (guess > target) {
                int left = 0;
                int right = matrix[i].length - 1;
                
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    guess = matrix[i][mid];
                    if (guess == target) {
                        return true;
                    }

                    if (guess > target) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }

                return false;
            }

            i += 1;
        }

        return false;
    }
}
