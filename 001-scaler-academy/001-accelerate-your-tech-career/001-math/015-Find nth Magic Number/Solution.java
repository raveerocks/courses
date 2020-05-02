public class Solution {
    public int solve(int A) {
        int power = 5,result=0;
        while(A>0){
            int bit  = A&1;
            A>>=1;
            result += bit*power;
            power*=5;
        }
        return result;
    }
}