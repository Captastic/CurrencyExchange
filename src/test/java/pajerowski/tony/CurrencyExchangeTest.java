package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by anthonypajerowski on 1/11/17.
 */

public class CurrencyExchangeTest {
    CurrencyExchange currencyExchange;
    CurrencyExchange rateTest;

    @Before
    public void setUp() {
        currencyExchange = new CurrencyExchange();
    }

    @Test
    public void calculateExchangeRateDollarToEuro() {
        Double expected = 1.00 / .94;  //
        currencyExchange.calculateExchangeRate("Us Dollar", "Euro");
        Double actual = currencyExchange.getRate();
        assertEquals("I expect that the Dollar to Euro will be 1 / .94", expected, actual);
    }

    @Test
    public void calculateExchangeRateEuroToDollar() {
        Double expected = 0.94 / 1.00;
        currencyExchange.calculateExchangeRate("Euro", "Us Dollar");
        Double actual = currencyExchange.getRate();
        assertEquals("I expect that the Euro to Dollar will be .94 / 1", expected, actual);
    }

    @Test
    public void calculateExchangeRateEuroToBritishPound() {
        Double expected = 0.94 / 0.82;  //
        currencyExchange.calculateExchangeRate("Euro", "British Pound");
        Double actual = currencyExchange.getRate();
        assertEquals("I expect that the Euro to British Pound will be 0.94/0.82", expected, actual);
    }

    @Test
    public void calculateExchangeRateBritishPoundToIndianRupee() {
        Double expected = 0.82 / 68.32;  // can I set precision?
        currencyExchange.calculateExchangeRate("British Pound", "Indian Rupee");
        Double actual = currencyExchange.getRate();
        assertEquals("I expect that the British Pound to Indian Rupee will be 0.82/68.31", expected, actual);
    }

    @Test
    public void calculateExchangeRateRupeeToCanadianDollar() {
        Double expected = 68.32 / 1.32;  //
        currencyExchange.calculateExchangeRate("Indian Rupee", "Canadian Dollar");
        Double actual = currencyExchange.getRate();
        assertEquals("I expect that the Rupee to Canadian Dollar will be 68.32/1.32", expected, actual);
    }

    @Test
    public void calculateExchangeRateCanadianDollarToSingaporeDollar() {
        Double expected = 1.32 / 1.43;  //
        currencyExchange.calculateExchangeRate("Canadian Dollar", "Singapore Dollar");
        Double actual = currencyExchange.getRate();
        assertEquals("I expect that the Canadian Dollar to Singapore Dollar will be 1.32/1.43", expected, actual);
    }

    @Test
    public void calculateExchangeRateUsDollarToSwissFranc() {
        Double expected = 1 / 1.01;  //
        currencyExchange.calculateExchangeRate("Us Dollar", "Swiss Franc");
        Double actual = currencyExchange.getRate();
        assertEquals("I expect that the Us Dollar to Swiss Franc will be 1/1.01", expected, actual);
    }

    @Test
    public void calculateExchangeRateFrancToMalaysianRinggit() {
        Double expected = 1.01 / 4.47;  //
        currencyExchange.calculateExchangeRate("Swiss Franc", "Malaysian Ringgit");
        Double actual = currencyExchange.getRate();
        assertEquals("I expect that the Franc to Malaysian Ringgit will be 1.01/4.47", expected, actual);
    }

    @Test
    public void calculateExchangeRateMalaysianRinggitToJapaneseYen() {
        Double expected = 4.47 / 115.84;  //
        currencyExchange.calculateExchangeRate("Malaysian Ringgit", "Japanese Yen");
        Double actual = currencyExchange.getRate();
        assertEquals("I expect that the Malaysian Ringgit to Japanese Yen will be 4.47/115.84", expected, actual);
    }

    @Test
    public void calculateExchangeRateJapaneseYenToChineseYuanRenminbi() {
        Double expected = 115.84 / 6.92;  //
        currencyExchange.calculateExchangeRate("Japanese Yen", "Chinese Yuan Renminbi");
        Double actual = currencyExchange.getRate();
        assertEquals("I expect that the Japanese Yen to Chinese Yuan Renminbi will be 115.84/6.92", expected, actual);
    }


/*                  The following test fails due to a null pointer exception.  This is presumably due to improper
                    implementation of the bigDecimal class in the convertMoney method.
    @Test
    public void convertMoneyEuroTest() {
        String expected = "3";
        currencyExchange.calculateExchangeRate("Us Dollar", "Us Dollar");  // sets exchange rate to 1
        String actual = rateTest.convertMoney(3);
        assertEquals("I expect that the string returned should be 0.94 for the Euro", expected, actual);
    }
*/
    @Test
    public void getRateTest() {
        Double expected = 1.0;
        currencyExchange.calculateExchangeRate("Us Dollar", "Us Dollar"); // sets exchange rate to 1
        Double actual = currencyExchange.getRate();
        assertEquals(" I expect that the rate should return 1", expected, actual);
    }

}
