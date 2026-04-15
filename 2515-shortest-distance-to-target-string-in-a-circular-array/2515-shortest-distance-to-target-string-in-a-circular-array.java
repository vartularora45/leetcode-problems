class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int j = startIndex;
        int md = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int min = (i-j+n) % n;
                int max = (j-i+n)%n;
                md = Math.min(md,Math.min(min,max));
            }
        }
        return md == Integer.MAX_VALUE ? -1 : md;
    }
}