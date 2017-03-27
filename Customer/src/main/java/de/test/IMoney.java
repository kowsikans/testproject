package de.test;

/**
 * Created by kowsikans on 27.03.17.
 */
public class IMoney {
    double fAmount;
    String iCurrency;

    public String getiCurrency() {
        return iCurrency;
    }

    public void setiCurrency(String iCurrency) {
        this.iCurrency = iCurrency;
    }

    public double getfAmount() {
        return fAmount;
    }

    public void setfAmount(double fAmount) {
        this.fAmount = fAmount;
    }

    @Override
    public boolean equals(Object obj) {
        IMoney m = (IMoney)obj;
        if(fAmount == m.getfAmount())
        {
            if (iCurrency == m.getiCurrency())
            {
                return true;
            }
        }

        return false;
    }
}
