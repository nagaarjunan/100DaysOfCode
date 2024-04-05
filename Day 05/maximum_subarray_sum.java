// Given an integer array nums, find the
// subarray
// with the largest sum, and return its sum.

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.
// Example 3:

// Input: nums = [5,4,-1,7,8]
// Output: 23
// Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
         return maxi;
    }
}

// time complexity is O(n)
// space complexity is O(1)

// approach:
// 1. Initialize maxi as Integer.MIN_VALUE and sum as 0.
// 2. Traverse the array from the start to the end.
// 3. Update sum as the sum of the current element and sum.
// 4. Update maxi as the maximum of maxi and sum.
// 5. If sum is less than 0, update sum as 0.
// 6. Return maxi.
