class Solution {
  
	public int bfs(int[][] grid, int k, int row, int col, int sum, int[][][] dp,int mod) {
		if (row>=grid.length || col>= grid[0].length) {
			return 0;
		}
		if (row == grid.length - 1 && col == grid[0].length - 1) {
			if ((sum + grid[row][col]) % k == 0) {
				return 1;
			}
			return 0;
		}
		if (dp[row][col][sum%k]!= -1) {
			return dp[row][col][sum % k];
		}
		int x=bfs(grid,k,row + 1,col,sum+grid[row][col], dp,mod) % mod;
		int y=bfs(grid, k,row,col+ 1,sum+grid[row][col], dp,mod) % mod;

		return dp[row][col][sum%k]=(x + y) % mod;
	}

	public int numberOfPaths(int[][] grid, int k) {
		int[][][] dp=new int[grid.length][grid[0].length][k];
        int mod=1000000007;
		for (int[][] row:dp) {
			for (int[] col:row) {
				Arrays.fill(col, -1);
			}
		}
		return bfs(grid, k, 0, 0, 0, dp,mod) % mod;
	}
}