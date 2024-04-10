/**
 * The `EmergencyQueue` class implements a priority queue for managing patients using a `VectorHeap`
 * data structure.
 */
package org.example;

class EmergencyQueue implements PriorityQueue<Patient> {
    private final VectorHeap<Patient> queue;

    public EmergencyQueue() {
        queue = new VectorHeap<>();
    }

    @Override
    public Patient getFirst() {
        return queue.getFirst();
    }

    @Override
    public Patient remove() {
        return queue.remove();
    }

    @Override
    public boolean add(Patient value) {
        return queue.add(value);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void clear() {
        queue.clear();
    }
}
