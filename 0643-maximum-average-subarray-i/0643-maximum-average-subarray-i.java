class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double s = 0.0;
        for(int i=0;i<k;i++){
            s += nums[i];
        }
        double msm = s/k;
        for(int i=k;i<nums.length;i++){
            s += nums[i] - nums[i-k];
            msm = Math.max(s/k,msm);
        }
        return msm;
    }
}