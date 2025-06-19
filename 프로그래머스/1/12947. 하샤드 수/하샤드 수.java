class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        String numStr = String.valueOf(x);
        int sum = 0;
        for(int i=0;i<numStr.length();i++){
            char charDigit = numStr.charAt(i);
            int digit = Character.getNumericValue(charDigit);
            sum += digit;
        }

        if(x % sum != 0) answer = false;

        return answer;
    }
}