class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int max =arr[n-1];
        ArrayList<Integer> res =new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                res.add(max);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
