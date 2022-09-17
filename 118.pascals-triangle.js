/*
 * @lc app=leetcode id=118 lang=javascript
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function (numRows) {
  const result = [];
  let rows = 0;
  while (rows < numRows) {
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
  return result;
};
// @lc code=end
