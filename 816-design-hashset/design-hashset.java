class MyHashSet {
     private final static int bucketsize = 769;
     private ListNode buckets[];
     public static class ListNode {
        int key ;
        ListNode next;
        ListNode(int key ){
             this.key = key;
        }
     }
    public MyHashSet() {
        buckets = new ListNode [bucketsize];
        for(int i = 0 ;i < bucketsize;i++){
            buckets[i] = new ListNode (-1);
        }
       
        
    }
     private int hash(int key ){
            return key % bucketsize;
        }
    
    public void add(int key) {
        int index = hash(key);
        ListNode cursor = buckets[index];
        while(cursor.next != null){
            if(cursor.next.key == key){
                return ;
            }
            cursor = cursor.next ;
        }
        cursor.next = new ListNode(key);
    }
    
    public void remove(int key) {
        int index = hash(key);
        ListNode cursor = buckets[index];
        while(cursor.next != null){
            if(cursor.next.key == key){
                cursor.next = cursor.next.next; 
                return;
            }
            cursor = cursor.next;
        }
        
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        ListNode cursor = buckets[index].next;
        while(cursor != null){
            if(cursor.key == key ){
                return true;
            }
            cursor = cursor.next ;
        }
        return false ;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */