public class retailLoan
{
	protected long noOfNID;
	private double balanceToPluck;
	retailLoan(long noOfNID)
	{
		this.noOfNID = noOfNID;
	}
	public void setBalanceToPluck(double balanceToPluck)
	{
		this.balanceToPluck = balanceToPluck;
	}
	public double getBalanceToPluck()
	{
                System.out.println("Plucked successfully");
		return balanceToPluck;
	}
	public double interest(double rate, long year)
	{
		return balanceToPluck * rate * year;
	}
	public double balanceToPay(double rate, long year)
	{
		balanceToPluck += balanceToPluck * rate * year;
		return balanceToPluck; 
	}
}
