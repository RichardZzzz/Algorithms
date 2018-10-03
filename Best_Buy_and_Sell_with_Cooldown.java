// Example:

// Input: [1,2,3,0,2]
// Output: 3 
// Explanation: transactions = [buy, sell, cooldown, buy, sell]

public class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
        for(int price : prices){
            prev_buy = buy;
            buy = Math.max(prev_sell-price, prev_buy);
            prev_sell = sell;
            sell = Math.max(prev_buy+price, prev_sell);
        }
        return sell;
    }
}