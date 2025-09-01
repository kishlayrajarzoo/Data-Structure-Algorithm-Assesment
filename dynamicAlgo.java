class dynamicAlgo {
	
	public static int cutRod(int[] price, int n) {
		//Implement your logic here and change the return statement accordingly
		int[] dp = new int[n + 1];
    dp[0] = 0; // No rod → no profit

    for (int i = 1; i <= n; i++) {
        int maxVal = Integer.MIN_VALUE;
        for (int j = 0; j < i; j++) {
            maxVal = Math.max(maxVal, price[j] + dp[i - j - 1]);
        }
        dp[i] = maxVal;
    }

    return dp[n];

	}

	public static void main(String[] args) {
		int price [] = { 1, 5, 8, 9, 10, 17, 17, 20 };
		int n = 4;
		System.out.println("Maximum price: " + cutRod(price, n));
	}
}
