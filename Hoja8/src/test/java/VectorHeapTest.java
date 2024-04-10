import org.example.VectorHeap;

import static org.junit.Assert.*;
import org.testng.annotations.Test;


public class VectorHeapTest {

    @Test
    public void testRemove() {
        VectorHeap<Integer> heap = new VectorHeap<>();

        heap.add(5);
        heap.add(3);
        heap.add(8);
        heap.add(1);

        assertEquals(Integer.valueOf(1), heap.remove());
        assertEquals(Integer.valueOf(3), heap.remove());
        assertEquals(Integer.valueOf(5), heap.remove());
        assertEquals(Integer.valueOf(8), heap.remove());
    }
}

