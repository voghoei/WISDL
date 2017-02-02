package investment;
import java.util.Scanner;

public class ServerTest {

	public static void main(String[] args) {
		System.out.println( "Enter a 3 letter currency code: " );
		Scanner keyboard = new Scanner(System.in);
		String currencyCode = keyboard.next();
		System.out.println( "currencyCode to be sent: " + currencyCode );
		
		MoveInvestment moveInvestment = new MoveInvestment();
		Investment investment = moveInvestment.investmentValue(currencyCode);
		
		System.out.println("Total Last Value Share in " + currencyCode + " is: " + investment.getTotalValue());
		System.out.println("Total Previus Value Share in " + currencyCode + " is: " + investment.getTotalpreviousVaue());

	}
}
