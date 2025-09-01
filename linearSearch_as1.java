class linearSearch_as1 {
    
    public static int searchEmployeeId(int[] employeeIds, int employeeIdToBeSearched) {
		//Implement your logic here and change the return statement accordingly
		for (int i = 0; i < employeeIds.length; i++) {
        if (employeeIds[i] == employeeIdToBeSearched) {
            return i + 1; // Iteration count (1-based)
        }
    }
    return -1;
	}

	public static void main(String a[]) {
		int[] employeeIds = { 8011, 8012, 8015, 8016, 8020, 8022, 8025 };
		int employeeIdToBeSearched = 8022;
		
		int numberOfIterations = searchEmployeeId(employeeIds, employeeIdToBeSearched);
		
		if (numberOfIterations == -1)
			System.out.println("Employee Id " + employeeIdToBeSearched + " is not found!");
		else
			System.out.println("Employee Id " + employeeIdToBeSearched + " is found! Number of iterations : " + numberOfIterations);
	}
}}
