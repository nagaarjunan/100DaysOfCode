// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]

class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int start = 0;
        int end = nums.length -1;
        int[] result = new int[2];
        result[0] = findStart(nums, target, start, end);
        result[1] = findEnd(nums, target, start, end);
        return result;
    }
    private int findStart(int[] nums, int target, int start, int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start )/2;
            if(nums[mid] == target )
            {
                if(mid == 0 || nums[mid-1] != target)
                    return mid;
                else
                    end = mid-1;
            }
            else if(nums[mid] < target)
                start = mid+1;
            else 
                end = mid-1;
        }
        return -1;
    }
    private int findEnd(int[] nums, int target, int start, int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start )/2;
            if(nums[mid] == target )
            {
                if(mid == nums.length-1 || nums[mid+1] != target)
                    return mid;
                else
                    start = mid+1;
            }
            else if(nums[mid] < target)
                start = mid+1;
            else 
                end = mid-1;
        }
        return -1;
    }
}

// Time Complexity : O(log n)
// Space Complexity : O(1)

//approach : Binary Search
//start and end are the pointers to the start and end of the array
//mid is the middle element of the array
//if the mid element is equal to the target element, check if the mid element is the first occurence of the target element, if yes return the mid index, else move the end pointer to mid-1
//if the mid element is less than the target element, move the start pointer to mid+1
//if the mid element is greater than the target element, move the end pointer to mid-1
//return the start pointer as the index where the target element should be inserted.
//similarly for finding the end index, check if the mid element is the last occurence of the target element, if yes return the mid index, else move the start pointer to mid+1
//if the mid element is less than the target element, move the start pointer to mid+1
//if the mid element is greater than the target element, move the end pointer to mid-1
//return the end pointer as the index where the target element should be inserted.
