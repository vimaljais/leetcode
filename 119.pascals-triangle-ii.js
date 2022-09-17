/*
 * @lc app=leetcode id=119 lang=javascript
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
/**
 * @param {number} rowIndex
 * @return {number[]}
 */
var getRow = function (rowIndex) {
  const result = [];
  let rows = 0;
  while (rows < rowIndex + 1) {
    let last = [1];
    if (result.length > 0) {
      for (let i = 1; i < result[result.length - 1].length; i++) {
        last.push(
          result[result.length - 1][i - 1] + result[result.length - 1][i]
        );
      }
      last.push(1);
    }
    result.push(last);
    rows++;
  }
  return result[rowIndex];
};
// @lc code=end
