// https://leetcode.com/problems/first-letter-to-appear-twice/
// Given a string s consisting of lowercase English letters, return the first letter to appear twice.

class Solution {
    public char repeatedCharacter(String s) {
        String saved = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (contains(saved, ch)) return ch; 
            else saved += ch;
        }
        
        return ' ';
    }

    public boolean contains(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) return true;
        }

        return false;
    }
}
