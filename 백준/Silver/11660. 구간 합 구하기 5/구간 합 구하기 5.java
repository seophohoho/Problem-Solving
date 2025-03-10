import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[][] = new int[N + 1][N + 1];
        int arr2[][] = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = sc.nextInt();
                arr2[i][j] = arr[i][j] + arr2[i][j - 1] + arr2[i - 1][j] - arr2[i - 1][j - 1];
            }
        }

        for (int i = 0; i < M; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            System.out.println(arr2[x2][y2] - arr2[x1 - 1][y2] - arr2[x2][y1 - 1] + arr2[x1 - 1][y1 - 1]);

        }
    }
}
