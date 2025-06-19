import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] split = Long.toString(n).split("");
        
        Arrays.sort(split, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            sb.append(s);
        }

        return Long.parseLong(sb.toString());
    }
}