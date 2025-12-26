class Solution {
    public int bestClosingTime(String customers) {
        int n = 0;
        int mx = 0;
        int res = 0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                n++;
            }
            else{
               n--;
            }
            if(n > mx){
                mx = n;
                res = i+1;
            }

        }
        return res;
       
    }
}