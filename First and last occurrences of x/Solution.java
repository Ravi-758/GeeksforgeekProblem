class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> a = new ArrayList<>();
        long first=0, last=0;
        for(int i = 0; i<n; i++){
            if(arr[i]==x){
                first=i;
                a.add(first);
                break;
            }
        }
        for(int i=n-1; i>=0; i--){
            if(arr[i]==x){
                last=i;
                a.add(last);
                break;
            }
        }
        if(a.size()==0){
            a.add(Long.valueOf(-1));
            a.add(Long.valueOf(-1));
        }
        return a;
    }
}
