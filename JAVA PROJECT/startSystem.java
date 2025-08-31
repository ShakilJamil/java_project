import java.util.Scanner;
import java.util.InputMismatchException;
public class startSystem
{
	public static void main(String[] args) 
	{
		System.out.println("___Welcome to the system of Mates Group of Bank ltd___");
		Scanner cn = new Scanner(System.in);
		try
		{
			System.out.println("Choice -> (0 -> Terminated 1 -> Savings 2-> Checkings 3 -> Fixed Deposit 5 - > Retail Loan 7 -> Corporate Loan 9 -> Information");
			int oice;
			do
			{
				System.out.print("Enter your Choice: ");
				oice = cn.nextInt();
				if(oice == 0)
				{
					System.out.println("Operation terminated");
				}
				else if(oice == 1)
				{
					System.out.println("...Savings...");
					System.out.println("Enter the Owner of account and Account no.: ");
					Scanner scan = new Scanner(System.in);
					savingsAcc sa = new savingsAcc(scan.nextLine(), scan.nextLong());
					System.out.print("Enter the Deposited balance: ");
					System.out.println("After depositing, the Balance: " + sa.deposit(scan.nextDouble()) + "$");
					System.out.print("Enter the Withdrawed balance: ");
					System.out.println("After withdrawing, the Balance: " + sa.withdraw(scan.nextDouble()) + "$");
					System.out.println("(year >= 1) && (year <= 3) -> (rate -> 7.0 %), else -> 9.0 %");
					System.out.println("Enter the Rate and Year: ");
					System.out.println("Consumed Interest: " + sa.interest(scan.nextDouble(), scan.nextLong()) + "$");
					System.out.println("Enter the Rate and Year: ");
					System.out.println("After consuming interest the Balance: " + sa.updateBalance(scan.nextDouble(), scan.nextLong()) + "$");
				}
				else if(oice == 2)
				{
					System.out.println("...Checkings...");
					System.out.println("Enter the Owner of account and Account no.: ");
					Scanner scn = new Scanner(System.in);
					checkingsAcc ca = new checkingsAcc(scn.nextLine(), scn.nextLong());
					System.out.print("Enter the Deposited balance: ");
					System.out.println("After depositing, the balance: " + ca.deposit(scn.nextDouble()) + "$");
					System.out.print("Enter the Withdrawed balance: ");
					System.out.println("After withdrawing, the Balance: " + ca.withdraw(scn.nextDouble()) + "$");
					System.out.println("Enter the Account no. and Transfered balance: ");
					System.out.println("After transfering, the Balance: " + ca.transfer(scn.nextLong(), scn.nextDouble()) + "$");
				}
				else if(oice == 3)
				{
					System.out.println("...Fixed Deposit...");
					System.out.println("Enter the Owner of account and Account no.: ");
					Scanner sc = new Scanner(System.in);
					fixedDepositAcc fda = new fixedDepositAcc(sc.nextLine(), sc.nextLong());
					System.out.print("Enter the Deposited balance: ");
					System.out.println("After depositing, the Balance: " + fda.deposit(sc.nextDouble()) + "$");
					System.out.println("Enter the Year and Withdrawed Balance: ");
					System.out.println("After withdrawing, the Balance: " + fda.withdraw(sc.nextLong(), sc.nextDouble()) + "$");
					System.out.println("(year >= 1) && (year <= 3) -> (rate -> 7.0 %), else -> 9.0 %");
					System.out.println("Enter the Rate and Year: ");
					System.out.println("Consumed Interest: " + fda.interest(sc.nextDouble(), sc.nextLong()) + "$");
					System.out.println("Enter the Rate and Year: ");
					System.out.println("After consuming interest the Balance: " + fda.updateBalance(sc.nextDouble(), sc.nextLong()) + "$");
				}
				else if(oice == 5)
				{
					System.out.println("...Retail Loan...");
					System.out.print("Enter ID no.: ");
					retailLoan rl = new retailLoan(cn.nextLong());
					System.out.print("Enter the Balance to pluck: ");
					rl.setBalanceToPluck(cn.nextDouble());
                                        rl.getBalanceToPluck();
					System.out.println("(year >= 1) && (year <= 3) -> (rate -> 7.0 %), else -> 9.0 %");
					System.out.println("Enter the Rate and Year: ");
					System.out.println("Consumed Interest: " + rl.interest(cn.nextDouble(), cn.nextLong()));
					System.out.println("Enter the Rate and Year: ");
					System.out.println("Paying balance: " + rl.balanceToPay(cn.nextDouble(), cn.nextLong()));
				}
				else if(oice == 7)
				{
					System.out.println("...Corporate Loan...");
					System.out.print("Enter the ID no.: ");
					corporateLoan cl = new corporateLoan(cn.nextLong());
					System.out.print("Enter the Balance to pluck: ");
					cl.setBalanceToPluck(cn.nextDouble());
                                        cl.getBalanceToPluck();
					System.out.println("(year >= 1) && (year <= 3) -> (rate -> 7.0 %), else -> 9.0 %");
					System.out.println("Enter the Rate and Year: ");
					System.out.println("Consumed Interest: " + cl.interest(cn.nextDouble(), cn.nextLong()));
					System.out.println("Enter the Rate and Year: ");
					System.out.println("Paying balance: " + cl.balanceToPay(cn.nextDouble(), cn.nextLong()));
				}
				else if(oice == 9)
				{
					System.out.println("...Information...");
					//Determining the account with a particular account number
					System.out.println("noOfAcc - (1 -> Checkings 2 - > Savings 3 -> Fixed Deposit)");
					System.out.print("Enter the No. of account: ");
					long noOfAcc = cn.nextInt();
					if(noOfAcc == 10)
					{
						System.out.println("Account type: Savings");
						System.out.println("Owner of the account: Tanjib Mahammad");
						System.out.println("Balance of the account: 10.0 $");
					}
					else if(noOfAcc == 100)
					{
						System.out.println("Account type: Checkings");
						System.out.println("Owner of the account: Tanjib Mahammad");
						System.out.println("Balance of the account: 100.0 $");
					}
					else if(noOfAcc == 1000)
					{
						System.out.println("Account type: Fixed Deposit");
						System.out.println("Owner of the account: Tanjib Mahammad");
						System.out.println("Balance of the account: 100.0 $");
			    	}
					else
					{  
						System.out.println("Hidden");
					}		
					//Determining the number of currently active account
					System.out.println("Active account: " + (checkingsAcc.activeAcc + savingsAcc.activeAcc + fixedDepositAcc.activeAcc));
				}
				else
				{
					System.out.println("Access denied");
				}
			}
			while(oice != 0);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Access denied: " + ime);
		}
		finally
		{
			System.out.println("Thanks for using our system");
		}
	}
}
