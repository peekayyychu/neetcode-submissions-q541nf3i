class Solution {
    public int findMin(int[] nums) {
        int r = nums.length - 1;
        int l = 0;

        int ans = nums[0];

        while(l<r){
            int mid = l + (r-l)/2;

            if(nums[mid]>nums[r]){
                l = mid + 1;
            }else{
                r = mid;
            }
        }

        return nums[l];
    }
}
