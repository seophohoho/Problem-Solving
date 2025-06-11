class Solution {
    public static int solution(int[] num_list) {
        int ret = 0;
        if(num_list.length >= 11){
            for(int i=0;i<num_list.length;i++){
                ret += num_list[i];
            }
        }else {
            ret = num_list[0];
            for(int i=1;i<num_list.length;i++){
                ret *= num_list[i];
            }
        }

        return ret;
    }
}