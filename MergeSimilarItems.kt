// https://leetcode.com/problems/merge-similar-items
// You are given two 2D integer arrays, items1 and items2, representing two sets of items. Each array items has the following properties:
// - items[i] = [valuei, weighti] where valuei represents the value and weighti represents the weight of the ith item.
// - The value of each item in items is unique.
// Return a 2D integer array ret where ret[i] = [valuei, weighti], with weighti being the sum of weights of all items with value valuei.
// Note: ret should be returned in ascending order by value.

class Solution {
    fun mergeSimilarItems(items1: Array<IntArray>, items2: Array<IntArray>): List<List<Int>> {
        var value = 0
        var weight = 0
        var map = LinkedHashMap<Int, Int>()
        
        items1.forEach { item1 ->
            item1.forEachIndexed { index, num -> 
                if (index == 0) value = num else weight = num
            }
            map.put(value, weight)
        }
        
        items2.forEach { item2 ->
            item2.forEachIndexed { index, num ->
                if (index == 0) value = num else weight = num
            }
            
            if (map.keys.contains(value)) map.put(value, map.get(value)?.plus(weight) ?: weight)
            else map.put(value, weight)
        }
        
        val result = mutableListOf<List<Int>>()
        
        map.toSortedMap().forEach {
            result.add(listOf(it.key, it.value))
        }
        
        return result
    }
}
