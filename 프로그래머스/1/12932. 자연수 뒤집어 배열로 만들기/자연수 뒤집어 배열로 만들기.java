class Solution {
    public int[] solution(long n) {
        char[] arr = Long.toString(n).toCharArray();

        int[] answer = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            answer[i] = Character.getNumericValue(arr[arr.length-1-i]);
        }

        return answer;
    }
}