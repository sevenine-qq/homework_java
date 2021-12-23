package homework_11;

public class homework11_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account.setAnnualInterestRate(5.5);
		Account account=new Account("Aeorge",1122,1000);
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		System.out.println("账户姓名："+account.getName());
		System.out.println("年利率："+Account.getAnnualIntereatRate());
		System.out.println("余额："+account.getBalance());
		java.util.ArrayList<Transaction> list=account.getTransaction();
		System.out.printf("%-35s%-14s%-14s%-15s\n","交易时间","交易类型",
				"交易金额","账户余额");
		for(int i=0;i<list.size();i++) {
			Transaction transaction=(Transaction)(list.get(i));
			System.out.printf("%-35s%-14s%-16s%-15s\n",transaction.getDate(),
					transaction.getType(),transaction.getAmount(),
					transaction.getBalance());
		}

	}

}
class Account{
	private int id;
	private String name;
	private double balance;
	private static double annualInterestRate;
	private java.util.Date dateCreated;
	private java.util.ArrayList<Transaction> transactions=new java.util.ArrayList<>();
	public Account() {
		dateCreated=new java.util.Date();
	}
	public Account(String name,int id,double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
		dateCreated=new java.util.Date();
	}
	public int getId() {
		return this.id;
	}
	public double getBalance() {
		return balance;
	}
	public java.util.ArrayList<Transaction> getTransaction(){
		return transactions;
	}
	public String getName() {
		return name;
	}
	public static double getAnnualIntereatRate() {
		return annualInterestRate;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate=annualInterestRate;
	}
	public double getMonthlyInterest() {
		return balance*(annualInterestRate/1200);
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	public void withdraw(double amount) {
		balance-=amount;
		transactions.add(new Transaction("取款",amount,balance,""));
	}
	public void deposit(double amount) {
		balance+=amount;
		transactions.add(new Transaction("存款",amount,balance,""));
	}
}

class Transaction{
	private java.util.Date date;
	private String type;
	private double amount;
	private double balance;
	private String description;
	public Transaction(String type,double amount,
			double balance,String description) {
		date=new java.util.Date();
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
	}
	public java.util.Date getDate(){
		return date;
	}
	public String getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public String getDescription() {
		return description;
	}
}

