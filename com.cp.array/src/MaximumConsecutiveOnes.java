public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int [] prices = {1, 0, 1, 1, 0, 1};

        int left = 0;
        int right;
        int count = 0;

        while (left < prices.length ){
            right=left+1;
            while (right < prices.length){
                if(prices[right]==1)right++;
                else break;
            }
            int checkCount = right-left;
            if (checkCount > count){
                count=checkCount;
            }
            left = right+1;

        }

        System.out.println(count);

    }
}
