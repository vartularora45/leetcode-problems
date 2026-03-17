class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Queue<int[]> q = new LinkedList<>();

        int dist[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i,j});
                }
                else{
                    dist[i][j] = -1;
                }
            }
        }
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int[] cur = q.poll();

            for(int[] d : dir){
                int r = cur[0] + d[0];
                int c = cur[1] + d[1];

                if(r>=0 && c>=0 && r<m && c<n && dist[r][c]==-1){
                    dist[r][c] = dist[cur[0]][cur[1]] + 1;
                    q.add(new int[]{r,c});
                }
            }
        }
        return dist;
    }
}