class Solution {
    public boolean isPalindrome(int n) {
        int dup=n;
        int lastdigit=0;
        int revNo=0;
        while (n > 0) {
            lastdigit=n%10;
            n=n/10; 
            revNo=(revNo*10)+lastdigit;
        }
        
        if (dup==revNo) {
            return true;
            
        }else{
            return false;
        }
    }
}