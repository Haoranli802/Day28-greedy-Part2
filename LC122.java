class Solution {
    public int maxProfit(int[] prices) {
        int pre = prices[0];
        int sum = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > pre) sum += prices[i] - pre;
            pre = prices[i];
        }
        return sum;
    }
}
//O(N), O(1)
