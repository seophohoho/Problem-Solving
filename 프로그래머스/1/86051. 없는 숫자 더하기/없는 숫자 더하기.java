class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] arr = new boolean[10];

        for(int i=0;i<numbers.length;i++){
            int target = numbers[i];

            arr[target] = true;
        }

        for(int i=0;i<arr.length;i++){
            if(!arr[i]) {
                answer += i;
            }
        }

        return answer;
    }
}