class Solution {
    static String delAlternate(String S) {
        // code here
        StringBuilder sb = new StringBuilder();
        int size = S.length();
        
        if(size%2==0){
          for(int i=0;i<S.length()/2;i++)
            sb.append(S.charAt(2*i));
        }else {
        for(int i=0;i<=S.length()/2;i++)
            sb.append(S.charAt(2*i));
        
        }
        
        S = sb.toString();
        return S;
    }
}
