class Solution {
    public int[] replaceElements(int[] arr) {
        int i = arr.length - 1;
        int max = arr[i];
        arr[i] = -1;
        i -= 1;

        while (i >= 0) {
            int tmp = arr[i];
            arr[i] = max;
            max = Math.max(max, tmp);
            i -= 1;
        }

        return arr;
        
    }
}