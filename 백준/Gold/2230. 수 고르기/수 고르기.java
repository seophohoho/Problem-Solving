import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        int result = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;

        Arrays.sort(arr);

        while(end < N){
            int calc = arr[end] - arr[start];

            if(calc < M) {
                end++;
            } else {
                result = Math.min(result, calc);
                start++;
                if (start > end) end = start;
            }
        }

        System.out.println(result);
    }
}
