import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start = 0;
        int end = N - 1;
        int min = Integer.MAX_VALUE;
        int resultA = 0;
        int resultB = 0;

        while(start < end) {
            int sum = arr[start] + arr[end];
            int abs = Math.abs(sum);

            if(abs < min) {
                min = abs;
                resultA = arr[start];
                resultB = arr[end];
            }

            if(sum < 0) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(resultA + " " + resultB);
    }
}
