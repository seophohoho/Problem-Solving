import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        int[] lectures = new int[N];

        int maxLength = 0;
        int maxSize = 0;

        String[] inputsLecture = br.readLine().split(" ");

        for(int i=0;i<N;i++){
            lectures[i] = Integer.parseInt(inputsLecture[i]);
            maxLength = Math.max(maxLength, lectures[i]);
            maxSize+=lectures[i];
        }

        int left = maxLength;
        int right = maxSize;
        int result = right;

        while(left <= right){
            int mid = (left + right) / 2;

            if(isDivide(lectures, N, M, mid)){
                result = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(result);
    }

    private static boolean isDivide(int[] lectures, int N, int M, int size){
        int count=1;
        int currentSum=0;

        for(int i=0;i<N;i++){
            if(currentSum + lectures[i] > size){
                count++;
                currentSum = lectures[i];
                if(count > M) return false;
            }else{
                currentSum += lectures[i];
            }
        }

        return true;
    }
}
