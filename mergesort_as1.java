class mergesort_as1 {
	
	public static void mergeSort(int[] elements, int size) {
		//Implement your logic here
		if (size < 2) return;

    int mid = size / 2;
    int[] left = new int[mid];
    int[] right = new int[size - mid];

    for (int i = 0; i < mid; i++) {
        left[i] = elements[i];
    }
    for (int i = mid; i < size; i++) {
        right[i - mid] = elements[i];
    }

    mergeSort(left, mid);
    mergeSort(right, size - mid);
    merge(elements, left, right, mid, size - mid);

	}

	public static void merge(int[] elements, int left[], int right[], int leftMerge, int rightMerge) {
        //Implement your logic here
        int i = 0, j = 0, k = 0;

    while (i < leftMerge && j < rightMerge) {
        if (left[i] <= right[j]) {
            elements[k++] = left[i++];
        } else {
            elements[k++] = right[j++];
        }
    }

    while (i < leftMerge) {
        elements[k++] = left[i++];
    }

    while (j < rightMerge) {
        elements[k++] = right[j++];
    }

	}
	
	public static double findMedian(int elements[]) {
		//Implement your logic here and change the return statement accordingly
		 int n = elements.length;

    if (n == 0) {
        throw new IllegalArgumentException("Array is empty. Cannot compute median.");
    }

    if (n % 2 != 0) {
        return elements[n / 2]; // Odd length
    } else {
        return (elements[n / 2 - 1] + elements[n / 2]) / 2.0; // Even length
    }


	}

	public static void main(String[] args) {
		int elements[] = { 64, 34, 25, 12, 22, 11, 90 }; 
        mergeSort(elements, elements.length); 
        System.out.println("Median: "+findMedian(elements)); 
	}
}

