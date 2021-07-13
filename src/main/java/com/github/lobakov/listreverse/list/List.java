package com.github.lobakov.listreverse.list;

import java.util.StringJoiner;

public class List<E> {

    private static final String DELIMITER = " -> ";

    private Node<E> head;

    public List() {

    }

    @SafeVarargs
    public List(E... items) {
        for (E item: items) {
            insertFirst(item);
        }
    }

    public void insertFirst(E value) {
        this.head = new Node<>(value, this.head);
    }

    public E getValue(Node<E> node) {
        return (null != node)? node.getValue(): null;
    }

    public void listReverse() {
        if (null == this.head || !this.head.hasNext()) {
            return;
        }
        this.head = internalReverse(this.head);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(DELIMITER);
        Node<E> current = this.head;
        while (null != current) {
            joiner.add(current.getValue().toString());
            current = current.getNext();
        }
        return joiner.toString();
    }

    private Node<E> internalReverse(Node<E> head) {
        Node<E> nextHead = head.getNext();
        if (null == nextHead) {
            return head;
        }
        Node<E> newHead = internalReverse(nextHead);
        nextHead.setNext(head);

        if (head.equals(this.head)) {
            head.setNext(null);
        }
        return newHead;
    }
}
