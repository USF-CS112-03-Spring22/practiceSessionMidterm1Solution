import java.util.*;

public class ArrayQuestion {

	public static int[] sumElems (int[] arr, int num) {
		int[] result = new int[2];
		int sumGreaterThan = 0;
		int sumLessThan = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > num) {
				sumGreaterThan += arr[i];
			}
			else {
				sumLessThan += arr[i];
			}
		}
		result[0] = sumGreaterThan;
		result[1] = sumLessThan;

		return result;
	}


	public static void main(String[] args) {
		int[] arr = {10, 3, 8, 5, 7, 2, 1};
		int[] newarr = sumElems(arr, 6);

		System.out.println("{" + newarr[0] + ", " + newarr[1] + "}");

	}

}