import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
	
class Hashmap_as3 {

    public static Map<Character, Integer> findOccurrences(String input) {
        //Implement your logic here and change the return statement accordingly
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        return charFrequencyMap;


    }

 
	
	public static void main(String args[]) {
		
		String input = "occurrence";
		Map<Character, Integer> occurrenceMap = findOccurrences(input);
		
		System.out.println("Occurrences of characters\n=======================");
		for (Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}

}