class Solution {
    public int alternateDigitSum(int n) {
        int s = 0;
        int k = 0;

        int arr[] = new int[12];
        int idx = 0;

        while(n != 0){
            arr[idx++] = n % 10; 
            n /= 10;
        }

        // ab arr me digits ulte padhe hain, toh reverse loop chalao (leftmost → rightmost)
        for(int i = idx - 1; i >= 0; i--){
            if(k % 2 == 0){
                s += arr[i];
            } else {
                s -= arr[i];
            }
            k++;
        }

        return s;
    }
}
