class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generator(res, n, "", 0, 0);
        return res;
    }

    public static void generator(List<String> res, int n, String ch, int o, int c) {
        if (ch.length() == 2 * n) {
            res.add(ch);
            return;
        }

        if (o < n) {
            generator(res, n, ch + "(", o + 1, c);
        }

        if (c < o) {
            generator(res, n, ch + ")", o, c + 1);
        }
    }
}