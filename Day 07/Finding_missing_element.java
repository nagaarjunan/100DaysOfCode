// Given an array nums containing n distinct numbers in the range [0, n], return
// the only number in the range that is missing from the array.

// Example 1:

// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range
// [0,3]. 2 is the missing number in the range since it does not appear in nums.
// Example 2:

// Input: nums = [0,1]
// Output: 2
// Explanation: n = 2 since there are 2 numbers, so all numbers are in the range
// [0,2]. 2 is the missing number in the range since it does not appear in nums.
// Example 3:

// Input: nums = [9,6,4,2,3,5,7,0,1]
// Output: 8
// Explanation: n = 9 since there are 9 numbers, so all numbers are in the range
// [0,9]. 8 is the missing number in the range since it does not appear in nums.
// class sloution{

// }

class Finding_missing_element {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum -= nums[i];
        }
        return sum;
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

// Approach:
// 1. Calculate the sum of the first n natural numbers using the formula n*(n+1)/2.
// 2. Subtract the sum of the elements in the array from the sum calculated in step 1.
// 3. The result is the missing number in the array.
