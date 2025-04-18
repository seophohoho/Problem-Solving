import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<N*N;i++){
            int value = sc.nextInt();
            pq.offer(value);

            if(pq.size() > N){
                pq.poll();
            }
        }

        System.out.print(pq.peek());
    }
}
