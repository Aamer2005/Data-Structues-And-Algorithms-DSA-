//Given an array arr of n integers, where arr[i] represents price of the stock 
//on the ith day. Determine the maximum profit achievable by buying and s
// elling the stock at most once. 

// The stock should be purchased before selling it,
// and both actions cannot occur on the same day.
class Solution {
    public int maxProfit(int[] prices) {

            int minPrice = Integer.MAX_VALUE;
            int currentPrice = 0;
            int profit;
            int maxProfit = Integer.MIN_VALUE;

            for(int i : prices )
            {
                currentPrice = i;

                if(currentPrice<minPrice)
                {
                    minPrice = currentPrice;
                }

                profit = currentPrice - minPrice ;

                if(profit>maxProfit)
                {
                    maxProfit = Integer.max(maxProfit,profit);
                }
            }

            return maxProfit;
    }
}