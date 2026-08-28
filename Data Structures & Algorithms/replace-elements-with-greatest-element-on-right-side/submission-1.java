class Solution {
    public int[] replaceElements(int[] arr) {
        
        int maxNum = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int tmpNum = arr[i];
            arr[i] = maxNum;

            maxNum = Math.max(maxNum, tmpNum);
        }

        return arr;
    
    }
}