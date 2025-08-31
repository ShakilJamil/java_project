public class checkingsAcc extends savingsAcc
{
    checkingsAcc(String ownerofAcc, long noOfAcc)
    {
    	super(ownerofAcc, noOfAcc);
    	activeAcc = 0;
    	++ activeAcc;
    }
    //Deposit and withdrawing
    @Override
    public double deposit(double deposit)
    {
    	balanceOfAcc += deposit;
        System.out.println("Deposited successfully");
    	return balanceOfAcc;
    }
    @Override
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
  //Transformation from savingsAcc to checkingsAcc
  	public double transfer(long noOfAcc, double transfer)
  	{
  		if(balanceOfAcc == 0.0)
  		{
  			if(transfer >= 10.0)
  			{
  				balanceOfAcc += transfer;
                                System.out.println("Transfered successfully");
  			}
  		}
  		else
  		{
  			System.out.println("Access denied");
  		}
  		return balanceOfAcc;
  	}
}
