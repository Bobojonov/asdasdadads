package codingCompetitive.yandex.contest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Deque {
    private int[] deque;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Deque(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.rear = 0;
        this.front = -1;
        this.deque = new int[capacity];
    }

    public void push_back(int value) {
        if (isFull()) {
            System.out.println("error");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }

        deque[rear] = value;
        size++;
    }

    public void push_front(int value) {
        if (isFull()) {
            System.out.println("error");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }

        deque[front] = value;
        size++;
    }

    public void pop_back() {
        if (isEmpty()) {
            System.out.println("error");
        }
        System.out.println(deque[rear]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else rear = (rear - 1 + capacity) % capacity;
        size--;
    }

    public void pop_front() {
        if (isEmpty()) {
            System.out.println("error");
        }
        System.out.println(deque[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else front = (front - 1 + capacity) % capacity;
        size--;
    }

    private boolean isFull() {
        return this.size == capacity;
    }

    private boolean isEmpty() {
        return this.size == 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int capacity = Integer.parseInt(reader.readLine());
        Deque deq = new Deque(capacity);
        while (n-- > 0) {
            String[] command = reader.readLine().split(" ");
            switch (command[0]) {
                case "push_front":
                    deq.push_front(Integer.parseInt(command[1]));
                    break;
                case "push_back":
                    deq.push_back(Integer.parseInt(command[1]));
                    break;
                case "pop_back":
                    deq.pop_back();
                    break;
                case "pop_front":
                    deq.pop_front();
                    break;
            }
        }
    }
}
