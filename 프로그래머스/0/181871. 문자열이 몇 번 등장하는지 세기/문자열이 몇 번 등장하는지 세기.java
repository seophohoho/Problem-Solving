class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        int idx = 0;
        
        while((idx = myString.indexOf(pat, idx)) != -1){
            cnt++;
            idx += 1;
        }
        
        return cnt;
    }
}