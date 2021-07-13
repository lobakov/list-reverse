package com.github.lobakov.listreverse.list;

class Node<E> {

    private E value;
    private Node<E> next;

    Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }

    void setNext(Node<E> next) {
        this.next = next;
    }

    Node<E> getNext() {
        return this.next;
    }

    E getValue() {
        return this.value;
    }

    boolean hasNext() {
        return null != this.next;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
