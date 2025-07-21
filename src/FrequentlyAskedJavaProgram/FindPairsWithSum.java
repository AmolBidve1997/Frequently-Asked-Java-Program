package FrequentlyAskedJavaProgram;

import java.util.HashSet;

public class FindPairsWithSum {

	public static void main(String[] args) {


		int[] arr = {2, 4, 3, 5, 7, 8, -1}; // Input array
		int target = 7; // Target sum

		findPairs(arr, target); // Call method to find pairs
	}

	public static void findPairs(int[] arr, int target) {

		HashSet<Integer> seen = new HashSet<>(); // Set to store already visited numbers

		for (int num : arr) { // Loop through each element in the array

			int complement = target - num; // Find the number that would sum with 'num' to give the target

			if (seen.contains(complement)) {
				// If complement is already in the set, we found a valid pair
				System.out.println("Pair found: (" + complement + ", " + num + ")");
			}

			// Add the current number to the set
			seen.add(num);
		}
	}

}


