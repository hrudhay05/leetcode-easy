public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int f = 31;
        int l=0;
        int res=0;
        while(f>l){
            if((n&(1<<f))!=0){
                res = res|(1<<l);
            }
            if((n&(1<<l))!=0){
                res = res|(1<<f);
            }
            f--;
            l++;
        }
        return res;
        
    }
}
