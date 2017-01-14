package pajerowski.tony;

import java.math.BigDecimal;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by anthonypajerowski on 1/11/17.
 */

public class CurrencyExchange {

    private double rate;

    private static final Map <String, Double> exchangeRate = new HashMap <String, Double>();

    static {
        exchangeRate.put("Us Dollar", 1.00);
        exchangeRate.put("Euro", 0.94);
        exchangeRate.put("British Pound", 0.82);
        exchangeRate.put("Indian Rupee", 68.32);
        exchangeRate.put("Australian Dollar", 1.35);
        exchangeRate.put("Canadian Dollar", 1.32);
        exchangeRate.put("Singapore Dollar", 1.43);
        exchangeRate.put("Swiss Franc", 1.01);
        exchangeRate.put("Malaysian Ringgit", 4.47);
        exchangeRate.put("Japanese Yen", 115.84);
        exchangeRate.put("Chinese Yuan Renminbi", 6.92);
    }

    public void calculateExchangeRate(String before, String after) {
        rate = exchangeRate.get(before)/exchangeRate.get(after);
    }

    public double getRate() {
        return rate;
    }

// tariq's space
    public String convertMoney(double money) {
        BigDecimal numberGuide = new BigDecimal((money * rate));
        return numberGuide.setScale(2, BigDecimal.ROUND_DOWN).toString();
    }
}



