package by.ishop.soapservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.math.BigDecimal;

@WebService(serviceName = "PricingEndpoint")
@SOAPBinding(style = Style.RPC)
public class PricingEndpoint implements Pricing {
    
    public PricingEndpoint() {} // required for jax rs 1.0
    
    @Override
    @WebMethod
    public EntryPrice getEntryPrice(@WebParam(name="entryId") String entryId) throws NoEntryPricingInfo {
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
