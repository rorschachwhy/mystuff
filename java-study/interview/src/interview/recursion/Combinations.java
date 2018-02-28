package interview.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {

	/**
	 * Generates all combinations and output them, selecting n elements from data
	 */
	public void combinations(List<Integer> selected, List<Integer> data, int n) {

		if (n == 0) {
			for (Integer i : selected) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}

		if (data.isEmpty()) {
			return;
		}
		
		if (data.size() < n) {
			return;
		}

		// select element 0
		selected.add(data.get(0));
		combinations(selected, data.subList(1, data.size()), n - 1);

		// un-select element 0
		selected.remove(selected.size() - 1);
		combinations(selected, data.subList(1, data.size()), n);
	}

	public static void main(String[] args) {
		Combinations comb = new Combinations();
		comb.combinations(new ArrayList<Integer>(), Arrays.asList(1, 2, 3, 4, 5, 6, 7), 3);
		System.out.println("==================");
		comb.combinations(new ArrayList<Integer>(), Arrays.asList(1, 2, 3, 4, 5, 6, 7), 1);
		System.out.println("==================");
		comb.combinations(new ArrayList<Integer>(), Arrays.asList(1, 2, 3, 4, 5, 6, 7), 0);
		System.out.println("==================");
		comb.combinations(new ArrayList<Integer>(), new ArrayList<Integer>(), 2);
		System.out.println("==================");
		comb.combinations(new ArrayList<Integer>(), new ArrayList<Integer>(), 0);
	}

}
