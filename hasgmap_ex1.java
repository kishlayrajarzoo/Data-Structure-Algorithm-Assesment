import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
		//Implement your logic here and change the return statement accordingly
		 Map<String, Double> result = new HashMap<>();

        if (studentMarks == null || studentMarks.isEmpty()) {
            return result;
        }

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        // Step 1: Find max and min values
        for (double mark : studentMarks.values()) {
            if (mark > max) max = mark;
            if (mark < min) min = mark;
        }

        // Step 2: Add max scorers
        for (Entry<String, Double> entry : studentMarks.entrySet()) {
            if (entry.getValue() == max) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        // Step 3: Add min scorers
        for (Entry<String, Double> entry : studentMarks.entrySet()) {
            if (entry.getValue() == min) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        return result;

	}

}

class hashmap_ex1 {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		
		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}
