import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> digits = new ArrayList<>();

        int t = sc.nextInt();
        int[] ns = new int[t];

        for(int i=0;i<t;i++){
            ns[i] = sc.nextInt();
        }

        for(int i=0;i<t;i++) {
            int q = ns[i];
            int newQ = -1;
            int newR = 0;
            while (newQ != 0) {
                newQ = q / 2;
                newR = q % 2;

                q = newQ;
                digits.add(newR);
            }
            findOneDigit(digits);
            digits.clear();
        }

    }

    private static void findOneDigit(ArrayList<Integer> digits) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<digits.size();i++) {
            if(digits.get(i) == 1){
                sb.append(i+" ");
            }
        }
        System.out.println(sb.toString());
    }
}
