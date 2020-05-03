package io.github.raveerocks;

public class PrimeModulus {

    private final long modulus;
    private final long factorials[];
    private final long invFactorials[];
    private final int length;

    public PrimeModulus(long modulus,int length){
        this.modulus = modulus;
        this.length=length;
        factorials = new long[length+1];
        invFactorials = new long[length+1];
        factorials[0] =1;
        invFactorials[0] =1;
        for(int i=1; i<=length; i++){
            factorials[i] = (factorials[i-1]*i)%modulus;
            invFactorials[i] = exponentiation(factorials[i],modulus-2);
        }
    }

    public  long addition(long a, long b ){
        long aModulus = a%modulus;
        long bModulus = b%modulus;
        long result =(aModulus+bModulus)%modulus;
        return result;
    }

    public  long subtract(long a, long b ){
        long aModulus = a%modulus;
        long bModulus = b%modulus;
        long result =(aModulus-b+modulus)%modulus;
        return result;
    }

    public  long multiply(long a, long b ){
        long aModulus = a%modulus;
        long bModulus = b%modulus;
        long result =(aModulus*bModulus)%modulus;
        return result;
    }

    public long divide(long a, long b){
        return multiply(a,inverse(b));
    }

    public  long exponentiation(long base, long exponent){
        long result =1;
        while(exponent>0){
            if((exponent&1)==1){
                result = (result * base)%modulus;
            }
            base = (base * base) % modulus;
            exponent >>=1;
        }

        return result;
    }

    public  long inverse(long n){
        return exponentiation(n,modulus-2);
    }

    public long factorial(int n){

        try{
            if(n<=length){
                return factorials[n];
            }
            throw new Exception("Factorial length exceeded");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }


    public long inverseFactorial(int n) {

        try{
            if(n<=length){
                return invFactorials[n];
            }
            throw new Exception("Factorial length exceeded");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }
}
