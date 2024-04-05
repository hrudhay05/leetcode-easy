class Solution {
    public String toHex(int n) {
        if(n==0){
            return "0";
        }
        char[] ch = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String res = "";
        while(n!=0){
            res = ch[n&15] + res;
            n= n>>>4;
        }
        return res;
        
    }
}
