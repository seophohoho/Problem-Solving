import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> result = new ArrayList<>();

        for (String str : strArr) {
            if (!str.contains("ad")) {
                result.add(str);
            }
        }

        return result.toArray(new String[0]);
    }
}