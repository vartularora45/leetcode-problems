class Solution {
    public int mirrorDistance(int n) {
         int rev = 0;
         int x = n;
         while(n!=0){
            int k = n % 10;
            rev = rev * 10 + k;
            n = n / 10;
         }
         return Math.abs(x - rev );
    }
}