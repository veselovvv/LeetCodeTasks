// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
// A pangram is a sentence where every letter of the English alphabet appears at least once.
// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean result = true;
        
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (!sentence.contains(String.valueOf(letter))) result = false;
        }
        
        return result;
    }
}
