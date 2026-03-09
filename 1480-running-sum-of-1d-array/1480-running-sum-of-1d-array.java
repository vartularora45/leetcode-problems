class Solution {
    public int[] runningSum(int[] nums) {
        int res[] = new int[nums.length];
        res[0] = nums[0];
        int s = res[0];
        for(int i=1;i<nums.length;i++){
           s += nums[i];
           res[i] = s;
           

        }
        return res;
    }
}