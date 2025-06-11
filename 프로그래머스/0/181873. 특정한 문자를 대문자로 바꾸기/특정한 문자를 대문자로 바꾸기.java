class Solution {
    public static String solution(String my_string, String alp) {
        String upper = alp.toUpperCase();

        System.out.println(upper);

        return my_string.replaceAll(alp,upper);

        //왜 아래처럼 하면 원복 String은 바뀌지 않을까??
        //my_string.replaceAll(alp,upper);
        //return my_string
    }
}