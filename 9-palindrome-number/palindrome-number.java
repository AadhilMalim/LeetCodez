class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int z=x;
        int y =0;
        while(x!=0){
            y*=10;
            y+=x%10;
            x/=10;
        }
        return y==z?true:false;
    }
}