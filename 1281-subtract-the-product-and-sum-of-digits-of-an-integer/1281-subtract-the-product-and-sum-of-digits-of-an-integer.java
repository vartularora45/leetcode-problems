class Solution {
    public int subtractProductAndSum(int n) {
        return pro(n)-sum(n);

    }
    public int pro(int n){
        int p = 1;
        while(n!=0){
            int r = n % 10;
            p*=r;
            n/=10;
        }
        return p;
    }
    public int sum(int n){
        int s = 0;
        while(n!=0){
            int r = n % 10;
            s+=r;
            n/=10;
        }
        return s;
    }
}