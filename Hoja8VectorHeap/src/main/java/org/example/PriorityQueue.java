package org.example;

interface PriorityQueue<E extends Comparable<E>> {
    E getFirst();
    E remove();
    boolean add(E value);
    boolean isEmpty();
    int size();
    void clear();
}
