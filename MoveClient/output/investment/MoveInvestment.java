package investment;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-01-27T21:28:55.699-05:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://investment/", name = "MoveInvestment")
@XmlSeeAlso({ObjectFactory.class})
public interface MoveInvestment {

    @WebMethod
    @RequestWrapper(localName = "investmentValue", targetNamespace = "http://investment/", className = "investment.InvestmentValue")
    @ResponseWrapper(localName = "investmentValueResponse", targetNamespace = "http://investment/", className = "investment.InvestmentValueResponse")
    @WebResult(name = "return", targetNamespace = "")
    public investment.Investment investmentValue(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
