class MyHashMap {
    private final List<Integer> keys = new ArrayList<>();
    private final List<Integer> values = new ArrayList<>();
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        if (keys.contains(key))
        {
            values.remove(keys.indexOf(key));
            keys.remove(Integer.valueOf(key));
        }
        keys.add(key);
        values.add(value);
    }
    
    public int get(int key) {
        if (!keys.contains(key))
        {
            return -1;
        }
        else
        {
            return values.get(keys.indexOf(key));
        }
    }
    
    public void remove(int key) {
        if (keys.contains(key))
        {
            values.remove(keys.indexOf(key));
            keys.remove(Integer.valueOf(key));
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */