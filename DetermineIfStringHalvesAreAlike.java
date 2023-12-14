// https://leetcode.com/problems/determine-if-string-halves-are-alike/
// You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
// Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). 
// Notice that s contains uppercase and lowercase letters. Return true if a and b are alike. Otherwise, return false.

class Solution {
    public boolean halvesAreAlike(String s) {
        int index = 0;
        int vowelsInFirst = 0;
        int vowelsInSecond = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                if (index < s.length() / 2) vowelsInFirst++; else vowelsInSecond++;
            
            index++;
        }
        
        return vowelsInFirst == vowelsInSecond;
    }
}
