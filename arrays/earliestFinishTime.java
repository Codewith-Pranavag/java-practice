class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        // Calculate both scenarios and pick the minimum
        return Math.min(
            calc(landStartTime, landDuration, waterStartTime, waterDuration),
            calc(waterStartTime, waterDuration, landStartTime, landDuration)
        );
    }

    private int calc(int[] firstStart, int[] firstDur, int[] secondStart, int[] secondDur) {
        int minFirstEnd = Integer.MAX_VALUE;
        for (int i = 0; i < firstStart.length; i++) 
            minFirstEnd = Math.min(minFirstEnd, firstStart[i] + firstDur[i]);
        
        int minTotal = Integer.MAX_VALUE;
        for (int i = 0; i < secondStart.length; i++)
            minTotal = Math.min(minTotal, Math.max(minFirstEnd, secondStart[i]) + secondDur[i]);
        return minTotal;
    }
}
