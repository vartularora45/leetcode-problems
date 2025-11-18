class Solution {
    public int numWaterBottles(int nb, int ne) {

        int total = nb;
        int empty = nb;

        while(empty >= ne){
            int newB = empty / ne;
            total += newB;
            empty = (empty % ne) + newB;
        }

        return total;
    }
}
