class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        for (int c = 0; c < candies.length; c++) {
           treeSet.add(candies[c]);
        }

        Integer max = treeSet.last();
        Integer min = max - extraCandies;

        List<Boolean> booleanList = new ArrayList<>();
        for (int c = 0; c < candies.length; c++) {
            Boolean bool = false;
           if (candies[c] >= min) {
                bool= true;
           }
            booleanList.add(bool);
        }

        return booleanList;
    }
}