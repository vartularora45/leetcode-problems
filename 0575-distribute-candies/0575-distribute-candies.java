class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        HashSet<Integer> s = new HashSet<>();
        for(int i : candyType){
            s.add(i);
        }
        int c = n / 2;

        return s.size() < c ? s.size() : c; 
    }
}