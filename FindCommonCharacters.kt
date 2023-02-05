// https://leetcode.com/problems/find-common-characters/description/
// Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). 
// You may return the answer in any order.

class Solution {
    fun commonChars(words: Array<String>): List<String> {
        val wordsArray = words
        val result = mutableListOf<String>()

        wordsArray[0].forEach { char ->
            var everyStringContainsChar = true

            wordsArray.forEach { word ->
                if (!word.contains(char)) everyStringContainsChar = false
            }
            
            if (everyStringContainsChar) {
                wordsArray.forEachIndexed { wordArrayIndex, word ->
                    val deleteIndex = word.indexOf(char)

                    var wordWithDeletedLetter = ""

                    word.forEachIndexed { index, letter ->
                        if (index != deleteIndex) wordWithDeletedLetter += letter
                    }

                    wordsArray[wordArrayIndex] = wordWithDeletedLetter
                }

                result.add(char.toString())
            }
        }

        return result
    }
}
