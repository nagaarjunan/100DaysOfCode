// Problem statement
// You are given an array ‘arr’ of ‘n’ strings.



// Find the longest common prefix in all these strings.



// If there is no common prefix in all the strings return "-1".


// Example:
// Input: 'arr' = [“abcd”, “abc”, “abref”, “abcde”]

// Output: ab

// Explanation:
// Answer is “ab”, as it is the longest prefix present in all the given strings.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 4
// Codingninjas
// Coding
// Coders
// Codezen


// Sample Output 1:
// Cod   


// Explanation of sample output 1:
// In the given testcase, the longest prefix that is present in all the strings is “Cod”. Hence the answer is “Cod”. 

// Sample Input 2:
// 3
// abcd
// Abcd
// abc
// Sample Output 2:
// -1


// Explanation of sample output 2:
// In the given testcase, there is no prefix that is present in all the strings. Hence the answer is “-1”


// Constraints:
// 1 <= ‘n’ <= 10^3
// 1 <= ‘arr[i].length’ <= 10^3

// Time Limit: 1 sec


// Expected Time Complexity:
// Try solving this in O(n).
class sloution{
    public static void main(String[] args) {
        String[] arr = {"abcd", "abc", "abref", "abcde"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] arr) {
        int n = arr.length;
        if(n == 0) return "-1";
        String prefix = arr[0];
        for(int i = 1; i < n; i++) {
            while(arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "-1";
            }
        }
        return prefix;
    }
}