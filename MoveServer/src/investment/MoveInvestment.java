package investment;

import javax.jws.WebMethod;
import javax.jws.WebService;

import net.webservicex.*;
import net.webservicex.Currency;

@WebService
public class MoveInvestment {	

	@WebMethod
	public Investment investmentValue(String currencyCode) {
		double convertorRate = convertedRate(currencyCode);
		System.out.println("Rate "+convertorRate);
		Investment investment = new Investment(convertorRate);
		return investment;			
	}	
	
	private double convertedRate(String currencyCode){
		CurrencyConvertor currencyConvertor = new CurrencyConvertor();
		CurrencyConvertorSoap currencyConvertorSoap = currencyConvertor.getCurrencyConvertorSoap();
		return currencyConvertorSoap.conversionRate(Currency.USD, Currency.fromValue((String)currencyCode.toUpperCase()));		
	}	
}
