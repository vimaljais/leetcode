/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int p1 = 0;
        int p2 = height.length - 1;

        while (p1 < p2) {
            int h = Math.min(height[p1], height[p2]);
            int w = p2 - p1;
            int area = h * w;

            max = Math.max(max, area);

            if (height[p1] <= height[p2]) {
                p1++;
            } else {
                p2--;
            }

        }
        return max;

    }
}
// @lc code=end
