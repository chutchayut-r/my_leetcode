class Solution {
    public int largestAltitude(int[] gain) {
        int inputLength = gain.length;
        int[] prefixSum = new int[inputLength+1];
        int maxAltitude  = 0;

        for (int i=0; i<inputLength; i++) {
           int sum = gain[i] + prefixSum[i];
           prefixSum[i+1] = sum;
           maxAltitude = Math.max(prefixSum[i+1],maxAltitude);
        }
        
        return maxAltitude;
    }
}