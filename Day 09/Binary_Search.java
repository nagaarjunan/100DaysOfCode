// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4
// Example 2:

// Input: nums = [-1,0,3,5,9,12], target = 2
// Output: -1
// Explanation: 2 does not exist in nums so return -1

class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        System.out.println(s.search(nums, target));
    }

    
}

// Time Complexity: O(log n)
// Space Complexity: O(1)

// approach
// 1. Initialize two pointers l and r to the start and end of the array
// respectively.
// 2. While l <= r, calculate mid as (l + r) / 2.
// 3. If nums[mid] == target, return mid.
// 4. If nums[mid] > target, update r = mid - 1.
// 5. If nums[mid] < target, update l = mid + 1.
// 6. If the loop ends, return -1 as the target is not found in the array.
