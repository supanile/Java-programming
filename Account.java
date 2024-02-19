public class Account
{
 private double balance; // instancevariablethat stores the balance
//constructor
public Account( double initialBalance )
{
 // validatethat initialBalance is greater than0.0;
 // if it is not, balance is initialized to the default value 0.0
 if ( initialBalance > 0.0)
 balance = initialBalance;
} // end Account constructor
//credit (add) anamount tothe account
public void credit( double amount )
{
	balance = balance + amount; // add amount to balance
} // end method credit
 // return the account balance
 public double getBalance()
 {
 return balance; // gives the value of balanceto the calling method
 public static void main( String args[] )
{
 Account account1 = new Account( 35.50 );
 System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
 } // end method getBalance
} // end class Account
