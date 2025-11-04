class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        Map<String, Integer> dp = new HashMap<>();
        int mc = 1;
        for(String word : words){
            int b  = 1;
            for(int i=0;i<word.length();i++){
                String pred = word.substring(0, i) + word.substring(i + 1);
                if (dp.containsKey(pred)) {
                    b = Math.max(b, dp.get(pred) + 1);
                }
            }
            dp.put(word, b);
            mc = Math.max(mc, b);
        }
        return mc;
    }
}