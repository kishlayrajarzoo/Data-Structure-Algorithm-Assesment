import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


class queueInterface_as2 {
    
    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
		//Implement your logic here and change the return statement accordingly
		List<Integer> tempList = new ArrayList<>();
        while (!inputStack.isEmpty()) {
            tempList.add(inputStack.pop());
        }

        // Step 2: Reverse to restore original order (bottom to top)
        Collections.reverse(tempList);

        // Step 3: Identify smallest value and separate elements
        int min = Collections.min(tempList);
        List<Integer> nonMin = new ArrayList<>();
        int minCount = 0;

        for (int val : tempList) {
            if (val == min) {
                minCount++;
            } else {
                nonMin.add(val);
            }
        }

        // Step 4: Rebuild the stack
        Deque<Integer> resultStack = new ArrayDeque<>();

        // Push non-minimum elements first (preserving order)
        for (int val : nonMin) {
            resultStack.push(val);
        }

        // Push all minimum values last so they end up at the bottom
        for (int i = 0; i < minCount; i++) {
            resultStack.push(min);
        }

        return resultStack;

	}

	public static void main(String[] args) {
		
		Deque<Integer> inputStack = new ArrayDeque<Integer>();
		inputStack.push(10);
		inputStack.push(8);
		inputStack.push(5);
		inputStack.push(12);
		inputStack.push(5);
	
		Deque<Integer> updatedStack = changeSmallest(inputStack);
		
		System.out.println("Stack After Modification:");
		for (Integer value : updatedStack)
			System.out.println(value);
	}
}