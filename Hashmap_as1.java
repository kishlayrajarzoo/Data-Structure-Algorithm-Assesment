import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class hashMAp {
    
	public static List<String> sortSales(Map<String, Integer> sales) {
		//Implement your logic here and change the return statement accordingly
		// Step 1: Convert map entries to a list
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(sales.entrySet());

        // Step 2: Sort the list by sales value in descending order
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Step 3: Extract sorted employee names
        List<String> sortedEmployees = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedEmployees.add(entry.getKey());
        }

        return sortedEmployees;

	}

	public static void main(String args[]) {
	    Map<String, Integer> sales = new HashMap<String, Integer>();
		sales.put("Mathew", 50);
		sales.put("Lisa", 76);
		sales.put("Courtney", 45);
		sales.put("David", 49);
		sales.put("Paul", 49);
		
		List<String> employees = sortSales(sales);
		
		System.out.println("Employees in the decreasing order of their sales\n=====================================");
		for (String employeeName : employees) {
			System.out.println(employeeName);
		}
	}

}
