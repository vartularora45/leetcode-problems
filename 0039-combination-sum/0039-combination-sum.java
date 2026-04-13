class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        combinesum(res,candidates,target,0,l);
        return res;
    }
    public static void combinesum(List<List<Integer>> res,int arr[],int t,int i,List<Integer> l){
       if(t == 0){
        res.add(new ArrayList<>(l));
        return;
       }
       if(i >= arr.length || t < 0) return;
        
        combinesum(res,arr,t,i+1,l);
        l.add(arr[i]);
         combinesum(res,arr,t-arr[i],i,l);
        l.remove(l.size()-1);
    }

}