class SpecialQueue {
    
    Queue<Integer> queue;
    Deque<Integer> minDeque;
    Deque<Integer> maxDeque;
    
    public SpecialQueue() {
        // Define Data Structures
        queue = new LinkedList<>();
        minDeque = new LinkedList<>();
        maxDeque = new LinkedList<>();
    }

    public void enqueue(int x) {
        // Insert element into the queue
        queue.offer(x);
        
        while( !minDeque.isEmpty() && minDeque.peekLast() > x ){
            minDeque.removeLast();
        }
        minDeque.add(x);
        while( !maxDeque.isEmpty() && maxDeque.peekLast() < x ){
            maxDeque.removeLast();
        }
        maxDeque.add(x);
    }

    public void dequeue() {
        // Remove element from the queue
        int remove = queue.poll();
        if( minDeque.peek() == remove ) minDeque.poll();
        if( maxDeque.peek() == remove ) maxDeque.poll();
        
    }

    public int getFront() {
        // Get front element
        return queue.peek();
    }

    public int getMin() {
        // Get minimum element
        return minDeque.peek();
    }

    public int getMax() {
        // Get maximum element
        return maxDeque.peek();
    }
}