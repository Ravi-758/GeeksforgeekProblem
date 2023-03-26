class Solution{
    static long factorial(int N){
        // code here
        if(N==0)
        return 1;
        long fact=1;
        for(int i=N;i>=1;i--){
            fact =fact*i;
        }
        return fact;
    }
}
