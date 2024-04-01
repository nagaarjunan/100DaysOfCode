// Problem statement
// Given an array 'arr' containing 'n' elements, rotate this array left once and
// return it.

// Rotating the array left by one means shifting all elements by one place to
// the left and moving the first element to the last position in the array.

// Example:

// Explain
// Input: 'a' = 5, 'arr' = [1, 2, 3, 4, 5]

// Output: [2, 3, 4, 5, 1]

// Explanation: We moved the 2nd element to the 1st position, and 3rd element to
// the 2nd position, and 4th element to the 3rd position, and the 5th element to
// the 4th position, and move the 1st element to the 5th position.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample input 1:
// 4
// 5 7 3 2
// Sample output 1:
// 7 3 2 5
// Explanation of sample input 1:
// Move the first element to the last and rest all the elements to the left.


import java.util.* ;
import java.io.*; 

class Solution {

    static int[] rotateArray(int[] arr, int n) {
        int temp = arr[0];
        for (int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        
        return arr;

    }

}

//time complexity is O(n)
//space complexity is O(1)

//approch:
// 1. Store the first element of the array in a temporary variable.
// 2. Traverse the array from the second element to the end.
// 3. Move the current element to the previous position.
// 4. Move the first element to the last position.
// 5. Return the array.

