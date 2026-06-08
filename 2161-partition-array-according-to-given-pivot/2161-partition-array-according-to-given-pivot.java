class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int res[] = new int[n];
        int k = 0;
        for(int num : nums){
            if(pivot >num ){
                res[k] = num;
                k++;
            }
        }
        for(int num : nums){
            if(pivot == num ){
                res[k] = num;
                k++;
            }
        }
        for(int num : nums){
            if(pivot < num ){
                res[k] = num;
                k++;
            }
        }
        return res;
    }
}