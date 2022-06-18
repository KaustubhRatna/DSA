class Solution
{
    // complete the function
    public static int digitalRoot(int n)
    {
       if(n>=0 && n<=9)
       return n;
       int root = n%10 + digitalRoot(n/10);
       return digitalRoot(root);
    }
}