import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] Ns = new int[N];
        String[] inputsN = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            Ns[i] = Integer.parseInt(inputsN[i]);
        }

        Arrays.sort(Ns);

        int M = Integer.parseInt(br.readLine());
        int[] Ms = new int[M];
        String[] inputsM = br.readLine().split(" ");

        for (int i = 0; i < M; i++) {
            Ms[i] = Integer.parseInt(inputsM[i]);
        }


        for(int key : Ms){
            int result = binarySearch(Ns, key) ? 1 : 0;
            if(key != M-1){
                System.out.println(result);
            }else{
                System.out.print(result);
            }

        }
    }

    public static boolean binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == key) {
                return true;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
