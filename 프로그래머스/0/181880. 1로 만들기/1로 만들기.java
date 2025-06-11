class Solution {
    public static int solution(int[] num_list) {
        int ret = 0;

        for(int num : num_list){
            while(num != 1){
                if(num % 2 == 0){
                    num = num / 2;
                }else{
                    num = (num-1)/2;
                }
                ret++;
            }
        }

        return ret;
    }
}