// Problem statement
// You have been given an array ‘a’ of ‘n’ non-negative integers.You have to
// check whether the given array is sorted in the non-decreasing order or not.

// Your task is to return 1 if the given array is sorted. Else, return 0.

// Example :
// Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
// Output: 1

// The given array is sorted in non-decreasing order; hence the answer will be
// 1.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1 :
// 4
// 0 0 0 1
// Sample Output 1 :
// 1
// Explanation For Sample Input 1 :
// The given array is sorted in non-decreasing order; hence the answer will be
// 1.
// Sample Input 2 :
// 5
// 4 5 4 4 4
// Sample Output 2 :
// 0

class Sloution{
    public static int isSorted(int []arr,int n){
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                return 0;
            }
        }
        return 1;
    }
}

//time complexity is O(n)       
//space complexity is O(1)

//approch:
// 1. Traverse the array from the first element to the second last element.
// 2. If the current element is greater than the next element, return 0.
// 3. If the loop completes, return 1.