package LAB_9;

import java.util.Map;

public class CoinDemo {
    public static void main(String[] args) {
        int[] amounts = {68, 99, 30, 0};

        for (int amount : amounts) {
            Map<Coin, Integer> coins = Coin.fewestCoins(amount);

            int total = 0;
            for (int c : coins.values()) {
                total += c;
            }
            System.out.println(amount + " cents -> " + coins + " (" + total + " coins)");
        }
    }
}