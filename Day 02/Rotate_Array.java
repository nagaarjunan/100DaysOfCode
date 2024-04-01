// Problem statement
// Given an array 'arr' with 'n' elements, the task is to rotate the array to
// the left by 'k' steps, where 'k' is non-negative.

// Example:
// 'arr '= [1,2,3,4,5]
// 'k' = 1 rotated array = [2,3,4,5,1]
// 'k' = 2 rotated array = [3,4,5,1,2]
// 'k' = 3 rotated array = [4,5,1,2,3] and so on.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 8
// 7 5 2 11 2 43 1 1
// 2
// Sample Output 1:
// 2 11 2 43 1 1 7 5
// Explanation of Sample Input 1:
// Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
// Rotate 2 steps to the left: 2 11 2 43 1 1 7 5
// Sample Input 2:
// 4
// 5 6 7 8
// 3
// Sample Output 2:
// 8 5 6 7

import java.util.ArrayList;

class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = k; i < arr.size(); i++){
            res.add(arr.get(i));
        }
        for(int i = 0; i < k; i++){
            res.add(arr.get(i));
        }
        return res;
    }
        
}

//time complexity is O(n)
//space complexity is O(n)

//approach:
// 1. Create an empty arraylist to store the rotated array.
// 2. Traverse the array from the kth element to the end and add the elements to the new arraylist.
// 3. Traverse the array from the start to the kth element and add the elements to the new arraylist.
// 4. Return the new arraylist.


