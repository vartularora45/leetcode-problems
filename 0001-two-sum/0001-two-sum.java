class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(l.contains(target - nums[i])){
                res[0] = i;
                res[1] = l.indexOf(target-nums[i]);
            }
        }    
        return res;
    }
}