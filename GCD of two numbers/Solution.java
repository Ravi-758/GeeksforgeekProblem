
class Solution
{
    public int gcd(int A , int B) 
    { 
        //code here
        int min=0;
        if(A<B){
            min=A;
        }
        else{
            min=B;
        }
        for(int i=min;i>=0;i--){
            if(A%i==0&&B%i==0){
                return i;
                
            }
        }
        return 1;
    }   
     
}

Link:--https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
