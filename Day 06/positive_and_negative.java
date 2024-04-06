
// You are given a 0-indexed integer array nums of even length consisting of an
// equal number of positive and negative integers.

// You should return the array of nums such that the the array follows the given
// conditions:

// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in
// nums is preserved.
// The rearranged array begins with a positive integer.
// Return the modified array after rearranging the elements to satisfy the
// aforementioned conditions.

// Example 1:

// Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]
// Explanation:
// The positive integers in nums are [3,1,2]. The negative integers are
// [-2,-5,-4].
// The only possible way to rearrange them such that they satisfy all conditions
// is [3,-2,1,-5,2,-4].
// Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are
// incorrect because they do not satisfy one or more conditions.
// Example 2:

// Input: nums = [-1,1]
// Output: [1,-1]
// Explanation:
// 1 is the only positive integer and -1 the only negative integer in nums.
// So nums is rearranged to [1,-1].

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0;
        int neg=1;
        int ans[]=new int[nums.length];

        for (int i=0;i<nums.length;i++){
           if(nums[i]>0){
            ans[pos]=nums[i];
            pos=pos+2;
           }
           else{
            ans[neg]=nums[i];
            neg=neg+2;
           }
        }
        return ans;

    }
}

// time complexity is O(n)
// space complexity is O(n)

// approach:
// 1. Initialize two variables pos and neg as 0 and 1.
// 2. Initialize an array ans of size n.
// 3. Traverse the array from the start to the end.
// 4. If the current element is positive, update ans[pos] as the current element
// and increment pos by 2.
// 5. If the current element is negative, update ans[neg] as the current element
// and increment neg by 2.
// 6. Return ans.


