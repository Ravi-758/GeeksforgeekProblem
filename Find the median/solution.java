
class Solution
{
    public int find_median(int[] v)
    {
        int median = 0;
        Arrays.sort(v);
        int n = v.length;
        if( n%2 == 0)
        {
            median =(v[n/2] + v[n/2 - 1 ] )/ 2;
        }
        else{
            median = v[n/2];
        }
        return median;
    }
}
