import java.util.*;

public class Solution {
    public int solve(int[] A) {

        int max = A[0];
        final int result[]={0};

        for (int i = 1; i < A.length; i++) {
            max = Math.max(max, A[i]);
        }

        boolean isPrime[] = new boolean[max + 1];

        for (int i = 0; i <= max; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i <= max; i++) {
            if(isPrime[i]){
                for (int j = i*i; j <= max; j +=i) {
                    isPrime[j]=false;
                }
            }
        }

        int nearestPrime[] = new int[max + 1];
        int primes[] = new int[max + 1];
        Map<Integer,Integer> count = new HashMap<>();
        int lastPrime=1;

        for(int i=1; i<=max; i++){
            if(isPrime[i]){
                lastPrime = i;
                count.put(i,0);
            }
            nearestPrime[i] = lastPrime;
        }


        for (int i=0;i<A.length;i++){
            int prime = nearestPrime[A[i]];
            count.put(prime,count.get(prime)+1);
        }

        count.forEach((prime,currentCount) ->{
            if(prime!=1){
                result[0]+=Math.pow(2,currentCount)-1;
            }
        });

        return result[0];
    }
}