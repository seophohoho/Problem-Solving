import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        if (M == 0) {
            System.out.println(0);
            return;
        }

        int arr[] = new int[N];
        long sum = 0;
        long result = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < M; i++) {
            sum += arr[i];
        }

        result = sum;

        for(int i = M; i < N; i++) {
            sum = sum + arr[i] - arr[i - M];
            result = Math.max(result, sum);
        }

        System.out.println(result);
    }
}
