class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> res = new ArrayList<>();
        
        long ans = 1;
        res.add((int)ans);

        for(int i=0;i<r;i++){
            ans *= (r-i);
            ans /= (i+1);
            res.add((int)ans);
        }
        return res;
    }
}