class Solution {
    static String armstrongNumber(int n){
        // code here
        
        int num = n;
        int newN = 0;
        while (num != 0) {
            
            int lastDigit = num%10;
            int cube = lastDigit*lastDigit*lastDigit;
            newN = newN + cube;
            num = num/10;
        }
        if (newN == n) {
            return "Yes";
        } 
        else {
            return "No";
        }
    }
}
