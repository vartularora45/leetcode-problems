class Solution {
    public boolean checkGoodInteger(int n) {
        int sm = 0;
        int dm = 0;
        while(n > 0){
            int R = n % 10;
            sm += R*R;
            dm += R;
            n = n / 10;
        }
        return ((sm-dm ) >= 50);
    }
}