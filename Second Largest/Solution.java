class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int max1=0,max2=0;
        if(arr[0]>arr[1]){
            max1=arr[0];
            max2=arr[1];
        }
        else{
            max2=arr[0];
            max1=arr[1];
        }
        for(int i=2;i<n;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        return max2;
    }
}
