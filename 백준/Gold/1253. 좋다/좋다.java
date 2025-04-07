import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int result = 0;

        for(int i=0;i<N;i++){
            int start = 0;
            int end = N-1;
            int target = arr[i];

            while(start < end){
                if(start == i){
                    start++;
                    continue;
                }
                if(end == i){
                    end--;
                    continue;
                }

                int sum = arr[start] + arr[end];

                if(sum == target){
                    result++;
                    break;
                }else if(sum < target){
                    start++;
                }else{
                    end--;
                }
            }
        }
        System.out.println(result);
    }
}
