// Given an array nums with n objects colored red, white, or blue, sort them
// in-place so that objects of the same color are adjacent, with the colors in
// the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and
// blue, respectively.

// You must solve this problem without using the library's sort function.

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]

// Constraints:

// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.

class Solution {
    public void sortColors(int[] nums) {
        
        int count_0=0;
        int count_1=0;
        int count_2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count_0++;
            }
            else if(nums[i]==1){
                count_1++;
            }
            else{
                count_2++;
            }
        }

        for(int i=0;i<count_0;i++){
            nums[i]=0;

        }
        for(int i=count_0;i<count_0+count_1;i++){
            nums[i]=1;
        }
        for(int i=count_0+count_1;i<nums.length;i++){
            nums[i]=2;
        }
        
    }
}

// time complexity is O(n)
// space complexity is O(1)

// approach:
// 1. Initialize count_0, count_1, and count_2 as 0.
// 2. Traverse the array from the start to the end.
// 3. If the current element is 0, increment count_0.
// 4. If the current element is 1, increment count_1.
// 5. If the current element is 2, increment count_2.
// 6. Traverse the array from the start to count_0 and update the elements with 0.
// 7. Traverse the array from count_0 to count_0+count_1 and update the elements with 1.
// 8. Traverse the array from count_0+count_1 to the end and update the elements with 2.
// 9. Return the updated array.
