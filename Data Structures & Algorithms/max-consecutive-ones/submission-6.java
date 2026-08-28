class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int tmp = 0;
        int count = 0;
    
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count += 1;
            } else if (count > tmp) {
                tmp = count;
                count = 0;
            } else {
                count = 0;
            }
        }

        if (count > tmp) {
            return count;
        } else {
            return tmp;
        }
    }
}