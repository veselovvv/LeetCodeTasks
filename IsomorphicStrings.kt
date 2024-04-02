// https://leetcode.com/problems/isomorphic-strings/description/?envType=daily-question&envId=2024-04-02
// Given two strings s and t, determine if they are isomorphic.
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        s.forEachIndexed { index, schar ->
            s.forEachIndexed { index1, schar1 ->
                if (index != index1 && schar == schar1) {
                    if (t.get(index) != t.get(index1)) return false
                }
            }
        }

        t.forEachIndexed { index, schar ->
            t.forEachIndexed { index1, schar1 ->
                if (index != index1 && schar == schar1) {
                    if (s.get(index) != s.get(index1)) return false
                }
            }
        }

        return true
    }
}
