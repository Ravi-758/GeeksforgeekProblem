class Solution {
    int nthTermOfAP(int A1, int A2, int N) {
        // code here
         int diff = A2-A1;
        return A1+(N-1)*diff;
    }
}
