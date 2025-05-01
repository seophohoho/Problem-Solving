import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            int input = sc.nextInt();
            arr[i] = input;
        }

        int start = 0;
        int end = 0;
        int cnt = 0;
        int min = Integer.MAX_VALUE;

        while(end < N){
            if(arr[end] == 1) cnt++;

            while(cnt>=K){
                min = Math.min(min,end-start+1);
                if(arr[start] == 1) cnt--;
                start++;
            }

            end++;
        }

        System.out.print(min == Integer.MAX_VALUE ? -1 : min);

    }
}
