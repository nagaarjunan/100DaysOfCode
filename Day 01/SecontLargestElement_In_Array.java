// Problem statement
// You have been given an array ‘a’ of ‘n’ unique non-negative integers.

// Find the second largest and second smallest element from the array.

// Return the two elements (second largest and second smallest) as another array
// of size 2.

// Example :

// Explain
// Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
// Output: [4, 2]

// The second largest element after 5 is 4, and the second smallest element
// after 1 is 2.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1 :
// 4
// 3 4 5 2
// Sample Output 1 :
// 4 3
// Explanation For Sample Input 1 :
// The second largest element after 5 is 4 only, and the second smallest element
// after 2 is 3.

class Solution{
    public static int[] secondLargestAndSecondSmallest(int[] arr,int n){
        int[] result = new int[2];
        int max = arr[0];
        int min = arr[0];
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
            if(arr[i]<min){
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i]<secondMin && arr[i]!=min){
                secondMin = arr[i];
            }
        }
        result[0] = secondMax;
        result[1] = secondMin;
        return result;
    }
}

//time complexity is O(n)   
//space complexity is O(1)

//approch:
// 1. Initialize max and min as the first element of the array.
// 2. Initialize secondMax as Integer.MIN_VALUE and secondMin as Integer.MAX_VALUE.
// 3. Traverse the array from the second element to the end.
// 4. If the current element is greater than the max, update the max and secondMax.
// 5. If the current element is less than the min, update the min and secondMin.
// 6. Return the secondMax and secondMin.
