class Solution
{
    public int gcd(int A , int B) 
    { 
        //code here
          while (A!=B){
           if(A>B){
               A=A-B;
           }else{
               B=B-A;
           }
       }
       return A;
    }   
     
}
link:-- https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1
