class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> idx;
        int ans = 0;
        int currFirst = 0;

        for (int i = 0; i < s.length(); i++) {
            if (idx.find(s[i]) != idx.end() && idx[s[i]] >= currFirst) {
                currFirst = idx[s[i]] + 1;
            }

            idx[s[i]] = i;
            
            ans = max(ans, i - currFirst + 1);
        }

        return ans;
    }
};