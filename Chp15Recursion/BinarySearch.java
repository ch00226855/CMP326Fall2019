import java.util.Arrays;

public class BinarySearch {
	
	private final static boolean DEBUGGING = false;
	
	private static void dprint(String str) {
		if(DEBUGGING) {
			System.out.println(str);
		}
	}
	
	public static int binarySearch(int[] list, int target) {
		/*
		 * This method returns the index of the first occurence
		 * of target in list. If target is not contained in list,
		 * return -1.
		 */
		
		// 1. find the middle value
		//    if there is no middle value (an empty array), return -1.
		dprint("Array: ");
		for(int i = 0; i < list.length; i++) {
			dprint("" + list[i]);
		}
		if (list.length == 0) {// the list is empty
			return -1;
		}
		int midIndex = (list.length - 1) / 2;
		int midVal = list[midIndex];
		dprint("midIndex: " + midIndex);
		dprint("midVal: " + midVal);
//		try {
//			int midIndex = (list.length - 1) / 2;
//			int midVal = list[midIndex];
//		} catch (ArrayIndexOutOfBoundsException e) {
//			return -1;
//		}
		
		// 2. compare the middle value with target
		
		// 3. given the comparison, decide next step
		//   if middle > target, search again in the upper half
		//   if middle < target, search again in the lower half
		//   if middle = target, return the index
		if (midVal == target) {
			return midIndex;
		} else if (midVal > target) {
			// Continue binary search in lower half of the array
			int[] newList = Arrays.copyOfRange(list, 0, midIndex);
			return binarySearch(newList, target);
		} else {//midVal < target
			int[] newList = Arrays.copyOfRange(list, midIndex+1, list.length);
			int result = binarySearch(newList, target);
			if (result == -1) {
				return -1;
			} else {
				return  result + midIndex + 1;
			}
		}
	}
	

	public static void main(String[] args) {
		
		// a sorted list
		int[] list = {1, 3, 5, 7, 9, 11, 13};
		
		// a target value
		int target = 7;
		
		// search result
		System.out.println("Result: " + binarySearch(list, target)
						+ " Expecting: 3");

	}

}
