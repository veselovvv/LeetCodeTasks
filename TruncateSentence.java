// https://leetcode.com/problems/truncate-sentence
// A sentence is a list of words that are separated by a single space with no leading or trailing spaces. 
// Each of the words consists of only uppercase and lowercase English letters (no punctuation).
// You are given a sentence s and an integer k. You want to truncate s such that it contains only the first k words. Return s after truncating it.

class Solution {
    public String truncateSentence(String s, int k) {
        String result = "";
        int words = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (words < k) {
                if (s.charAt(i) == ' ') words++;
                if (words != k) result += s.charAt(i);
            }
        }

        return result;
    }
}
