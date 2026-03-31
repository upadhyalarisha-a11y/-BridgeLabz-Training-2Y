class MyCircularDeque {

    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    public MyCircularDeque(int k) {
        capacity = k;
        arr = new int[k];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;

        // move front backward circularly
        front = (front - 1 + capacity) % capacity;
        arr[front] = value;
        size++;

        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;

        arr[rear] = value;
        rear = (rear + 1) % capacity;
        size++;

        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;

        front = (front + 1) % capacity;
        size--;

        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;

        rear = (rear - 1 + capacity) % capacity;
        size--;

        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;

        // rear points to next empty spot, so go one step back
        int index = (rear - 1 + capacity) % capacity;
        return arr[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}