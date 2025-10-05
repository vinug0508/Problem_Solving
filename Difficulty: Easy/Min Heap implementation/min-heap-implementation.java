public class Solution {

    static void push(PriorityQueue<Integer> pq, int x) {
        // implement push functionality here
        pq.add(x);
        
        System.out.println(pq.size());
    }

    static void pop(PriorityQueue<Integer> pq) {
        // implement pop functionality here
        if(!pq.isEmpty()){
            pq.poll();
        }
        
        System.out.println(pq.size());
    }

    static int top(PriorityQueue<Integer> pq) {
        // implement top functionality here
        if(!pq.isEmpty()){
            return -1;
        }
        
        return pq.peek();
    }
}
