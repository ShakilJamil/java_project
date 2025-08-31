public class savingsAcc
{
	protected String ownerofAcc;
    protected long noOfAcc;
    protected double balanceOfAcc = 100.0;
    public static int activeAcc = 0;
	savingsAcc(String ownerofAcc, long noOfAcc)
	{
		this.ownerofAcc = ownerofAcc;
    	        this.noOfAcc = noOfAcc;
		++ activeAcc;
	}
	public double deposit(double deposit)
    {
		balanceOfAcc += deposit;
                System.out.println("Deposited successfully");
    	return balanceOfAcc;
    }
	//Deposit and withdrawing
    public double withdraw(double withdraw)
    {
    	if(balanceOfAcc >= withdraw)
    	{
    		balanceOfAcc -= withdraw;
                System.out.println("Withdrawed successfully");
    	}
    	else
    	{
    		System.out.println("Access denied");
    	}
    	return balanceOfAcc;
    }
	//Counting interest
	public double interest(double rate, long year)
	{
		return balanceOfAcc * rate * year;
	}
     //Update savingsAcc’s balance
	public double updateBalance(double rate, long year)
	{
		balanceOfAcc += balanceOfAcc * rate * year;
		return balanceOfAcc;
	}
}
