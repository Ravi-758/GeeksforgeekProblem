class Solution {
    static long nPr(long n, long r) {
        long a = factorial(n);
        long b = factorial(n - r);
        return a / b;
    }
    
    static long factorial(long x) {
        if(x == 0) return (long)1;
        return x * factorial(x - 1);
    }
}

Link:-https://practice.geeksforgeeks.org/problems/npr4253/1?page=2&difficulty[]=-2&status[]=unsolved&sortBy=submissions
