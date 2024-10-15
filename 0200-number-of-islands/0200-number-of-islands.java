class Solution {
    public int numIslands(char[][] grid) {
            int res = 0;
            int m = grid.length;
            int n = grid[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        res++;
                        dfs(grid, m, n, i, j);
                    }
                }
            }

            return res;
        }

        public void dfs(char[][] grid, int m, int n, int i, int j) {
            if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') {
                return;
            }
            grid[i][j] = '0';

            dfs(grid, m, n, i - 1, j);
            dfs(grid, m, n, i + 1, j);
            dfs(grid, m, n, i, j - 1);
            dfs(grid, m, n, i, j + 1);
        }
}