// https://leetcode.com/problems/reformat-date/
// Given a date string in the form Day Month Year. Convert the date string to the format YYYY-MM-DD

class Solution {
    fun reformatDate(date: String): String {
        var day = ""
        var month = ""
        var year = ""
        var dayIsOneDigit = false
        
        date.forEachIndexed { index, char ->
            when (index) {
                0 -> day += char
                1 -> if (char == 's' || char == 'n' || char == 'r' || char == 't') {
                    day = "0" + day
                    dayIsOneDigit = true
                } else day += char
            }
            
            if (dayIsOneDigit) when (index) {
                in 4..6 -> month += char
                in 8..11 -> year += char
            } else when (index) {
                in 5..7 -> month += char
                in 9..12 -> year += char
            }
        }
        
        val monthDigit = when (month) {
            "Jan" -> "01"
            "Feb" -> "02"
            "Mar" -> "03"
            "Apr" -> "04"
            "May" -> "05"
            "Jun" -> "06"
            "Jul" -> "07"
            "Aug" -> "08"
            "Sep" -> "09"
            "Oct" -> "10"
            "Nov" -> "11"
            else -> "12"
        }
        
        return year + '-' + monthDigit + '-' + day
    }
}
