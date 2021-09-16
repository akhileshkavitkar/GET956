import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class SavingsAccountTest {
	SavingsAccount savingsAccount;
	@BeforeEach
	void setUp() {
		System.out.println("beforeEach setUp invoked");
		savingsAccount = Bank.getObject();
	}

	@Test
	public void testWithdraw() {
	    System.out.println("Testing the withdraw() method");
	    System.out.println("Creating object...");
	    SavingsAccount savingsAccount = Bank.getObject();
	    System.out.println("Object created...");
	    Assertions.assertNotNull(savingsAccount);
	    double balanceBeforeDeposit = savingsAccount.getAccountBalance();
	    System.out.println("Invoking method");
	    double amountToBeDeposited = 3000;
	    savingsAccount.deposit(amountToBeDeposited);
	    Assertions.assertEquals(balanceBeforeDeposit+amountToBeDeposited,  savingsAccount.getAccountBalance());
	//  savingsAccount.withdraw(2000);
	    System.out.println("Method succeeded ..");
	}
	@Test
	public void testDeposit() {
		System.out.println("Testing the deposit() method");
		 System.out.println("Creating object...");
		    SavingsAccount savingsAccount = Bank.getObject();
		    System.out.println("Object created...");
		    Assertions.assertNotNull(savingsAccount);
		    double balanceBeforeDeposit = savingsAccount.getAccountBalance();
		    System.out.println("Invoking method");
		    double amountToBeDeposited = 3000;
		    savingsAccount.deposit(amountToBeDeposited);
		    Assertions.assertEquals(balanceBeforeDeposit+amountToBeDeposited,  savingsAccount.getAccountBalance());
		//  savingsAccount.withdraw(2000);
		    System.out.println("Method succeeded ..");
	}
	@SuppressWarnings("deprecation")
	@Test

	void test1() {

	        System.out.println("Testing the withdraw() method");

	        System.out.println("Creating object...");

	    String str="A"; // String str = something.getSomething();

	    byte array[] = str.getBytes(); // = {10,20,30};

	   

	    assertTrue(array.length>0);

	    System.out.println("running the for loop..");

	    for(int x : array ) {

	    System.out.println(x+" x "+(char)x);

	    }

	    System.out.println("for loop is over...");

	   

	    assertNotNull(savingsAccount);



	        System.out.println("Object created..."+savingsAccount.hashCode());



	        double balanceBeforeWithdraw = savingsAccount.getAccountBalance();

	        System.out.println("Invoking method");

	        double amountToBeWithdrawn = 3500;

	        Throwable throwable = assertThrows(RuntimeException.class, () -> 

	        savingsAccount.withdraw(amountToBeWithdrawn));



	       

	    assertNotEquals("Insufficient balance exception",throwable.getMessage());

	           

	    assertEquals(balanceBeforeWithdraw-amountToBeWithdrawn,  savingsAccount.getAccountBalance() );



	    //  savingsAccount.withdraw(2000);

	    assertTrue(savingsAccount.getAccountBalance() > 0 );

	        System.out.println("Withdraw Method succeeded .."+savingsAccount.getAccountBalance());

	        System.out.println("----------------------");

	}
}