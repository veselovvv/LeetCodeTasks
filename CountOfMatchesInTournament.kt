// https://leetcode.com/problems/count-of-matches-in-tournament/description/
// You are given an integer n, the number of teams in a tournament that has strange rules:
// - If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
// - If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
//Return the number of matches played in the tournament until a winner is decided.

class Solution {
    fun numberOfMatches(n: Int): Int {
        var matches = 0
        var teams = n
        var result = 0

        while (teams != 1) {
            if (teams % 2 == 0) {
                matches = teams / 2
                teams = teams / 2
            } else {
                matches = (teams - 1) / 2
                teams = (teams - 1) / 2 + 1
            }

            result += matches
        }

        return result
    }
}
