import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ns = new int[n];

        for(int i=0;i<n;i++){
            ns[i] = sc.nextInt();
        }

        int min = ns[0];
        for(int i=1;i<n;i++){
            if(min > ns[i]){
                min = ns[i];
            }
        }

        int max = ns[0];
        for(int i=1;i<n;i++){
            if(max < ns[i]){
                max = ns[i];
            }
        }

        System.out.println(min + " " + max);

    }
}
