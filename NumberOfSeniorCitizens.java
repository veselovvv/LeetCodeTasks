// https://leetcode.com/problems/number-of-senior-citizens/description/
// You are given a 0-indexed array of strings details. Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:
// - The first ten characters consist of the phone number of passengers.
// - The next character denotes the gender of the person.
// - The following two characters are used to indicate the age of the person.
// - The last two characters determine the seat allotted to that person.
// Return the number of passengers who are strictly more than 60 years old.

class Solution {
    public int countSeniors(String[] details) {
        int result = 0;

        for (int i = 0; i < details.length; i++) {
            String age = "";

            age += details[i].charAt(11);
            age += details[i].charAt(12);

            if (Integer.valueOf(age) > 60) result++;
        }

        return result;
    }
}
