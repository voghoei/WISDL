package investment;
import net.webservicex.GetQuote;
import net.webservicex.StockQuote;
import net.webservicex.StockQuoteSoap;

public class Stock {
	private double lastValue=0;
	private double previousVaue=0;

	public Stock(String market) {
		setStockValues(market);
	}	

	public double getLastValue() {
		return lastValue;
	}

	public void setLastValue(double lastValue) {
		this.lastValue = lastValue;
	}

	public double getPreviousVaue() {
		return previousVaue;
	}

	public void setPreviousVaue(double previousVaue) {
		this.previousVaue = previousVaue;
	}

	private void setStockValues(String market){		
		StockQuote stockQuote = new StockQuote();
		StockQuoteSoap stockQuoteSoap = stockQuote.getStockQuoteSoap();
		GetQuote getQuote = new GetQuote();
		getQuote.setSymbol(stockQuoteSoap.getQuote(market));
		String stockInfo = getQuote.getSymbol();
		lastQuote(stockInfo);
		previousQuote(stockInfo);
		this.toString();
	}
	
	private void lastQuote(String stockInfo){
		if (stockInfo.contains("<Last>")){
			setLastValue(Double.parseDouble(stockInfo.substring(stockInfo.indexOf("<Last>") + "<Last>".length(), stockInfo.indexOf("</Last>"))));		
		}
	}
	
	private void previousQuote(String stockInfo){
		if (stockInfo.contains("<PreviousClose>")){
			setPreviousVaue(Double.parseDouble(stockInfo.substring(stockInfo.indexOf("<PreviousClose>") + "<PreviousClose>".length(), stockInfo.indexOf("</PreviousClose>"))));
		}
	}

	@Override
	public String toString() {
		return "Stock [lastValue=" + lastValue + ", previousVaue=" + previousVaue + "]";
	}
	
	
}
