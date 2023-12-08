// https://leetcode.com/problems/add-digits/description/
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

class Solution {
    public int addDigits(int num) {
        int newNum = num;

        while (Integer.toString(newNum).length() != 1) {
            int newValue = 0;
            String str = Integer.toString(newNum);

            for (int i = 0; i < str.length(); i++) {
                newValue += Character.getNumericValue(str.charAt(i));
            }

            newNum = newValue;
        }

        return newNum;
    }
}
