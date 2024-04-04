// Problem statement
// You are given a sorted array 'arr' of positive integers of size 'n'.

// It contains each number exactly twice except for one number, which occurs exactly once.

// Find the number that occurs exactly once.

// Example :
// Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.

// Output: 2

// Explanation: 1, 3, and 4 occur exactly twice. 2 occurs exactly once. Hence the answer is 2.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 5
// 1 1 2 2 3

// Sample Output 1:
// 3

// Explanation of sample output 1:
// {1, 2} each occurs twice, whereas 3 occurs only once.
// Hence the answer is 3.

// Sample Input 2:
// 5
// 8 8 9 9 10

// Sample Output 2:
// 10

// Expected time complexity :
// The expected time complexity is O(n), but try solving it in O(log n).

// Constraints:
// 1 <= 'n' <= 10^4
// 1 <= 'arr[i]' <= 10^9

// ‘n’ is always odd.

// Time Limit: 1 sec

class Solution {
    public static int getSingleElement(int[] arr) {
        int n = arr.length;
        int a = 0;

        for (int i = 0; i < n; i++) {
            a = a ^ arr[i];
        }
        return a;

    }
}

// time complexity is O(n)
// space complexity is O(1)

// approach:
// 1. Initialize a variable 'a' to 0.
// 2. Traverse the array from the start to the end.
// 3. For each element in the array, perform the XOR operation with 'a'.
// 4. Return the value of 'a' after traversing the array.
