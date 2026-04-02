class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        int subLength = s1.length();

        vector<int>arr(26,0);

        for(char c: s1){
            arr[c-'a']++;
        }

        int l = 0;

        vector<int>subArr(26,0);

        for(int r=0;r<s2.length();r++){
            subArr[s2[r]-'a']++;

            if(r-l+1>subLength){
                subArr[s2[l]-'a']--;
                l++;
            }

            if(r-l+1==subLength){
                if(subArr==arr) return true;
            }
        }

        return false;
    }
};
