// https://leetcode.com/problems/defanging-an-ip-address/
// Given a valid (IPv4) IP address, return a defanged version of that IP address. A defanged IP address replaces every period "." with "[.]".

class Solution {
    fun defangIPaddr(address: String): String {
        var resultString = ""
        
        address.map {
            if (it == '.') resultString += "[.]" else resultString += it
        }
        
        return resultString
    }
}
