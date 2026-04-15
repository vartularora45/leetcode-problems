class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> c = new ArrayList<>();
        int mx = Arrays.stream(nums).max().getAsInt();
        int res[] = new int[mx+1];
        for(int i=0;i<nums.length;i++){
            res[nums[i]]++;
    }

    for(int k=0;k<res.length;k++){
        if(res[k] == 2){
            c.add(k);
        }
    }
    return c;
    }
}