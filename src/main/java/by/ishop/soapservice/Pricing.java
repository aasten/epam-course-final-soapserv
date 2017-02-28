package by.ishop.soapservice;

public interface Pricing {

    EntryPrice getEntryPrice(String entryId) throws NoEntryPricingInfo;

}