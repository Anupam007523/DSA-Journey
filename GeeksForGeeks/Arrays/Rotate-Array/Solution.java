class Solution {
	static void rotateArr(int arr[], int d) {
		// code here
		int n = arr.length;
		
		d = d%n;//used to eliminate redundant full cycles and out of bound errors when d>n
		
		int temp[] = new int[n];
		
		int k = 0;
		
		// Copying from d to end of the array inside temporary array
		for (int i = d; i<n; i++) {
			temp[k] = arr[i];
			k++;
		}
		// copying first d elements
		for (int i = 0; i<d; i++) {
			temp[k] = arr[i];
			k++;
		}
		// Copying back everything to original array
		for (int i = 0; i<n; i++) {
			arr[i] = temp[i];
		}
	}
}
