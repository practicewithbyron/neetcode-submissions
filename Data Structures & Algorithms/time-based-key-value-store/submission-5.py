# { "alice": {"1": "happy"}}

class TimeMap:

    def __init__(self):
        self.map_ = {}

    def set(self, key: str, value: str, timestamp: int) -> None:
        if self.map_.get(key) == None:
            self.map_[key] = [(timestamp, value)]
        else:
            self.map_[key].append((timestamp, value))
        

    def get(self, key: str, timestamp: int) -> str:
        # Get the largest stored timestamp that is <= timestamp
        window_start = 0
        tuple_pair = self.map_.get(key)

        if tuple_pair == None:
            return ""

        window_end = len(tuple_pair) - 1
        
        result = ""

        while window_start <= window_end:
            middle = (window_end + window_start) // 2

            if tuple_pair[middle][0] <= timestamp:
                # Valid, but there could be better
                result = tuple_pair[middle][1]
                window_start = middle + 1
            else:
                window_end = middle - 1
        
        return result