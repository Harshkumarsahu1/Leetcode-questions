class Solution {
    public double averageWaitingTime(int[][] customers) {
        long time = 0, sum = 0;
        for(int[] c : customers) {
            time = Math.max(time, c[0]) + c[1]; 
            sum += (time - c[0]);
        }
        return (double) sum / customers.length;
    }
}