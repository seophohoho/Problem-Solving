import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();

        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        for(int i = 1;i<=n;i++){
            if(n % i == 0){
                List.add(i);
            }
        }

        if(List.size() >= k){
            result = List.get(k-1);
        }

        System.out.println(result);


    }
}
