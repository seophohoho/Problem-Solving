import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] primes = {2,3,5,7};

        for(int prime: primes){
            findPrime(prime,1,N);
        }
    }

    static boolean isPrime(int targetNumber){
        if(targetNumber < 2){
            return false;
        }

        for(int i=2;i<=Math.sqrt(targetNumber);i++){
            if(targetNumber % i == 0){
                return false;
            }
        }

        return true;
    }

    static void findPrime(int targetNumber, int depth, int maxDepth){
        if(depth == maxDepth){
            System.out.println(targetNumber);
        }

        for(int i=1;i<=9;i++){
            int newTargetNumber = targetNumber * 10 + i;
            if(isPrime(newTargetNumber)){
                findPrime(newTargetNumber,depth+1,maxDepth);
            }
        }
    }

}
