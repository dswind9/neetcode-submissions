class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile: piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            int hours = hoursToEat(piles, mid);

            if (hours <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public int hoursToEat(int[] piles, int mid) {
        int hours = 0;
        for (int pile: piles) {
            hours += pile / mid;
            
            if (pile % mid != 0) {
                hours ++;
            }
        }
        return hours;
    }
}