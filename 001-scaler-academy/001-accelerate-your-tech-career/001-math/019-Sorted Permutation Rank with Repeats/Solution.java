package io.github.raveerocks;

public class Solution{
    public int findRank(String A) {

        PrimeModulus primeModulus = new PrimeModulus(1000003,A.length());
        int length = A.length();
        int repetitions[] = new int[52];


        for(int i = 0; i<length; i++){
            repetitions[hashChar(A.charAt(i))]++;
        }

        int count = length;
        long rank = 0;


        for(int i =0; i<length; i++){
            count --;
            for(int j=0; j< hashChar(A.charAt(i));j++){
                if(repetitions[j]>0){
                    repetitions[j] --;
                    long trank = primeModulus.factorial(count);

                    for(int k=0; k<52; k++){
                        if(repetitions[k]>0){
                            trank = primeModulus.multiply(trank,primeModulus.inverseFactorial(repetitions[k]));
                        }
                    }
                    rank = primeModulus.addition(rank,trank);
                    repetitions[j]++;
                }
            }
            repetitions[hashChar(A.charAt(i))]--;
        }

        return (int) primeModulus.addition(rank,1);
    }
    
    private  static int hashChar(char c){
        int base,offset;

        if(c<='Z'){
            offset = c-'A';
            base = 0;
        }
        else{
            offset = c-'a';
            base =26;
        }
        return base+offset;
    }
}
