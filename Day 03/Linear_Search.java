// Problem statement
// You are given an array ‘arr’ containing ‘n’ integers. You are also given an
// integer ‘num’, and your task is to find whether ‘num’ is present in the array
// or not.

// If ‘num’ is present in the array, return the 0-based index of the first
// occurrence of ‘num’. Else, return -1.

// Example:
// Input: ‘n’ = 5, ‘num’ = 4
// 'arr' = [6,7,8,4,1]

// Output: 3

// Explanation:
// 4 is present at the 3rd index.

import java.util.*;
class Solution {
    public static int linearSearch(int n, int num, int []arr){
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
       
    }
}

//time complexity is O(n)
//space complexity is O(1)

//approach:
// 1. Traverse the array from the start to the end.
// 2. If the current element is equal to the given number, return the index.
// 3. If the number is not found, return -1.
