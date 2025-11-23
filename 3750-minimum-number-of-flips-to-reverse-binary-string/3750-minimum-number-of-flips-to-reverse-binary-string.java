class Solution {
    public int minimumFlips(int n) {
        String s=Integer.toBinaryString(n);
        int l=s.length();
        int cnt=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)!=s.charAt(l-1-i)) cnt++;
        }
        return cnt;
    }
}