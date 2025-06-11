class Solution {
public int solution(int[] arr) {
        int[] lastArr = arr.clone();
        int cnt = 0;

        while(true){
            int idx = 0;
            for(int num : arr){
                if(num >= 50 && num % 2 == 0){
                    num = num / 2;
                }else if(num <50 && num %2 == 1){
                    num = (num*2) + 1;
                }

                arr[idx] = num;
                idx++;
            }
            cnt++;

            if(cnt > 0 &&isEqualArr(arr,lastArr)) break;

            lastArr = arr.clone();
        }
        return cnt-1;
    }

    public static boolean isEqualArr(int[] a, int[]b){
        int idx = 0;

        for(int num : a){
            if(num != b[idx]){
                return false;
            }
            idx++;
        }

        return true;
    }
}