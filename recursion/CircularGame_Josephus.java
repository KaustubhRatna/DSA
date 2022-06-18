class Solution {
    public int findTheWinner(int n, int k) {
            return (jos(n,k)+1);
        
    }
    public int jos(int n, int k) {
        if(n==1)
            return 0;
        else
            return (jos(n-1,k)+k)%n;
        
    }
}