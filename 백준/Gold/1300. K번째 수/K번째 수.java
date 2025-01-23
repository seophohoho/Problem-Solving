import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        long left = 1, right = (long) N * N;
        long result = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (countLessThanOrEqual(mid, N) >= k) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(result);
    }

    private static long countLessThanOrEqual(long mid, int N) {
        long count = 0;
        for (int i = 1; i <= N; i++) {
            count += Math.min(mid / i, N);
        }
        return count;
    }
}
