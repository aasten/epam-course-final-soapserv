package by.ishop.soapservice;

import java.math.BigDecimal;

// DAO
public class TestPricing implements Pricing {
    /* (non-Javadoc)
     * @see by.ishop.soapservice.Pricing#getEntryPrice(java.lang.String)
     */
    @Override
    public EntryPrice getEntryPrice(String entryId) throws NoEntryPricingInfo {
        Long entryNumId;
        if(null == entryId) throw new NoEntryPricingInfo("Argument is null");
        try {
            entryNumId = Long.parseLong(entryId);
            if(entryNumId < 0) throw new RuntimeException("Entry id must be positive integer");
        } catch(RuntimeException e) {
            throw new NoEntryPricingInfo("Bad entry id", e);
        }
        // stub
        EntryPrice stub = new EntryPrice();
        stub.setCurrencyCode("USD");
        stub.setValue(new BigDecimal("42"));
        return stub;
    }
}
