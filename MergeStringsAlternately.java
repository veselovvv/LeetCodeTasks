// https://leetcode.com/problems/merge-strings-alternately
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
// If a string is longer than the other, append the additional letters onto the end of the merged string.
// Return the merged string.

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int index = 0;
        int length;
        
        if (word1.length() > word2.length()) 
            length = word1.length();
        else 
            length = word2.length();
        
        while (index != length) {
            if (word1.length() > index) result += word1.charAt(index);
            if (word2.length() > index) result += word2.charAt(index);
            index++;
        }
        
        return result;
    }
}
