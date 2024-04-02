// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
// Example 2:

// Input: nums = [1,0,1,1,0,1]
// Output: 2

// Constraints:

// 1 <= nums.length <= 105
// nums[i] is either 0 or 1

public class MaximumConsecutive_Ones {

}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int a = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            a = Math.max(a, count);
        }

        return a;
    }
}

// time complexity is O(n)
// space complexity is O(1)

// approach:
// 1. Initialize count and a as 0.
// 2. Traverse the array from the start to the end.
// 3. If the current element is 1, increment count.
// 4. If the current element is 0, update count as 0.
// 5. Update a as the maximum of a and count.
// 6. Return a.
