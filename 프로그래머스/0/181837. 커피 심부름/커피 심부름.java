class Solution {
    public int solution(String[] order) {
int result = 0;

        for(String target : order){
            switch(target){
                case "iceamericano":
                case "americanoice":
                case "hotamericano":
                case "americanohot":
                case "americano":
                case "anything":
                    result += 4500;
                    break;
                case "icecafelatte":
                case "cafelatteice":
                case "hotcafelatte":
                case "cafelattehot":
                case "cafelatte":
                    result += 5000;
                    break;

            }
        }

        return result;
    }
}