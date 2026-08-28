class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> intMap = new HashMap<>();
        
        for (int num : nums) {
            if (intMap.containsKey(num)) {
                return true;
            }
            intMap.put(num, true);
        }

        return false; 
    }
}