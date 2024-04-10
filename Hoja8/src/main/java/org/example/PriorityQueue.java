package org.example;

// This Java code defines an interface named `PriorityQueue` with a generic type `E` that extends
// `Comparable<E>`. The interface declares the following methods:
// - `E getFirst()`: Returns the first element in the priority queue.
// - `E remove()`: Removes and returns the first element in the priority queue.
// - `boolean add(E value)`: Adds the specified value to the priority queue.
// - `boolean isEmpty()`: Checks if the priority queue is empty.
// - `int size()`: Returns the number of elements in the priority queue.
// - `void clear()`: Removes all elements from the priority queue.
interface PriorityQueue<E extends Comparable<E>> {
    E getFirst();
    E remove();
    boolean add(E value);
    boolean isEmpty();
    int size();
    void clear();
}
