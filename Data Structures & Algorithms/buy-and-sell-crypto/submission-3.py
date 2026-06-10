class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l = prices[0]
        res = 0
        r = 0
        for i in range (1, len(prices)):
            r = prices[i];
            if l<r:
                res = max(res, r-l)
            else:
                l = prices[i]
        
        return res
        