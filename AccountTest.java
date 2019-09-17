import java.util.Scanner;
public class AccountTest{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Account IsaacAccount = new Account();
	System.out.print("Enter your Bvn Number:");
	double bvn = input.nextDouble();	
	IsaacAccount.setBvn(bvn);
	IsaacAccount.getBvn();
	System.out.printf("Your Bvn Number is: %f%n", IsaacAccount.getBvn());
	System.out.println();

	//set and get name

	System.out.println("Enter name:");
	String name = input.next();
	IsaacAccount.setName(name);
	System.out.printf("Your Name is: %s%n", IsaacAccount.getName ());

	//set and get accountType
	System.out.println("Enter your AccountType:");
	String accountType = input.next();
	IsaacAccount.setAccountType(accountType);
	System.out.printf("Your Account Type is: %s", IsaacAccount.getAccountType());

	//set and get balance
	System.out.println("Enter your account number");
	double balance = input.nextdouble;
	IsaacAccount.setbalance(balance);
	System.out.printf("Your balance is: %s", IsaacAccount.getbalance);

	}

}