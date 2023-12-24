// https://leetcode.com/problems/reverse-prefix-of-word/
// Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). 
// If the character ch does not exist in word, do nothing. Return the resulting string.

class Solution {
    public String reversePrefix(String word, char ch) {
        String result = "";
        String reverse = "";
        boolean isReverseDone = false;
        
        for (int i = 0; i < word.length(); i++) {
            if (!isReverseDone) {
                if (word.charAt(i) == ch) {
                    reverse += word.charAt(i);
                    result += reversed(reverse);
                    isReverseDone = true;
                } else reverse += word.charAt(i);
            } else result += word.charAt(i);
        }
        
        if (contains(word, ch)) return result; else return word;
    }

    public String reversed(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    public boolean contains(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) return true;
        }

        return false;
    }
}
