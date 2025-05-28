121. Best Time to Buy and Sell Stock

  
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 
  *******************************************************************************************************************************************************************************
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

    *******************************************************************************************************************************************************************************
  
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

  *******************************************************************************************************************************************************************************

  class Solution {
    public int maxProfit(int[] prices) {
        
        int minSoFar=prices[0];
        int curProfit=0;
        int maxProfit=0;

        for(int i=0; i<prices.length; i++){
            minSoFar = Math.min(minSoFar, prices[i]);
            curProfit = prices[i] - minSoFar;
            maxProfit = Math.max(maxProfit, curProfit);
        }
        return maxProfit;
    }
}

  *******************************************************************************************************************************************************************************
    

TC: O(N), we are visiting all the elements in given input.
SC: O(1), we just took some variables but did not take ant data structure to store it.

  *******************************************************************************************************************************************************************************


  *******************************************************************************************************************************************************************************
    
prices = [  7,  1,  5,  3,  6,  4   ]
            ^
            i
            minSoFar=7          -> minSoFar = prices[0] -> min(prices[i], minSoFar)
            curProfit=7-7=0     -> curProfit = prices[i] - minSoFar 
            maxProfit=0         -> maxProfit = max(maxProfit, curProfit)

prices = [  7,  1,  5,  3,  6,  4   ]
                ^
                i
                minSoFar=(7,1)=1
                curProfit=1-1=0
                maxProfit=0

prices = [  7,  1,  5,  3,  6,  4   ]
                    ^
                    i
                    minSoFar=(1,5)=1
                    curProfit=5-1=4
                    maxProfit=4

prices = [  7,  1,  5,  3,  6,  4   ]
                        ^
                        i
                        minSoFar=(1,3)=1
                        curProfit=3-1=2
                        maxProfit=4

prices = [  7,  1,  5,  3,  6,  4   ]
                            ^
                            i
                            minSoFar=(1,6)=1
                            curProfit=6-1=5
                            maxProfit=5

prices = [  7,  1,  5,  3,  6,  4   ]
                                ^
                                i
                                minSoFar=(1,4)=1
                                curProfit=4-1=3
                                maxProfit=5

    *******************************************************************************************************************************************************************************
