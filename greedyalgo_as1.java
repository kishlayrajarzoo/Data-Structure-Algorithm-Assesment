class greedyalgo_as1 {
	
	public static int findSwapCount(String inputString)  { 
		//Implement your logic here and change the return statement accordingly
	 int imbalance = 0;
        int openCount = 0;

        for (char ch : inputString.toCharArray()) {
            if (ch == '(') {
                openCount++;
            } else if (ch == ')') {
                if (openCount > 0) {
                    openCount--; // matched with an earlier '('
                } else {
                    imbalance++; // unmatched ')', needs a swap
                }
            }
        }

        return imbalance;


    } 
  
    public static void main(String args[])  { 
        String inputString = "())()("; 
        System.out.println("Number of swaps: "+findSwapCount(inputString)); 
    } 

}
