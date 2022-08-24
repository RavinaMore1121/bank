package SimpleBankingApplication;
import java.util.*;
public class BankApp {
	public static void main(String[] args) {
		try {// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int ch;
			 Bank b=new Bank();
			 
			do {
				System.out.println("\n");
				System.out.println("************Banking System Application************");
				System.out.println("1)Create Account \n2)withdrawn Amount \n3)"
					+ "Deposit Amount \n4)Show Account \n5)Search Account \n6)Exit");
				System.out.println("-----------------------------------------------");//For Designing purpose
				System.out.println("Enter Your Choice:");
				ch = sc.nextInt();
				System.out.println("-----------------------------------------------");
				switch(ch)
				{
				case 1:
					sc.nextLine();//to shift the control on next line
					CustomerDetails cd=new CustomerDetails();
				    System.out.println("Enter Account Holder's  Details");
			    	System.out.println("Enter Account Holder Name: ");
			       	String customerName = sc.nextLine();
			        
			       	System.out.println("Enter Account Holder's ID: ");
			        int customerID = sc.nextInt();
			        
			        System.out.println("Enter Account No: ");
			        sc.nextLine();
			        String customerAccNo = sc.nextLine();  
			        
			        System.out.println("Enter Account type: ");  
			        String acc_type = sc.nextLine();
			        
			        System.out.println("Enter Opening Balance: ");
			        long amount = sc.nextLong(); 
			        if(amount<=2000)
			        {
			           System.out.println("Your first amount of deposit should be greater than 2000:");
			           //do {
			           System.out.println("Enter again amount which is greater than 2000");
			           amount=sc.nextLong();
			           System.out.println("your current balance in account is:"+amount);
			        }  
			        else{
			         System.out.println("This is the good Amount:");
			         int balance=0;
			         balance = (int) (balance + amount);  
			         System.out.println("your current balance in account is:" +balance);
			        }
	                cd.setCustomerName(customerName);
			        cd.setCustomerID(customerID);
			        cd.setAcc_type(acc_type);
			        cd.setCustomerAccNo(customerAccNo);
			        cd.setBalance(amount);
			        b.createAccount(cd);
			        System.out.println("------------------------------------------------");
			        break;
				case 2://withdraw amount by account no
					System.out.println("Enter Account no to withdraw money");
					sc.nextLine();
					String acc_no=sc.nextLine();
					System.out.println("Enter Amount to Withdraw:");
					int withdrawal = sc.nextInt();
					b.withdrawn(acc_no,withdrawal);
					System.out.println("-----------------------------------------------");
					break;
				case 3://Deposit amount by account no
					System.out.println("Enter Account no to deposit money");
					sc.nextLine();
					acc_no=sc.nextLine();
					System.out.println("Enter Amount to deposits:");
					int deposit1 = sc.nextInt();
					b.diposit(acc_no,deposit1);
					System.out.println("-----------------------------------------------");
					break;
				case 4: //shows details of all accounts
					b.showAccount();
					System.out.println("-----------------------------------------------");
					break;
				case 5:
					System.out.println("Enter Account no to display account details");
					sc.nextLine();
					acc_no=sc.nextLine();//same name string is created in case 2
					b.searchAccount(acc_no);
					System.out.println("------------------------------------------");
					break;
				case 6:
					System.out.println("Thank you for using our Services........");
					System.out.println("See you soon...");
					break;
				default:
					System.out.println("Wrong choice!!!!!!");
			 }
			}while(true);//infinite loop
		}
		catch(Exception e) {
			System.out.println(e);
		}	
		System.out.println("Operations are Done Successful......");
		System.out.println("See you soon...");
	}
}
