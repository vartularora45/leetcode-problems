class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        ArrayList<Integer> l = new ArrayList<>();
         int ind = 0;
        for(int i:nums){
           if(i == 1){
              l.add(ind);
           }
           ind++;
        }

        for(int i=0;i<l.size()-1;i++){
            if(Math.abs(l.get(i) - (l.get(i+1)-1 ))< k){
                return false;
            }
        }
        return true;
    }
}