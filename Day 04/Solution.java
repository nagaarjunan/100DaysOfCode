// Problem statement
// Sam want to read exactly ‘TARGET’ number of pages.

// He has an array ‘BOOK’ containing the number of pages for ‘N’ books.

// Return YES/NO, if it is possible for him to read any 2 books and he can meet
// his ‘TARGET’ number of pages.

// Example:
// Input: ‘N’ = 5, ‘TARGET’ = 5
// ‘BOOK’ = [4, 1, 2, 3, 1]

// Output: YES
// Explanation:
// Sam can buy 4 pages book and 1 page book.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 5 5
// 4 1 2 3 1
// Sample Output 1 :
// YES
// Explanation Of Sample Input 1:
// Sam can buy 4 pages book and 1-page book.
// Sample Input 2:
// 2 1
// 1 2
// Sample Output 2 :
// NO
// Expected Time Complexity:
// O( N ), Where N is the length of the array.
// Constraints:
// 1 <= N <= 10^3
// 1 <= BOOK[i], TARGET <= 10^6
// Time Limit: 1 sec

class Solution {
    public static String read(int n, int []book, int target){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(book[i]+book[j]==target){
                    return "YES";
                }
            }
        }
        return "NO";
    }    
    
}

//time complexity is O(n^2)
//space complexity is O(1)

//approach:
// 1. Traverse the array from the start to the end.
// 2. Traverse the array from the next element to the end.
// 3. If the sum of the current element and the next element is equal to the target, return "YES".
// 4. If no such pair is found, return "NO".
