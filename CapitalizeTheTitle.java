// https://leetcode.com/problems/capitalize-the-title/
// You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. 
// Capitalize the string by changing the capitalization of each word such that:
// - If the length of the word is 1 or 2 letters, change all letters to lowercase.
// - Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
// Return the capitalized title.

class Solution {
    public String capitalizeTitle(String title) {
        String word = "";
        String result = "";

        for (char ch : (title + " ").toCharArray()) {
            if (ch == ' ') {
                if (word.length() > 2) {
                    result += capitalizeFirstLetter(word.toLowerCase()) + " ";
                } else
                    result += word.toLowerCase() + " ";

                word = "";
            } else
                word += ch;
        }

        return result.substring(0, result.length() - 1);
    }

    String capitalizeFirstLetter(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}
