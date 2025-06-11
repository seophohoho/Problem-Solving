class Solution {
    public static String solution(String myString) {
        String str1 = myString.replaceAll("a","A");
        StringBuilder sb = new StringBuilder();

        for(char c : str1.toCharArray()){
            if("A".indexOf(c) >= 0){
                sb.append(c);
            }else{
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }
}