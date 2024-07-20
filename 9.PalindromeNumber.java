class Solution {
    public boolean isPalindrome(int x) {
        int y=0, rem = 0;
        int orig=x;
        if(x<0)
        {
            return false;
        }
        while (x!=0)
        {
            rem = x % 10;
            x=x/10;
            y=y*10+rem;
        }
        return y==orig;
    }
}