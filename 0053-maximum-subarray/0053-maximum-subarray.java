class Solution {
    public int maxSubArray(int[] nums) {
        int s= 0;
        int mxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            s += nums[i];
            mxi = Math.max(s,mxi);
            if(s < 0){
                s = 0;
            }

        }
        return mxi;
    }
}