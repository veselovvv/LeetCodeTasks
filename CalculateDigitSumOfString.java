// https://leetcode.com/problems/calculate-digit-sum-of-a-string/
// You are given a string s consisting of digits and an integer k.
// A round can be completed if the length of s is greater than k. In one round, do the following:
// 1. Divide s into consecutive groups of size k such that the first k characters are in the first group, the next k characters are in the second group, and so on. 
// Note that the size of the last group can be smaller than k.
// 2. Replace each group of s with a string representing the sum of all its digits. For example, "346" is replaced with "13" because 3 + 4 + 6 = 13.
// 3. Merge consecutive groups together to form a new string. If the length of the string is greater than k, repeat from step 1.
// Return s after all rounds have been completed.

class Solution {
    public String digitSum(String s, int k) {
        if (s.length() <= k) return s;

        String group = "";
        String[] groups = new String[0];

        for (int index = 0; index < s.length(); index++) {
            char letter = s.charAt(index);

            if (group.length() == k) {
                groups = addToArray(groups, group);
                group = "";
            }

            group += letter;

            if (index == s.length() - 1)
                groups = addToArray(groups, group);
        }

        StringBuilder sums = new StringBuilder();

        for (String string : groups) {
            int sum = 0;

            for (int i = 0; i < string.length(); i++) {
                char num = string.charAt(i);
                sum += Character.getNumericValue(num);
            }

            sums.append(sum);
        }

        return sums.length() >= 3 ? digitSum(sums.toString(), k) : sums.toString();
    }

    String[] addToArray(String[] array, String element) {
        String[] newArray = new String[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = element;
        return newArray;
    }
}
