// Medium
// Topics
// Companies
// There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [4,5,6,7,0,1,2], target = 0
// Output: 4
// Example 2:

// Input: nums = [4,5,6,7,0,1,2], target = 3
// Output: -1
// Example 3:

// Input: nums = [1], target = 0
// Output: -1
 

class Solution 
{
    public int search(int[] nums, int target) 
    {
        int start = 0;
        int end = nums.length -1;
        while(start <= end)
        {
            int mid = start + (end - start )/2;
            if(nums[mid] == target)
                return mid;
            if(nums[start] <= nums[mid])
            {
                if(target >= nums[start] && target < nums[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            else
            {
                if(target > nums[mid] && target <= nums[end])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
    }
}

// Time Complexity : O(log n)
// Space Complexity : O(1)

approach:
1. We will use binary search to find the target element.
2. We will check if the left part of the array is sorted or the right part of the array is sorted.
3. If the left part is sorted, we will check if the target element lies in the left part or not.
4. If the right part is sorted, we will check if the target element lies in the right part or not.
5. We will return the index of the target element if found, else we will return -1.

