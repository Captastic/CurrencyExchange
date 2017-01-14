package pajerowski.tony;
import java.util.Scanner;

/**
 * Created by anthonypajerowski on 1/12/17.
 */

public class Main {

    public static void main (String[]args) {
        CurrencyExchange exchanger = new CurrencyExchange();
        Scanner sc = new Scanner(System.in);
        System.out.println(exchanger.getRate());
        System.out.println(exchanger.convertMoney(3));
        System.out.println("If you wanted to exchange your money for money in a different currency, " +
                "you are in the right place\nEnter the current currency type of your money in the" +
                " following format:\n" +
                "Us Dollar\nEuro\nBritish\nIndian Rupee\nAustralian Dollar\nCanadian Dollar\n" +
                "Singapore Dollar\nSwiss Franc\nMalaysian Ringgit\nJapanese Yen\nChinese Yuan Renminb\n");
        String current = sc.nextLine();
        System.out.println("current: " + current);
        System.out.println("Enter the currency type that you would like to convert your money:");
        String future = sc.nextLine();
        System.out.println("future: " + future);
        System.out.println("Enter the numerical amount of money of have in your current currency:");
        int moneyAmount = sc.nextInt();
        exchanger.calculateExchangeRate(current,future);
        String newAmount = exchanger.convertMoney(moneyAmount);
        System.out.println("Your " + moneyAmount + " " + current + " is worth roughly "
                + newAmount+ " " + future);
        sc.close();
    }
}

