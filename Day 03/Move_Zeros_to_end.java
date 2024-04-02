// Given an integer array nums, move all 0's to the end of it while maintaining
// the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }

        for(int i=count;i<n;i++){
            nums[i]=0;
        }
    }
}

//time complexity is O(n)
//space complexity is O(1)

//approach:
// 1. Initialize count as 0.
// 2. Traverse the array from the start to the end.
// 3. If the current element is not equal to 0, update the count element with the current element and increment count.
// 4. Traverse the array from count to the end and update the elements with 0.
// 5. Return the updated array.

