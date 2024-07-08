class Solution {
    public int findTheWinner(int n, int k) {
        return helper(n, k);
    }
    
    public int helper(int n, int k) {
        if (n == 1) {
            return 1; // Base case: Only one person left, position 0 (0-based index)
        }
        
        // Recursive call to find the position of the survivor in a smaller circle
        return (helper(n - 1, k) + k-1) % n+1;
    }
}
