import collections

class LRUCache:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.cache = OrderedDict()
        self.size = 0

    def get(self, key: int) -> int:
        # Refresh usage to the back
        value = self.cache.get(key, -1)
        if value != -1:
            value = self.cache.pop(key)
            self.cache[key] = value
        return value

    def put(self, key: int, value: int) -> None:
        # Remove the first el
        # Already in there?
        if self.cache.get(key, -1) != -1:
            self.cache.pop(key)
            self.cache[key] = value
        elif self.size >= self.capacity:
            self.cache.popitem(last=False)
            self.cache[key] = value
        else:
            self.cache[key] = value
            self.size += 1

        
        # See if value is already in there
        # If so, remove it, and add it back in
        # If above capacity, remove first value and add it on
        
        
        
