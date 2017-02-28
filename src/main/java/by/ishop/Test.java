package by.ishop;

import javax.jws.WebMethod;
import javax.jws.WebService;


/**
 * Created by sten on 28.02.17.
 */
@WebService
public class Test {
    @WebMethod
    public String test(String name) {
        return "Hello, " + name;
    }
}

