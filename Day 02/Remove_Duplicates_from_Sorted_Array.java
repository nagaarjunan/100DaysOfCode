// Problem statement
// You are given a sorted integer array 'arr' of size 'n'.

// You need to remove the duplicates from the array such that each element
// appears only once.

// Return the length of this new array.

// Note:
// Do not allocate extra space for another array. You need to do this by
// modifying the given input array in place with O(1) extra memory.

// For example:
// 'n' = 5, 'arr' = [1 2 2 2 3].
// The new array will be [1 2 3].
// So our answer is 3.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample input 1:
// 10
// 1 2 2 3 3 3 4 4 5 5
// Sample output 1:
// 5
// Explanation of sample input 1:
// The new array will be [1 2 3 4 5].
// So our answer is 5.

class Solution {
    public static int removeDuplicates(int[] arr,int n) {
        int i=0;
        for (int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
}
}

//time complexity is O(n)
//space complexity is O(1)

//approch:
// 1. Initialize i as 0.
// 2. Traverse the array from the second element to the end.
// 3. If the current element is not equal to the previous element, increment i and update the ith element with the current element.
// 4. Return i+1.
