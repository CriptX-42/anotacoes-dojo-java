package ZZHDesignPatterns.test;

import ZZHDesignPatterns.domain.Contry;
import ZZHDesignPatterns.domain.Currency;
import ZZHDesignPatterns.domain.CurrencyFactory;

public class FactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Contry.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
