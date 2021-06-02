package com.company.custom;

import java.util.NoSuchElementException;

public class CustomQueue<T> implements Custom<T> {

    private Node<T> first = null;
    private Node<T> last = null;
    private int size = 0;

    public class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void offer(T data) {
        Node<T> node = new Node<>(data);
        size++;

        if(last != null) {
            last.next = node;
        }

        last = node;

        if(first == null)
            first = last;
    }

    public T poll() {
        if(size <= 0 || first == null) throw new NoSuchElementException();
        size--;

        T data = first.data;
        first = first.next;

        return data;
    }

    @Override
    public boolean isEmpty() {
        if(size <= 0 || first == null)
            return true;
        return false;
    }

    @Override
    public T peek() {
        return first.data;
    }
}
