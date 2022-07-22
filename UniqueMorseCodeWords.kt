// https://leetcode.com/problems/unique-morse-code-words/
// Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
// Return the number of different transformations among all words we have.

class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val letters = hashMapOf(
          'a' to ".-",'b' to "-...", 'c' to "-.-.",'d' to "-..", 'e' to ".",'f' to "..-.",'g' to "--.",'h' to "....",'i' to "..",'j' to ".---",'k' to "-.-",
          'l' to ".-..",'m' to "--",'n' to "-.",'o' to "---",'p' to ".--.",'q' to "--.-",'r' to ".-.",'s' to "...",'t' to "-",'u' to "..-",'v' to "...-",
          'w' to ".--",'x' to "-..-",'y' to "-.--",'z' to "--.."
        )
        var differentStrings = arrayOf<String>()
        
        words.forEachIndexed { index, string ->
            var newString = ""
            
            string.forEach { char ->
                newString += letters.get(char)
            }
            
            if (index == 0 || !differentStrings.contains(newString))  differentStrings += newString
        }
        
        return differentStrings.size
    }
}
