// https://leetcode.com/problems/find-center-of-star-graph/
// There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there is one center node and exactly n - 1 edges 
// that connect the center node with every other node. You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between 
// the nodes ui and vi. Return the center of the given star graph.

class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        var count = 0
        var first = 0
        var second = 0
        
        edges.forEach {
            if (count == 0) {
                first = it[0]
                second = it[1]
                count = 1
            } else if (it.contains(first)) return first
        }
        
        return second
    }
}
