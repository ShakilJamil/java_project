public class fixedDepositAcc extends savingsAcc
{
	fixedDepositAcc(String ownerofAcc, long noOfAcc)
	{
		super(ownerofAcc, noOfAcc);
		activeAcc = 0;
		++ activeAcc;	
	}
	//Depositing
	@Override
	public double deposit(double deposit)
	{
		balanceOfAcc += deposit;
                System.out.println("Deposited successfully");
		return balanceOfAcc;
	}
	//Withdrawing
    public double withdraw(long year, double withdraw)
    {
    	if((year >= 3) && (withdraw <= balanceOfAcc))
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
	@Override
	public double interest(double rate, long year)
	{
		return balanceOfAcc * rate * year;
	}
	//Update savingsAcc’s balance
	@Override
	public double updateBalance(double rate, long year)
	{
		balanceOfAcc += balanceOfAcc * rate * year;
		return balanceOfAcc;
	}
}
