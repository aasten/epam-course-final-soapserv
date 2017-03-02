package by.ishop.soapservice;

import by.ishop.data.price.EntryPrice;
import by.ishop.data.price.NoEntryPricingInfo;

public interface Pricing {

    EntryPrice getEntryPrice(String entryId) throws NoEntryPricingInfo;
}