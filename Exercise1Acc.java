package lab4;

class Exercise1Acc
{
	protected long accNo;
	protected double balance;
}
	
class SavingsAccount extends Exercise1Acc
{		
	public SavingsAccount(double balance, long accNo)
	{
		if (balance > 100.0)
		{
			 this.balance = balance; 
			 this.accNo=accNo;
		}
		
	}
		
	public void deposit(double deposit)
	{
		if (deposit > 100.0) 
		{
	          balance+=deposit; 
		}
	    else
	    {
	    	   System.out.println("Please deposit money greater than 100");
	    }
	}
		
	public void withdraw(double withdraw)
	{
		balance-=withdraw;
			   
		if(balance<500)
		{
			   balance+=withdraw;
			   System.out.println("\nCannot withdraw money: "+balance);
		}
		else
		{
				System.out.printf("\n%f Debited successfully from account%n%n",withdraw);
		}
	}
		
	}


	  class CurrentAccount extends Exercise1Acc
	  {
	  
		  public CurrentAccount(double balance, long accNo) 
		  { 
			  if (balance > 100.0)
			  {
				  this.balance = balance; 
				  this.accNo=accNo; 
			  } 
		  }
	  
		  public void deposit(double deposit)
		  {
			  if (deposit > 100.0)
			  {
		          balance+=deposit; 
			  }
			  else
			  {
		    	   System.out.println("Please deposit money greater than 100");
			  }
		  }
	  
		  public void withdraw(double withdraw) 
		  { 
			  balance-=withdraw;
			  System.out.printf("\n%f Debited successfully from account%n%n",withdraw); 
		  }
	  }

	
