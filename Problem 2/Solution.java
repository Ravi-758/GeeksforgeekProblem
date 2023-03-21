class Compute {
    
    public int largest(int arr[], int n)
    {
        int larges =arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>larges){
                larges=arr[i];
            }
        }
        return larges;
    }
}
