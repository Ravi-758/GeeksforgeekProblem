class Solution{
    int middle(int A, int B, int C){
        //code here
        if((A<B&&B<C)||(C<B&&B<A))
        return B;
        else if ((B<A&&A<C) ||(C<A&&A<B))
        return A;
        else
        return C;
    }
}

// Example 1:

// Input:
// A = 978, B = 518, C = 300
// Output:
// 518
// Explanation:
// Since 518>300 and 518<978, so 
// 518 is the middle element.

// Example 2:

// Input:
// A = 162, B = 934, C = 200
// Output:
// 200
// Exaplanation:
// Since 200>162 && 200<934,
// So, 200 is the middle element.
