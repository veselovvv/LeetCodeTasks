// https://leetcode.com/problems/strong-password-checker-ii/
// A password is said to be strong if it satisfies all the following criteria:
// - It has at least 8 characters.
// - It contains at least one lowercase letter.
// - It contains at least one uppercase letter.
// - It contains at least one digit.
// - It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
// - It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).
// Given a string password, return true if it is a strong password. Otherwise, return false.

class Solution {
    fun strongPasswordCheckerII(password: String) = when {
        password.length < 8 -> false
        password.containsLowerCaseLetter() != true -> false
        password.containsUpperCaseLetter() != true -> false
        password.containsDigit() != true -> false
        password.containsSpecialCharacter() != true -> false
        password.containsTwoTheSameCharactersInAdjacentPositions() -> false
        else -> true
    }
    
    fun String.containsLowerCaseLetter(): Boolean {
        forEach { letter ->
            if (Character.isLowerCase(letter)) return true
        }
        
        return false
    }
    
    fun String.containsUpperCaseLetter(): Boolean {
        forEach { letter ->
            if (Character.isUpperCase(letter)) return true
        }
        
        return false
    }
    
    fun String.containsDigit(): Boolean {
        forEach { letter ->
            if (letter.isDigit()) return true
        }
        
        return false
    }
    
    fun String.containsSpecialCharacter(): Boolean {
        "!@#$%^&*()-+".forEach { specialChar ->
            if (this.contains(specialChar)) return true
        }
        
        return false
    }
    
    fun String.containsTwoTheSameCharactersInAdjacentPositions(): Boolean {
        var previous = this.get(0)
        
        forEachIndexed { index, element ->
            if (index != 0) {
                if (element == previous) return true
                previous = this.get(index)
            }
        } 
        
        return false
    }
}
