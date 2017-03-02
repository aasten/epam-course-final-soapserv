package by.ishop.data.price;

public class NoEntryPricingInfo extends Exception {
    private static final long serialVersionUID = 1L;
    public NoEntryPricingInfo(String msg) { super(msg); }
    public NoEntryPricingInfo(String msg, Throwable cause) { super(msg,cause); }
}
