package quan;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices){
        int n = prices.length;
        int min = prices[0];
        int result = 0;
        if (n <= 1 || prices == null){
            return 0;
        }
        for (int i = 0; i < n; i++){
            result = Math.max(result, prices[i] - min);
            min = Math.min(min, prices[0]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {7, 5, 1, 54, 64, 3, 9, 10};
        System.out.println(maxProfit(prices));
    }
}
