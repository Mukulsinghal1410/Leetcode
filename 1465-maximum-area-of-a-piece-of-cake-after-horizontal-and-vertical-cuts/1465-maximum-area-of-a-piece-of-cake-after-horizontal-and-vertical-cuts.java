class Solution {
	public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
		int mod = (int) 1e9 + 7;

		// Soring the arrays to get the cuts in increasing order
		Arrays.sort(horizontalCuts);
		Arrays.sort(verticalCuts);

		// Calculating the maximum distance between two adjacent cuts and the edges of the cake
		int hN = horizontalCuts.length, wN = verticalCuts.length;
		long maxH = horizontalCuts[0], maxW = verticalCuts[0];

		maxH = Math.max(maxH, h - horizontalCuts[hN - 1]);
		maxW = Math.max(maxW, w - verticalCuts[wN - 1]);

		// Looping through the array to get the maximum difference between two adjacent cuts
		for (int i = 1; i < hN; i++) {
			maxH = Math.max(maxH, (horizontalCuts[i] - horizontalCuts[i - 1]));
		}
		for (int i = 1; i < wN; ++i) {
			maxW = Math.max(maxW, (verticalCuts[i] - verticalCuts[i - 1]));
		}

		// Returning the "maximum area of a piece of cake"
		return (int) ((maxH % mod * maxW % mod) % mod);
	}
}