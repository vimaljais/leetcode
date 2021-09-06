/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {

        int max = 0;

        if (nums.length == 1) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (i + nums[i] >= nums.length - 1) {
                return true;
            }
            if (i + nums[i] > max) {
                max = i + nums[i];
            }

            if (max <= i) {
                return false;
            }
        }
        return false;
    }
}
// @lc code=end
