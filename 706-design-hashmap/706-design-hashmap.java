class MyHashMap {
    int hashMap[];
    public MyHashMap() {
        hashMap = new int[1000000];
        Arrays.fill(hashMap, -1);
    }
    
    public void put(int key, int value) {
        int i = getKey (key);
        hashMap[i] = value;
    }
    
    public int get(int key) {
        int i = getKey (key);
        return hashMap[i];
    }
    
    public void remove(int key) {
        int i = getKey (key);
        hashMap[i] = -1;
    }
    
    public int getKey(int key){
        return Integer.hashCode(key)% hashMap.length;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */