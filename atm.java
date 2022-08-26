import java.util.Scanner;
public class atm
{
    public static void main(String args[] )
      { 
        int balance = 5000;
	int withdraw = 0;
	int deposit =0;
        Scanner S1 = new Scanner(System.in);
        while(true)
          {
            System.out.println("Automated Teller Machine");
            System.out.println("Press 1 for Withdraw");
            System.out.println("Press 2 for Deposit");
            System.out.println("Press 3 for Check Balance");
            System.out.println("Press 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = S1.nextInt();
            switch(n)
             {
                case 1:
                System.out.print("Enter Amount to be withdrawn:");
                withdraw = S1.nextInt();
		System.out.println("Please Wait Your Transaction in Process");
                if(balance >= withdraw)
                  {
                    balance = balance - withdraw;
                    System.out.println("Please collect your Money");
                  }
                else
                  {
                    System.out.println("Insufficient Balance");
                  }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter Amount to be deposited:");
                deposit = S1.nextInt();
                balance = balance + deposit;
                System.out.println("Money has been successfully deposited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
             }
          }
      }
}