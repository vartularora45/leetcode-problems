class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        int n = nums.length;
        for(int k=0;k<n;k++){
        int i = Collections.binarySearch(l,nums[k]);
        if(i < 0) i = -(i+1);
        if(i == l.size()){
            l.add(nums[k]);
        }
        else{
            l.set(i,nums[k]);
        }
        }
        return l.size();
    }
}