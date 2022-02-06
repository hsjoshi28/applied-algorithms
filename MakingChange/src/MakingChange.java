public class MakingChange {
    public static int minimumCoins(int money, int[] coins) {

        int result[] = new int[money + 1];

        for (int i = 1; i <= money; i++) {
            result[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; money >= i; i++) {
            for (int j = 0; coins.length > j; j++)
                if (coins[j] <= i) {
                    int temp;
                    temp = result[i - coins[j]];
                    if (temp != Integer.MAX_VALUE
                            && temp + 1 < result[i]) {
                        result[i] = temp + 1;
                    }
                }
        }

        if (result[money] == Integer.MAX_VALUE) {
            return -1;
        }else {
            return result[money];
        }
    }
}
