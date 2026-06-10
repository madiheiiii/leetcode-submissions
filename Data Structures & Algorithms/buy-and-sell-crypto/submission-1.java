class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int l = prices[0];
        int r = 0;

        for(int i = 1; i<prices.length; i++){
            r = prices[i];
            if(l<r){
                res = Math.max(res, r-l);
            }
            else{
                l=prices[i];
            }
        }
    return res;       
    }
}
