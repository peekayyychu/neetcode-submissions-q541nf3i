class Solution {
public:
    bool isPalindrome(string s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !checkAlphaNumeric(s[left])) left++;
            while (left < right && !checkAlphaNumeric(s[right])) right--;

            char l = tolower(s[left]);
            char r = tolower(s[right]);

            if (l != r) return false;

            left++;
            right--;
        }

        return true;
    }

    bool checkAlphaNumeric(char a) {
        return (a >= 'A' && a <= 'Z') || 
               (a >= 'a' && a <= 'z') || 
               (a >= '0' && a <= '9');
    }
};