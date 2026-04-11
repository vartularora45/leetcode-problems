class Solution {
    public int totalHammingDistance(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int xor=(nums[i]^nums[j]);
                sum+=Integer.bitCount(xor);

            }
        }
        return sum;
    }
}