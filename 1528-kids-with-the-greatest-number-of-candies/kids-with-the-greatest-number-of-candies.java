class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results = new ArrayList<>();
        int maxCandie = 0;

        // Find max
        for (int index = 0; index < candies.length; index++) {
            if (candies[index] > maxCandie) {
                maxCandie = candies[index];
            }
        }

        // Compare
        for (int cnt = 0; cnt < candies.length; cnt++) {
            if(candies[cnt] + extraCandies < maxCandie) {
                results.add(false);
            } else {
                results.add(true);
            }
        }

        return results;
    }
}