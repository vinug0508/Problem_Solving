class Pair{
    int key;
    int val;
    Pair(int key, int val){
        this.key=key;
        this.val=val;
    }
}
class MyHashMap {
    private final int size=1000;
    private LinkedList<Pair>[] store;

    public MyHashMap() {
        store=new LinkedList[size];
        for(int i=0;i<size;i++){
            store[i]=new LinkedList<>();
        }
    }
    
    private int getHash(int key){
        return key%size;
    }

    public void put(int key, int value) {
        int index=getHash(key);
        // if already value to update there
        for(Pair pair:store[index]){
            if(pair.key==key){
                pair.val=value; // update existing key
                return;
            }
        }
        // add new key-value pair
        store[index].add(new Pair(key, value));
    }
    
    public int get(int key) {
        int index=getHash(key);
        for(Pair pair:store[index]){
            if(pair.key==key){
                return pair.val;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int index=getHash(key);

        store[index].removeIf(pair->pair.key==key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */