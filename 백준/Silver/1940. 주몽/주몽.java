import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = N-1;
        int result = 0;

        Arrays.sort(arr);

        while(start<end){
            int sum = arr[start] + arr[end];

            if(sum == M){
                result++;
                start++;
                end--;
            }else if(sum > M){
                end--;
            }else{
                start++;
            }
        }

        System.out.println(result);
    }
}
