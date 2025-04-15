import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[N+1];

        isPrime[0] = true;
        isPrime[1] = true;
        for(int i=2;i<=N;i++){
            if(!isPrime[i]){
                primes.add(i);
                for(int j=i*2;j<=N;j+=i){
                    isPrime[j] = true;
                }
            }
        }

        int result = 0;
        int start = 0;
        int end = 0;
        int sum = 0;

        while(true){
            if(sum >= N){
                if(sum == N) result++;
                sum -= primes.get(start);
                start++;
            }else{
                if(end == primes.size()) break;
                sum += primes.get(end);
                end++;
            }
        }

        System.out.println(result);
    }
}
