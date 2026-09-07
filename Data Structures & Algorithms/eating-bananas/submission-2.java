class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int i = 0; i < piles.length; i++) {
            if (high < piles[i]) {
                high = piles[i];
            }
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            int hours = calculateHours(piles, mid);

            if (hours > h) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public int calculateHours(int[] piles, int k) {
        int hours = 0;

        for (int i = 0; i < piles.length; i++) {
            hours += piles[i] / k;
            if (piles[i] % k != 0) {
                hours++;
            }
        }

        return hours;
    }
}