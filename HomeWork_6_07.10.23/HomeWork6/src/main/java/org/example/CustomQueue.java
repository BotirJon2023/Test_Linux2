package org.example;
public class CustomQueue {
    private int[] data;
    private int head;
    private int tail;
    public CustomQueue(int capacity) {
        data = new int[capacity];
        head = -1;
        tail = -1;
    }

    public void enqueue(int element) {
        if (tail == data.length) {
            throw new RuntimeException("Stack is full");
        }
        data[++tail] = element;
    }

    public int dequeue() {
        if (tail == 0) {
            throw new RuntimeException("Stack is empty");
        }
        int element = data[--head]; // элемент из вершины стека
        return data[++head];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public int size() {
        if (head == -1) {
            return 0; // Очередь пуста
        } else {
            // Разнице между индексами head и tail плюс 1
            return (tail - head + 1 + data.length) % data.length;
        }
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
