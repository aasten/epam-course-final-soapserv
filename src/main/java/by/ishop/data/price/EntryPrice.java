package by.ishop.data.price;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EntryPrice {
    private BigDecimal value = new BigDecimal("0");
    private String currencyCodeISO4217 = new String("USD");

    public BigDecimal getValue() { return value; }
    public void setValue(BigDecimal newValue) { value = newValue; }
    
    public String getCurrencyCodeISO4217() { return currencyCodeISO4217; }
    public void setCurrencyCodeISO4217(String cc) { currencyCodeISO4217 = cc; }

}