package LeetCode;

import java.util.HashMap;

public class Twosum_MAP {
	private HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();

	public void add(Integer number) {
		if (elements.containsKey(number)) {
			elements.put(number, elements.get(number) + 1);
		} else {
			elements.put(number, 1);
		}
	}

	public boolean find(int value) {
		for (Integer i : elements.keySet()) {
			int target = value - i;
			if (elements.containsKey(target)) {
				if (i == target && elements.get(target) < 2) {
					continue;
				}
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]) {
		Twosum_MAP obj = new Twosum_MAP();

		obj.add(1);
		obj.add(3);
		obj.add(5);
		obj.add(4);

		System.out.println(obj.find(4));
		System.out.println(obj.find(7));

	}
}
