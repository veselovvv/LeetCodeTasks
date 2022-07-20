// https://leetcode.com/problems/decode-the-message
// You are given the strings key and message, which represent a cipher key and a secret message, respectively. Return the decoded message.

class Solution {
    fun decodeMessage(key: String, message: String): String {
        val map = LinkedHashMap<Char, Char>(26)
        var result = ""
        var value = 'a'
        
        key.forEach {
            if (it != ' ' && !map.keys.contains(it)) {
                map.put(it, value)
                value++
            }
        }
        
        message.forEach { mChar ->
            if (mChar == ' ') result += mChar
            else result += map.get(mChar)
        }
        
        return result
    }
}
