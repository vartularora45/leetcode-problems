class Solution {
    public int pivotIndex(int[] nums) {
         int sum = 0;
         for(int i=0;i<nums.length;i++){
            sum += nums[i];
         }



        int s = 0;
        int e = sum;
        for(int i=0;i<nums.length;i++){
            e -= nums[i];
            if(s == e){
                
                return i;
            }
            s += nums[i];
        }
        return -1;
    }
}