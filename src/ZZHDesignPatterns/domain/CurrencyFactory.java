package ZZHDesignPatterns.domain;

public class CurrencyFactory {
    public static Currency newCurrency(Contry contry) {
        switch (contry) {
            case USA -> {
                return new UsDollar();
            }
            case BRAZIL -> {
                return new Real();
            }
            default -> {
                throw new IllegalArgumentException("Não achamos a moeda");
            }
        }
    }
}
