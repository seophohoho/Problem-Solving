import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = 0;
        int result = 0;
        int sum = 0;

        while(true){

            if(sum >= M){
                sum -= arr[start];
                start++;
            }else if(end == N){
                break;
            }else{
                sum += arr[end];
                end++;
            }

            if(sum == M){
                result++;
            }
        }

        System.out.println(result);
    }
}
