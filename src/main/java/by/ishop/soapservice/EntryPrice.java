package by.ishop.soapservice;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EntryPrice {
    private BigDecimal value = new BigDecimal("0");
    private String currencyCode = new String("USD");
    
    public BigDecimal getValue() { return value; }
    public void setValue(BigDecimal newValue) { value = newValue; }
    
    public String getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(String cc) { currencyCode = cc; } 
}