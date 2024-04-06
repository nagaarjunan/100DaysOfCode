// Problem statement
// You are given an array of integers 'prices' of size 'n', where ‘prices[i]’ is
// the price of a given stock on an ‘i’-th day.

// You want to maximize the profit by choosing a single day to buy one stock and
// a different day to sell that stock.

// Please note that you can’t sell a stock before you buy one.

// Return the maximum profit you can achieve from this transaction.

// Example :
// Input: ‘prices’ =[7, 1, 5, 4, 3, 6]

// Output: 5

// Explanation: Purchase stock on day two, where the price is one, and sell it
// on day six, where the price is 6, profit = 6 - 1 = 5.

// Hence we return 5.
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 6
// 7 1 5 4 3 6

// Sample Output 1 :
// 5

// Explanation Of Sample Input 1:
// Purchase stock on day two, where the price is one, and sell it on day six,
// where the price is 6. Profit = 6 - 1 = 5.

// Sample Input 2:
// 5
// 5 4 3 2 1

// Sample Output 2 :
// 0

// Expected time complexity :
// The expected time complexity is O(n).

class solution{
    public int maxProfit(int[] prices){
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }
}

// time complexity is O(n)
// space complexity is O(1)

// approach:
// 1. Initialize min as Integer.MAX_VALUE and max as 0.
// 2. Traverse the array from the start to the end.
// 3. If the current element is less than min, update min as the current element.
// 4. Otherwise, update max as the maximum of max and the difference between the
// current element and min.
// 5. Return max.