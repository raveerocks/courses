package io.github.raveerocks;

public class Solution {
    public String convertToTitle(int A) {
        StringBuilder sb = new StringBuilder();
        char c;

        while (A>26){
            c =indexChar((A-1+26)%26);
            A = (A-1)/26;
            sb.append(c);
        }
        
        c =indexChar(A-1);
        sb.append(c);
        
        return sb.reverse().toString();
    }

    private char indexChar(int i) {
        return (char)('A'+i);
    }
}
