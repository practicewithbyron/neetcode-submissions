class MyHashSet {
    // Using dual arrays, whereby the index of the key array, corresponds with the value in values at a given index
    private final List<Integer> set = new ArrayList<>();

    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if (!contains(key))
        {
            set.add(key);
        }
    }
    
    public void remove(int key) {
        set.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return set.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */