package lab4;

public class Excercise1Main 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Exercise1Per p =new Exercise1Per("Smith",34);
		SavingsAccount acc=new SavingsAccount(2000, 1001);
		System.out.println("Name:"+p.getName());
		System.out.println("Age:"+p.getAge());
		System.out.println("Acc Number:"+acc.accNo);
		System.out.println("Original Account Balance:"+acc.balance);
		acc.deposit(2000);
		acc.withdraw(1400);
		System.out.println("Updated Acc Balance:"+acc.balance+"\n");
		
		
		Exercise1Per p1=new Exercise1Per("Kathy",54);
		CurrentAccount acc1=new CurrentAccount(3000, 2002);
		System.out.println("Name:"+p1.getName());
		System.out.println("Age:"+p1.getAge());
		System.out.println("Acc Number:"+acc1.accNo);
		System.out.println("Original Account Balance:"+acc1.balance);
		acc1.withdraw(2000);
		acc1.withdraw(25000);
		acc1.deposit(18000);
		System.out.println("Updated Acc Balance:"+acc1.balance);

	}

}
