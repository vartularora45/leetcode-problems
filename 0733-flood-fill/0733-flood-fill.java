class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int oldc = image[sr][sc];
        if(color == oldc){
            return image;
        }
        fill(image, sr, sc, oldc, color, m, n);
        return image;
    }
    public static void fill(int[][] image, int sr, int sc, int oldc,int color,int r,int c){
        if(sr < 0 || sc < 0 || sr >= r || sc >= c || image[sr][sc] != oldc  ){
            return;
        }
        image[sr][sc] = color;

        int a[] = { 0, 1, 0, -1 };
        int b[] = { 1, 0, -1, 0 };

        for (int i = 0; i < 4; i++) {
            fill(image, sr + a[i], sc + b[i], oldc, color, r, c);
        }
    }
}