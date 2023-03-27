class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
     
        int j=-1;
        for(int i=0;i<N;i++){
            if(A[i]<1){
                j++;
                int temp=A[j];
                A[j]=A[i];
                A[i]=temp;
            }
        }
    }
}
