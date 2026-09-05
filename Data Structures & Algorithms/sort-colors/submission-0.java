class Solution {
    public void sortColors(int[] nums) {
        int[] counts = {0, 0, 0};

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            counts[num] += 1;
        }

        int i = 0;
        for (int k = 0; k < counts.length; k++) {
            for (int j = 0; j < counts[k]; j++) {
                nums[i] = k;
                i += 1;
            }
        }
   
    }
}