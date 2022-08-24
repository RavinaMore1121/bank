package SimpleBankingApplication;
import java.util.HashSet;
import java.util.Iterator;
public class Bank {
	CustomerDetails cd;//reference of the pojo class containing all variables
	HashSet<CustomerDetails> hs=new HashSet<CustomerDetails>();     
	//hashset  (set collection ) do not allow the duplicate data
	//thats why it will be perfect to store the unique data for bank
	public void createAccount(CustomerDetails cd)
	{
		hs.add(cd);
	}
	
	public void showAccount()//to print all data present in HashSet
	{
		Iterator<CustomerDetails> i=hs.iterator();//fetching data from set collection using iterator
		while(i.hasNext())
		{
			Object obj=i.next();
			cd=(CustomerDetails)obj;
		System.out.println(cd.getCustomerName()+"\t"+cd.getCustomerID()+"\t"+cd.getCustomerAccNo()+"\t"+
		             	 cd.getAcc_type()+"\t"+cd.getBalance());
		}
	}
	public void searchAccount(String acc_no)//parameterized method...
        {          
		Iterator<CustomerDetails> i=hs.iterator();//fetching data from vector using iterator
		boolean a = false;
		while(i.hasNext())
		{
			Object obj=i.next();
			cd=(CustomerDetails)obj;
			if(cd.getCustomerAccNo().equals(acc_no)) 
			{
		System.out.println(cd.getCustomerName()+"\t"+cd.getCustomerID()+"\t"+cd.getCustomerAccNo()+"\t"+
				 cd.getAcc_type()+"\t"+cd.getBalance());
		     a=true;
		}
		}	
			if(a)
			{
				System.out.println("Account exists.........");
			}
			else 
			{
				System.out.println("Account does not exists......");
			}
	}
	public void withdrawn(String acc_no,int withdrawal)
	{
	
		Iterator<CustomerDetails> i=hs.iterator();//fetching data from vector using iterator
		while(i.hasNext())
		{
			Object obj=i.next();
			cd=(CustomerDetails)obj;
			if(cd.getCustomerAccNo().equals(acc_no)) {
		          if(cd.getBalance()>=withdrawal)
		        	  
		             {    
		        	  System.out.println("amount withdrawn successfully......");
		        	  long updatedBalance = cd.getBalance()-withdrawal;
		        	  cd.setBalance(updatedBalance);
		        	  System.out.println("Remaining balance is:"+cd.getBalance());
		        	  }
		          else if((cd.getBalance()<=withdrawal)) {
		        	  System.out.println(cd.getCustomerName()+" You can not withdraw "+withdrawal);
		  			System.out.println(" Your balance is: "+cd.getBalance());
		          }
		          
		
			      else {
				    System.out.println("Account not found");
			           }
			}
		}
		}
		public void diposit(String acc_no,int deposit1)
		{
	
			Iterator<CustomerDetails> i=hs.iterator();//fetching data from hashset using iterator
			while(i.hasNext())
			{
				Object obj=i.next();
				cd=(CustomerDetails)obj;
				if(cd.getCustomerAccNo().equals(acc_no))
				{		          
			        	  System.out.println("Amount Deposited Successfully......");
	                       long updatedBalance = cd.getBalance()+deposit1;		        	  
			        	  cd.setBalance(updatedBalance);
			        	  System.out.println("Your current Balance : " +cd.getBalance());
			    }
			          
		     	
				else {
					System.out.println("Account not found");
				}
			}	
		}

}
