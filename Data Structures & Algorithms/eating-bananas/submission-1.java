class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPiles = Arrays.stream(piles).max().getAsInt();

        int minPiles = 1;

        while(minPiles <= maxPiles){
            int mid = minPiles + (maxPiles - minPiles)/2;

            int hours = hoursTaken(piles, mid);

            if(hours>h){
                minPiles = mid + 1;
            }else{
                maxPiles = mid - 1;
            }
        }

        return minPiles;
    }

    private int hoursTaken(int [] piles, int speed){
        int hours = 0;

        for(int x: piles){
            hours += Math.ceil((double)x/speed);
        }

        return hours;
    }
}
