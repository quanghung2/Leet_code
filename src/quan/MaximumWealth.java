package quan;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] wealth = new int[][]{{1,2,9},{3,2,1},{45,65},{3,34}};
        System.out.println(maximumWealth(wealth));
    }

    public static int maximumWealth(int[][] accounts){
        int[] sum = new int[accounts.length];
        int max = 0;
        int k=0;
        for (int[] account: accounts){
            for (int i= 0; i < account.length; i++){
                sum[k] += account[i];
            }
            k++;
        }
        for (int i = 0; i < accounts.length; i++){
            if (sum[i] > max){
                max = sum[i];
            }
        }
        return max;
    }

}
