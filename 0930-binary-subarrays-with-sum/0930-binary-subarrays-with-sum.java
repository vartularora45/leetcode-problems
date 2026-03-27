class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private int atMost(int[] nums, int goal) {
        if(goal < 0) return 0;

        int s = 0, l = 0, c = 0;

        for(int r = 0; r < nums.length; r++) {
            s += nums[r];

            while(s > goal) {
                s -= nums[l];
                l++;
            }

            c += (r - l + 1);
        }

        return c;
    }
}