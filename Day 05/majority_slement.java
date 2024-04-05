// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You
// may assume that the majority element always exists in the array.

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = nums[i];
            } else if (element == nums[i]) {
                count++;
            } else {
                count--;

            }
        }

        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == element) {
                cnt1++;
            }
        }

        if (cnt1 > (n / 2)) {
            return element;
        }
        return -1;
    }

}

// time complexity is O(n)
// space complexity is O(1)

// approach:
// 1. Initialize count and element as 0.
// 2. Traverse the array from the start to the end.
// 3. If count is 0, update count as 1 and element as the current element.
// 4. If the current element is equal to element, increment count.
// 5. If the current element is not equal to element, decrement count.
// 6. Traverse the array from the start to the end and count the frequency of
// the element.
// 7. If the frequency of the element is greater than n/2, return the element.
// 8. Otherwise, return -1.
// 9. Return the element.
