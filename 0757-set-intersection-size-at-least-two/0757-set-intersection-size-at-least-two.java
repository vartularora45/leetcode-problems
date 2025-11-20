class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
               Arrays.sort(intervals,(x,y)->x[1]==y[1]?y[0]-x[0]:x[1]- y[1]);

        int a =-1;
        int b=-1;
        int ans= 0;

        for (int[] arr: intervals) {
            int l=arr[0];
            int r=arr[1];

            if (b<l) {
                a =r-1;
                b =r;
                ans+= 2;
            } 
            else if (a< l) {
                a=b;
                b=r;
                ans+=1;
            }
        }
        return ans;
 
    }
}