import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long G = sc.nextInt();
        ArrayList<Long> result = new ArrayList<>();

        long start = 1;
        long end = 2;

        while(end<=100000){
            long calc = end*end - start*start;

            if(calc == G){
                result.add(end);
                end++;
            }else if(calc < G){
                end++;
            }else{
                start++;
            }
        }

        if(result.isEmpty()){
            System.out.println(-1);
        }else{
            for(long value : result){
                System.out.println(value);
            }
        }

    }
}
