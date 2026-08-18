class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # Largest cumulative difference
        seen_min = 101
        best_profit = 0
        for price in prices:
            if price < seen_min:
                seen_min = price
            else:
                print(price - seen_min)
                print(best_profit)
                if price - seen_min > best_profit:
                    best_profit = price - seen_min
        
        return best_profit

                
            
            