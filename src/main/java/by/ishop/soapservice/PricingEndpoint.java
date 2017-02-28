package by.ishop.soapservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(serviceName = "PricingEndpoint")
@SOAPBinding(style = Style.RPC)
public class PricingEndpoint {
    
    private Pricing pricing = new TestPricing();
    
    public PricingEndpoint(Pricing pricing) {
        this.pricing = pricing;
    }
    
    public PricingEndpoint() {} // required for jax rs 1.0
    
    @WebMethod
    public EntryPrice getEntryPrice(@WebParam(name="entryId") String entryId) throws NoEntryPricingInfo{
        return pricing.getEntryPrice(entryId);
    }
    
//    public static void main(String[] args) {
//        Endpoint.publish("http://localhost:7000/soapservice", new PricingEndpoint(new TestPricing()));
//     }
}
