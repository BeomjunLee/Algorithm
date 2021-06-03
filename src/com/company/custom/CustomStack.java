package com.company.custom;

import java.util.EmptyStackException;

public class CustomStack<T> implements Custom<T>{

    private Node<T> top = null;
    private int size = 0;

    public class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);
        size++;

        node.next = top;
        top = node;
    }

    public T pop() {
        if(size <= 0 || top == null) throw new EmptyStackException();
        size--;

        T data = top.data;
        top = top.next;
        return data;
    }

    @Override
    public boolean isEmpty() {
        if(size <= 0 || top == null)
            return true;
        return false;
    }

    @Override
    public T peek() {
        return top.data;
    }
}

