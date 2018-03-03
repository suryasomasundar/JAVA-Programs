package Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxHeap_PQ {

	PriorityQueue<Integer> PQ;

	public MaxHeap_PQ() {
		PQ = new PriorityQueue<Integer>(10, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
	}

	public void insert(int[] x) {
		for (int i = 0; i < x.length; i++) {
			PQ.offer(x[i]);
		}
	}

	public int extractMax() {
		return PQ.poll();
	}

	public void display() {
		System.out.println(PQ);
	}

	public int getSize() {
		return PQ.size();
	}

	public void print() {
		System.out.println(PQ);
	}
}