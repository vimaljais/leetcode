/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        int res = 0;
        boolean neg = false;
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            neg = s.charAt(i) == '-';
            i++;
        }
        while (i < s.length() && '0' <= s.charAt(i) && s.charAt(i) <= '9') {
            if (res > (Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res * 10 + (s.charAt(i) - '0');
            i++;
        }
        return neg ? -res : res;
    }
}
// @lc code=end

// @lc code=end
