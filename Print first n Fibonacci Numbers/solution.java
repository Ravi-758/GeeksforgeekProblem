
class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
       long[]arr = new long[n];
        if(n==1){
            arr[0]=1;
            return arr;
        }
        arr[0]=arr[1]=1;
        for(int i=0;i<n-2;i++){
            arr[i+2]=arr[i]+arr[i+1];
        }
        return arr;
    }
}
