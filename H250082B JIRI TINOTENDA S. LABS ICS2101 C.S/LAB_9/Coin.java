package LAB_9;

import java.util.EnumMap;
import java.util.Map;

public enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    // greedy: use as many of the biggest coin as possible, then move down
    static Map<Coin, Integer> fewestCoins(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        Map<Coin, Integer> result = new EnumMap<>(Coin.class);
        Coin[] all = values();
        for (int i = all.length - 1; i >= 0; i--) {
            int count = amount / all[i].value;
            if (count > 0) {
                result.put(all[i], count);
                amount -= count * all[i].value;
            }
        }
        return result;
    }
}