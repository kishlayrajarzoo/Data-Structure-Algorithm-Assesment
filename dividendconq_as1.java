class dividendconq_as1 {

    public static int findMaxSum(int arr[], int low, int high) {
		// Implement your logic here and change the return statement accordingly
		if (low == high) {
            return arr[low];
        }

        int mid = (low + high) / 2;

        // Recursively find max sum in left, right, and crossing subarrays
        int leftSum = findMaxSum(arr, low, mid);
        int rightSum = findMaxSum(arr, mid + 1, high);
        int crossSum = findMaxCrossingSubarraySum(arr, low, mid, high);

        // Return the maximum of the three
        return Math.max(Math.max(leftSum, rightSum), crossSum);

	}

	public static int findMaxCrossingSubarraySum(int arr[], int low, int mid, int high) {
		// Implement your logic here and change the return statement accordingly
		 int leftSum = Integer.MIN_VALUE;
        int sum = 0;

        // Include elements on left of mid
        for (int i = mid; i >= low; i--) {
            sum += arr[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;

        // Include elements on right of mid
        for (int i = mid + 1; i <= high; i++) {
            sum += arr[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        return leftSum + rightSum;
		
	}

	public static void main(String[] args) {
		int arr[] = { -2, -5, 6, -2, -3, 1, 5, -6 };
		System.out.println("Maximum sum: " + findMaxSum(arr, 0, arr.length - 1));
	}
}
