// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences
// Given a string s, return true if s is a good string, or false otherwise.
// A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> letters = new HashMap<>();

        for (char ch : s.toCharArray()) {
            letters.put(ch, letters.getOrDefault(ch, 0) + 1);
        }

        int times = 0;

        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            if (times == 0)
                times = entry.getValue();
            else if (times != entry.getValue())
                return false;
        }

        return true;
    }
}
