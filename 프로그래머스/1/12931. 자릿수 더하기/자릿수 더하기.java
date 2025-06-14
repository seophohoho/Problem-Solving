import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String numberToStr = Integer.toString(n);
        char[] arr = numberToStr.toCharArray();

        for(int i=0;i<numberToStr.length();i++){
            answer += Character.getNumericValue(arr[i]);
        }

        return answer;
    }
}