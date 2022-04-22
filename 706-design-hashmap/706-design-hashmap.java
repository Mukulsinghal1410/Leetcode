class MyHashMap {
    
    HashMap<Integer,Integer> hash;

    public MyHashMap() {
        
        this.hash = new HashMap<>();
        
    }
    
    public void put(int key, int value) {
        this.hash.put(key,value);
    }
    
    public int get(int key) {
        if(this.hash.containsKey(key)){
            return this.hash.get(key);
        }else{
            return -1;
        }
    }
    
    public void remove(int key) {
        if(this.hash.containsKey(key)){
            this.hash.remove(key);
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