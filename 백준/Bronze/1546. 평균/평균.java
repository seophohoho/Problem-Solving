import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Double[] values = Arrays.stream(input)
                .map(Double::parseDouble)
                .toArray(Double[]::new);
        Double max = Arrays.stream(values)
                .max(Double::compare)
                .orElseThrow();

        double sum = 0;
        for(int i=0;i<N;i++){
            sum+=values[i]/max*100;
        }

        System.out.println(sum/N);
    }
}
