
public class InterestIs {

	public static void main(String[] args) {
		double principleAmt = 1261.98;
		double interestRate = 0.182;
		double interestAmt;
		double interestPercent;

		interestPercent = interestRate * 100;

		interestAmt = principleAmt * interestRate;

		System.out.printf("Interest is: $%4.2f at %1.1f%%", interestAmt, interestPercent);
	}

}
