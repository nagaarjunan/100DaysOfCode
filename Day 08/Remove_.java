// Problem statement
// You are given a string 'S' of length 'N' representing an integer.

// A string is a valid parenthesis if it satisfies one of the following
// conditions:

// If the string is empty or consists of a character other than ‘(‘ and ')'.

// If the string can be represented as a concatenation of two strings such that
// both strings are valid parentheses strings.

// If the string can be represented as '(A)', where A is a valid parenthesis.

// Depth of a string is defined as follows:

// depth( '' )=0

// depth( A )=0, where ‘A’ is an empty string or consists of a character other
// than ‘(‘ and ‘)’.

// depth( A+B )=max(depth( A ), depth( B )), such that ‘A’ and ‘B’ are both
// strings are valid parentheses strings.

// depth( (A) ) = 1+depth(A), where ‘A’ is a valid parentheses string.

// Given a valid parentheses string ‘S’, you must return the nesting depth of
// the string ‘S’.

// Example:

// Input:
// S = '1+(3*6+(9-3))', N=13
// Output: 2

// Explanation: The digits 9 and 3 are inside of 2 nested parentheses. Hence we
// return 2.

class sloution{
    public static int maxDepth(String s){
        int maxDepth = 0;
        int currentDepth = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            }
            else if(s.charAt(i) == ')'){
                currentDepth--;
            }
        }
        return maxDepth;
    }
}