import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;



class LL_as1 {

	public static List<Integer> removeDuplicates(List<Integer> list) {
        //Implement your logic here and change the return statement accordingly
        Set<Integer> seen = new HashSet<>();
        List<Integer> uniqueList = new LinkedList<>();

        for (Integer value : list) {
            if (!seen.contains(value)) {
                seen.add(value);
                uniqueList.add(value);
            }
        }

        return uniqueList;

	}
	
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(21);
		list.add(15);
		list.add(10);
		
		List<Integer> updatedList = removeDuplicates(list);
		
		System.out.println("Linked list without duplicates");
		for (Integer value : updatedList) {
			System.out.print(value+" ");
		}
	}
	
}