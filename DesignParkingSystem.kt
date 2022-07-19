// https://leetcode.com/problems/design-parking-system
// Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.

class ParkingSystem(big: Int, medium: Int, small: Int) {
    private var isBigSlot = big
    private var isMediumSlot = medium
    private var isSmallSlot = small
    
    fun addCar(carType: Int) = when (carType) {
        1 -> if (isBigSlot > 0) {
            isBigSlot--
            true
        } else false
        2 -> if (isMediumSlot > 0) {
            isMediumSlot--
            true
        } else false
        3 -> if (isSmallSlot > 0) {
            isSmallSlot--
            true
        } else false
        else -> false
    }
}
