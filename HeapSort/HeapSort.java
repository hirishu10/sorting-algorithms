package HeapSort;

import java.util.PriorityQueue;

/**
 * Heap Sort
 */
public class HeapSort {

    public static void main(String[] args) {

        int[]arr = {22,99,3,11,88,4,1}; // Some Example use Heap Sort
        PriorityQueue<Integer> data = new PriorityQueue<>(); // Priority Queue helps to store the data and return the highest priority value first

        for (int val : arr){ // Looping to add the value inside queue
            data.add(val);
        }

        while(data.size() > 0){ // removing highest value from queue and print
            System.out.print(data.peek() + " ");
            data.remove(data.peek());
        }

        System.out.println();
    }
}
