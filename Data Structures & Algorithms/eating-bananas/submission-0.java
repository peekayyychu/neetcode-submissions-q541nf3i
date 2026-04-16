class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPiles = -1;

        for(int x: piles){
            maxPiles = Math.max(maxPiles, x);
        }

        int minPiles = 1;

        int ans = maxPiles;

        while(minPiles <= maxPiles){
            int mid = minPiles + (maxPiles - minPiles)/2;

            int hours = hoursTaken(piles, mid);

            if(hours>h){
                minPiles = mid + 1;
            }else{
                maxPiles = mid - 1;
                ans = mid;
            }
        }

        return ans;
    }

    private int hoursTaken(int [] piles, int speed){
        int hours = 0;

        for(int x: piles){
            hours += Math.ceil((double)x/speed);
        }

        return hours;
    }
}
