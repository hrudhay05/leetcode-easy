class Solution {
    public int romanToInt(String s) {

        int p =0;
        int c=0;
        int t=0;
        for(int i=s.length()-1;i>=0;i--){
            c = get(s.charAt(i));
            if(c<p){
                t-=c;
            }
            else{
                t+=c;
            }
            p=c;
        }
        return t;
        
    }
    public static int get(char c){

        switch(c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
}
