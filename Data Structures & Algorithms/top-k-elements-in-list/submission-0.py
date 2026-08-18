class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # map to count
        # sort and get x highest?

        map_count = {}
        for num in nums:
            if num not in map_count.keys():
                map_count[num] = 1
            else:
                map_count[num] = map_count[num] + 1
   
        sorted_count = list(dict(sorted(map_count.items(), key=lambda item: item[1], reverse=True)).keys())

        to_return = []
        for i in range(k):
            to_return.append(sorted_count[i])
        
        return to_return

            
        
        