class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;

        boolean viz[] = new boolean[V];
        boolean path[] = new boolean[V];
        boolean chk[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!viz[i]){
                dfs(graph,i,viz,path,chk);
            }
        }
        List<Integer> safe = new ArrayList<>();
        for(int i=0;i<V;i++){
            if(chk[i]) safe.add(i);
        }
        return safe;
    }
    public static boolean dfs(int[][] graph,int node,boolean viz[],boolean path[],boolean chk[]){
        viz[node] = true;
        path[node] = true;
        for(int nei : graph[node]){
            if(!viz[nei]){
                if(dfs(graph,nei,viz,path,chk)){
                    return true;
                }
                
            }
            else if(path[nei]){
                return true;
            }
        }
        path[node] = false;
        chk[node] = true;
        return false;
    }

}