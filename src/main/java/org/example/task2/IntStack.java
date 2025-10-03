package org.example.task2;
import java.util.NoSuchElementException;
import java.util.Arrays;

public class IntStack {
    private int[] data;
    private int size;

    public IntStack() {
        this.data = new int[0];
        this.size = 0;
    }

    public void push(int value) {
        ensureCapacity(size + 1);
        data[size++] = value;
    }

    public int pop() {
        if (isEmpty())  {
            throw new NoSuchElementException("Стек порожній — pop() неможливий.");
        }
        int value = data[--size];
        data[size] = 0;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Стек порожній — peek() неможливий.");
        }
        return data[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(data, 0, size, 0);
        size = 0;
    }

    private void ensureCapacity(int required) {
        if (required <= data.length) return;
        int newCap = Math.max(required, data.length * 2 + 1);
        data = Arrays.copyOf(data, newCap);
    }
}