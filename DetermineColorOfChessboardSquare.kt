// https://leetcode.com/problems/determine-color-of-a-chessboard-square/
// You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.
// Return true if the square is white, and false if the square is black.
// The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.

class Solution {
    fun squareIsWhite(coordinates: String): Boolean {
        val whiteSquares = arrayOf(
            "b1", "d1", "f1", "h1", 
            "a2", "c2", "e2", "g2", 
            "b3", "d3", "f3", "h3", 
            "a4", "c4", "e4", "g4", 
            "b5", "d5", "f5", "h5",
            "a6", "c6", "e6", "g6",
            "b7", "d7", "f7", "h7",
            "a8", "c8", "e8", "g8"
        )
        
        whiteSquares.forEach {
            if (coordinates == it) return true
        }
        
        return false
    }
}
