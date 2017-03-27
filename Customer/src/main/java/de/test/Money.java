package de.test;

/**
 * Created by kowsikans on 27.03.17.
 */
public class Money extends IMoney {

    public Money(double amount, String currency) {
        setfAmount(amount);
        setiCurrency(currency);
    }

    public Money add(IMoney money){
        return new Money(getfAmount()+money.getfAmount(), getiCurrency());
    }
}
