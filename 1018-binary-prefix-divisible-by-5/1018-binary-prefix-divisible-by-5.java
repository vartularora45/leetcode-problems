class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> lst = new ArrayList<>();
        int v =0;
        for(int i:nums){
            v = ((v << 1)+i) % 5;
            lst.add(v == 0);
        }
        return lst;
    }
}