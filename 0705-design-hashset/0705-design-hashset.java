// Buckets (usually an array of linked lists or dynamic arrays)
// Hashing to map values to bucket indices
// Collision handling (like chaining or open addressing)

class MyHashSet {
    private final int size=1000;
    // To handle collisions, each index holds a LinkedList of values.
    // It’s essential for implementing a HashSet with chaining
    private LinkedList<Integer>[] store;

    public MyHashSet() {
        store=new LinkedList[size];
        for(int i=0;i<size;i++){
            store[i]=new LinkedList<>();
        }
    }
    private int getHash(int key){
        return key%size;
    }

    public void add(int key) {
        int index=getHash(key);
        if(!store[index].contains(key)){
            store[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index=getHash(key);
        // Removes the first occurrence of the object
        store[index].remove((Integer) key);
    }
    
    public boolean contains(int key) {
        int index=getHash(key);
        return store[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */