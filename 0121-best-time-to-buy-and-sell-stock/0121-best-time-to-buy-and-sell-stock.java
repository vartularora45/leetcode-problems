class Solution {
    public int maxProfit(int[] prices) {
        int mxp = 0;
        int msf = prices[0];
        for(int i=0;i<prices.length;i++){
            msf = Math.min(msf,prices[i]);
            int p =  prices[i] - msf;
            mxp = Math.max(p,mxp);
        }
        return mxp;
    }
}