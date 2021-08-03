/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {

        int test = x;
        var rev = 0;

        while (test > 0) {
            rev = rev * 10 + test % 10;
            test = test / 10;
        }

        return rev == x;

    }
}
// @lc code=end
