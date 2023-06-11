class GfG
{
	boolean isBinary(String n)
	{
	  //Your code here
	  int c=0;
        for (int i = 0; i <n.length() ; i++) {
            if (n.charAt(i)=='1' || n.charAt(i)=='0'){
                c++;
            }
        }
        if(c==n.length()){
            return true;
        }else{
            return false;
        }
	}
}
