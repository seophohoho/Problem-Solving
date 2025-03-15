import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] mod = new long[M];
        long sum = 0;
        long count = 0;

        mod[0] = 1;

        for (int i = 0; i < N; i++) {
            sum += sc.nextInt();
            int remainder = (int) (sum % M);

            if (remainder < 0) {
                remainder += M;
            }

            count += mod[remainder];
            mod[remainder]++;
        }

        System.out.println(count);
        sc.close();
    }
}
