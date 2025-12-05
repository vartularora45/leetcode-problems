class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[] = new int[2];
        for(int i=0,p=0; i<nums.length; i++)
            for(int j=i+1; j<nums.length; j++)
                if(nums[i] == nums[j])
                    ans[p++] = nums[i];
        return ans;
    }
}