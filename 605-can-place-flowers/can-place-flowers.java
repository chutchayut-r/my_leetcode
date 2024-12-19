class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n == 0) {
            return true;
        }

        for(int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {   // empty

                boolean lelfEmpty = checkLeft(i, flowerbed);
                boolean rightEmpty = checkRight(i, flowerbed);

                if (lelfEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    n--;

                    if (n == 0) {
                        return true;
                    }
                }

            } 
            else {
                if((flowerbed.length-i) < n*2) {
                    return false;
                }
            }
        }

        return false;
    }

    public boolean checkLeft(int index, int[] flowerValue) {
        if (index == 0) {
            return true;    // at start point your left always empty.
        }

        if (flowerValue[index-1] == 0) {
            return true;
        }

        return false;
    }

    public boolean checkRight(int index, int[] flowerValue) {

        if (index == flowerValue.length-1) {
            return true;    // at end point your right always empty.
        }

        if (flowerValue[index+1] == 0) {
            return true;
        }

        return false;
    }

}