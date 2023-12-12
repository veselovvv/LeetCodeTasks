// https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
// Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.

class Solution {
    public boolean checkString(String s) {
        boolean isB = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') isB = true;
            else if (isB) return false;
        }

        return true;
    }
}
