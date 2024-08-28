class Solution {
    public int reverse(int x) {
    int num=Math.abs(x);
        if(num==0)
        return 0;
        int revNo=0;
        while(num != 0){
            int lastdigit=num % 10;
            if(revNo> (Integer.MAX_VALUE -lastdigit)/10){
                return 0;
            }
            revNo=(revNo*10)+lastdigit;
            num=num/10;
        }
       if(x<0){
           return -revNo;
       }
        else{
            return revNo;
        }
    }
}