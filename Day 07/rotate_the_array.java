// Problem statement
// You are given a square matrix ‘Mat’ of size ‘N’. You need to rotate ‘Mat’ by 90 degrees in the clockwise direction.

// Note:

// You must rotate the matrix in place, i.e., you must modify the given matrix itself. You must not allocate another square matrix for rotation.
// For example

// When,
// ‘N’ = 2 and ‘Mat’ = {{1, 2}, {3, 4}}, we must modify ‘Mat’ to {{3, 1}, {4, 2}}.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= N <= 100
// 1 <= Mat[i][j] <= 10^9

// Time Limit: 1 sec

class slution{

    public static void rotateMatrix(int[][] mat, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[n - 1 - j][i];
                mat[n-1-j][i] = mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j] = mat[j][n-1-i];
                mat[j][n-1-i] = temp;
            }
        }
    }
}

// Time complexity: O(n^2)
// Space complexity: O(1)

//approach in simple steps:
// 1. Traverse the matrix in a circular manner.
// 2. For each element, swap the elements in the following order:
//    a. mat[i][j] with mat[j][n-1-i]
//    b. mat[i][j] with mat[n-1-i][n-1-j]
//    c. mat[i][j] with mat[n-1-j][i]
// 3. Repeat the above steps for all elements in the matrix.

