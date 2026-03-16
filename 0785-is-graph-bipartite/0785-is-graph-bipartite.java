import java.util.*;

class Solution {

    public boolean isBipartite(int[][] graph) {

        int V = graph.length;
        int col[] = new int[V];
        Arrays.fill(col,-1);

        for(int i=0;i<V;i++){
            if(col[i]==-1){
                if(!dfs(graph,col,i,0)) return false;
            }
        }

        return true;
    }

    public static boolean dfs(int graph[][],int col[],int node,int p){

        col[node] = p;

        for(int nei : graph[node]){

            if(col[nei] == -1){
                if(!dfs(graph,col,nei,1-p))
                    return false;
            }

            else if(col[nei] == p){
                return false;
            }
        }

        return true;
    }
}