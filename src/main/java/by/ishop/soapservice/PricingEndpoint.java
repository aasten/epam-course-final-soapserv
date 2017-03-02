package by.ishop.soapservice;

import by.ishop.data.DataAccess;
import by.ishop.data.price.EntryPrice;
import by.ishop.data.price.NoEntryPricingInfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(serviceName = "PricingEndpoint")
@SOAPBinding(style = Style.RPC)
public class PricingEndpoint implements Pricing {

    @WebMethod
    @Override
    public EntryPrice getEntryPrice(@WebParam(name="entryId") String entryId) throws NoEntryPricingInfo {
        Integer entryNumId;
        if(null == entryId) throw new NoEntryPricingInfo("Entry id cannot be null");

        try {
            entryNumId = Integer.parseInt(entryId);
            if(entryNumId < 0) throw new RuntimeException("Entry id must be positive integer");
            return DataAccess.INSTANCE.getPriceDAO().getForProductId(entryNumId);
        } catch(RuntimeException e) {
            throw new NoEntryPricingInfo("Bad entry id: " + e.getMessage(), e);
        }
    }
}
