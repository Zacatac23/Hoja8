package org.example;
import java.util.Vector;
// This Java code defines an interface named `PriorityQueue` with a generic type `E` that extends
// `Comparable<E>`. The interface declares the following methods:
// - `E getFirst()`: Returns the first element in the priority queue.
// - `E remove()`: Removes and returns the highest priority element from the queue.
// - `boolean add(E value)`: Adds the specified value to the priority queue.
// - `boolean isEmpty()`: Checks if the priority queue is empty.
// - `int size()`: Returns the number of elements in the priority queue.
// - `void clear()`: Removes all elements from the priority queue.

public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {

    protected Vector<E> data; // the data, kept in heap order

    public VectorHeap() {
        data = new Vector<E>();
    }

    protected static int parent(int i) {
        return (i - 1) / 2;
    }

    protected static int left(int i) {
        return 2 * i + 1;
    }

    protected static int right(int i) {
        return (2 * i + 1) + 1;
    }

    protected void percolateUp(int leaf) {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 && (value.compareTo(data.get(parent)) < 0)) {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }

    public boolean add(E value) {
        data.add(value);
        percolateUp(data.size() - 1);
        return true;
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {
        data.clear();
    }

    protected void pushDownRoot(int root) {
        int heapSize = data.size();
        E value = data.get(root);
        while (true) {
            int childpos = left(root);
            if (childpos < heapSize) {
                if ((right(root) < heapSize) &&
                        ((data.get(childpos + 1)).compareTo
                                (data.get(childpos)) < 0)) {
                    childpos++;
                }
                if ((data.get(childpos)).compareTo
                        (value) < 0) {
                    data.set(root, data.get(childpos));
                    root = childpos;
                } else {
                    data.set(root, value);
                    return;
                }
            } else {
                data.set(root, value);
                return;
            }
        }
    }

    public E getFirst() {
        return data.elementAt(0);
    }

    public E remove() {
        E minVal = getFirst();
        data.set(0, data.getLast());
        data.setSize(data.size() - 1);
        if (data.size() > 1) pushDownRoot(0);
        return minVal;
    }

    @Override
    public String toString() {
        return "VectorHeap{" +
                "data=" + data +
                '}';
    }
}

