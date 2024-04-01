// Problem statement
// Given an array ‘arr’ of size ‘n’ find the largest element in the array.

// Example:

// Explain
// Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]

// Output: 5

// Explanation: From the array {1, 2, 3, 4, 5}, the largest element is 5.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample input 1:
// 6
// 4 7 8 6 7 6
// Sample output 1:
// 8
// Explanation of sample input 1:
// The answer is 8.
// From {4 7 8 6 7 6}, 8 is the largest element.
// Sample input 2:
// 8
// 5 9 3 4 8 4 3 10
// Sample output 2:
// 10
// Expected Time Complexity:
// O(n), Where ‘n’ is the size of an input array ‘arr’.
// Constraints :
// 1 <= 'n' <= 10^5
// 1 <= 'arr[i]' <= 10^9

// Time Limit: 1 sec

class Sloution{
    public static int largestElement(int[] arr,int n){
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}

//time complexity is O(n)
//space complexity is O(1)

//approch in short:
// 1. Initialize max as the first element of the array.
// 2. Traverse the array from the second element to the end.
// 3. If the current element is greater than the max, update the max.
// 4. Return the max.
