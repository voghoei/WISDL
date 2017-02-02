package investment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Investment {
	private double totalValue=0;
	private double totalpreviousVaue=0;
	private int noShares= 1000;
	private double Currencyrate = 1;
	String[] markets = new String[]{"IBM", "AAPL", "HD", "BA", "KO"};

	private Set<Stock> stocks = new HashSet<Stock>();

	public Investment(double currencyrate) {
		for (int i = 0; i < markets.length; ++i) {
			stocks.add(new Stock(markets[i]));			
		}		
		this.setTotalValue();
		this.setTotalpreviousVaue();
		this.setCurrencyrate(currencyrate);
		this.toString();
	}
	
	
	public double getCurrencyrate() {
		return Currencyrate;
	}


	public void setCurrencyrate(double currencyrate) {
		Currencyrate = currencyrate;
	}


	public double getTotalValue() {
		return totalValue * noShares * Currencyrate;
	}

	public void setTotalValue() {	
		for (Stock stock : stocks) {
			this.totalValue += stock.getLastValue();		
		}			
	}

	public double getTotalpreviousVaue() {
		return totalpreviousVaue * noShares * Currencyrate;
	}

	public void setTotalpreviousVaue() {
		for (Stock stock : stocks) {
			this.totalpreviousVaue += stock.getPreviousVaue();		
		}
	}

	public Set<Stock> getStocks() {
		return stocks;
	}

	@Override
	public String toString() {
		return "Investment [totalValue=" + totalValue + ", totalpreviousVaue=" + totalpreviousVaue + ", markets="
				+ Arrays.toString(markets) + ", stocks=" + StocksToString() + "]";
	}
	
	public String StocksToString() {
		String str="";
		for (Stock stock : stocks) {
			str += stock.toString();		
		}
		return str;
	}
	
}

