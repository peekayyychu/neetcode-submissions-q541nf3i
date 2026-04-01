class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        unordered_map<int, int>numToIdx;

        for(int i = 0; i<numbers.size(); i++){
            int look = target - numbers[i];

            if(numToIdx.find(look)!=numToIdx.end()){
                return {numToIdx[look]+1, i+1};
            }

            numToIdx[numbers[i]] = i;
        }

        return {-1,-1};
    }
};
