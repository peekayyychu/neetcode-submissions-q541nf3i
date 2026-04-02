class Solution {
public:
    int characterReplacement(string s, int k) {
        int left = 0;
        int right = 0;

        int maxFreq = 0;
        int maxLength = 0;

        vector<int>arr(26,0);

        while(right<s.length()){
            int charIdx = s[right] - 'A';
            arr[charIdx]++;

            maxFreq = max(maxFreq, arr[charIdx]);

            while(right - left + 1 - maxFreq > k){
                arr[s[left]-'A']--;
                left++;
            }
            
            maxLength = max(maxLength, right-left+1);

            right++;
        }

        return maxLength;
    }
};
