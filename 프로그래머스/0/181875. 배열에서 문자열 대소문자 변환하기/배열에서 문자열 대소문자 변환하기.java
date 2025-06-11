import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr){
        ArrayList<String> ret = new ArrayList<>();
        int idx = 0;
        for(String str : strArr){
            if(idx % 2 == 0){
                ret.add(str.toLowerCase());
            }else{
                ret.add(str.toUpperCase());
            }
            idx++;
        }

        return ret.toArray(new String[0]);
    }
}