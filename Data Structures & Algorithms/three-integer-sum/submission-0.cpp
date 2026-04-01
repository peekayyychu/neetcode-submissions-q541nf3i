class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> sol;
        int n = nums.size();

        sort(nums.begin(), nums.end());

        for(int i = 0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int target = nums[i] * -1;

            int left = i+1;
            int right = n-1;

            while(left<right){
                int currSum = nums[left] + nums[right];

                if(currSum>target) right--;
                else if(currSum<target) left++;
                else{
                    sol.push_back({nums[i], nums[left], nums[right]});

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
            }
        }

        return sol;
    }
};
