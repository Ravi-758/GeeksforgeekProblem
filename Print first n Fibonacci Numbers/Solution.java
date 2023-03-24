class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        int sum=0,first=1,second=1;
        for(int i=0;i<n;i++){
            sum=first+second;
            first=second;
            second=sum;
        }
        return sum;
    }
}
