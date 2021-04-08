import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int numberOfAccounts = 0;
	private static double moneyStored = 0;
	
	public BankAccount() {
		this.accountNumber = BankAccount.genAccountNum();
		this.checkingBalance = 0.0;
		this.savingsBalance = 0.0;
		numberOfAccounts++;
	}
	

	private static String genAccountNum() {
		Random r = new Random();
		String nums = "1234567890";
		String newAccNum = new String();
		for (int i = 0; i < 10; i++) {
		       int rIndex=r.nextInt(nums.length()); 
		       newAccNum += (nums.charAt(rIndex));            
		}
		System.out.println(newAccNum);
		return newAccNum.toString();
	}
	
	public void deposit(double amtDeposit, String account) {
		if (account.equals("checkingBalance")) {
			this.checkingBalance += amtDeposit;
		} else if (account.equals("savingsBalance")){
			this.savingsBalance += amtDeposit;
		}
		moneyStored += amtDeposit;
	}
	
	public void withdrawSavings(double amtWithdraw) {
		if (amtWithdraw > this.savingsBalance) {
			System.out.println("Insufficient Funds");
		} else {
			this.savingsBalance -= amtWithdraw;
		}
		moneyStored -= amtWithdraw;
	}
	
	public void accountBalances() {
		System.out.println("Total balance: " + (checkingBalance + savingsBalance));
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	public static void setNumberOfAccounts(int numberOfAccounts) {
		BankAccount.numberOfAccounts = numberOfAccounts;
	}
	
	public static double getMoneyStored() {
		return moneyStored;
	}
	
	public static void setMoneyStored(double moneyStored) {
		BankAccount.moneyStored = moneyStored;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
}
