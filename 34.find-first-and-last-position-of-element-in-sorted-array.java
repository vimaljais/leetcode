/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {

        int p1 = 0;
        int p2 = nums.length - 1;
        int cc = 0;
        int dd = 0;

        int val[] = { -1, -1 };

        while (p1 < nums.length && p2 >= 0) {
            if (nums[p1] == target && cc == 0) {
                val[0] = p1;
                cc = 1;

            }

            if (nums[p2] == target && dd == 0) {
                val[1] = p2;
                dd = 1;
            }

            if (cc == 1 && dd == 1) {
                break;
            }
            p1++;
            p2--;
        }

        return val;

    }
}
// @lc code=end
