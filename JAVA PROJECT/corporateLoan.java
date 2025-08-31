public class corporateLoan extends retailLoan
{
	private double balanceToPluck;
	corporateLoan(long noOfNID)
	{
		super(noOfNID);
	}
	@Override
	public void setBalanceToPluck(double balanceToPluck)
	{
		this.balanceToPluck = balanceToPluck;
	}
	@Override
	public double getBalanceToPluck()
	{
                System.out.println("Plucked successfully");
		return balanceToPluck;
	}
	@Override
	public double interest(double rate, long year)
	{
		return balanceToPluck * rate * year;
	}
	@Override
	public double balanceToPay(double rate, long year)
	{
		if(year > 1)
		{
			System.out.println("You have to pay rest of the balance among one month, otherwise your savings are to be aucted");	
			balanceToPluck += balanceToPluck * rate * year;
		}
		else
		{
			balanceToPluck += balanceToPluck * rate * year;
		}
		return balanceToPluck; 
	}
}
