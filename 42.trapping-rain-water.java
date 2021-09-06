/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int total = 0;

        int p1 = 0;
        int p2 = height.length - 1;

        int maxL = 0;
        int maxR = 0;

        while (p1 < p2) {

            int cw = 0;

            if (height[p1] <= height[p2]) {
                if (height[p1] > maxL) {
                    maxL = height[p1];
                    p1++;
                } else {
                    cw = maxL - height[p1];
                    total += cw;
                    p1++;
                }
            }

            else {
                if (height[p2] > maxR) {
                    maxR = height[p2];
                    p2--;
                } else {
                    cw = maxR - height[p2];
                    total += cw;
                    p2--;
                }
            }

        }
        return total;
    }
}
// @lc code=end
