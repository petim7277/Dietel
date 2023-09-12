package account;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    Scanner scanner = new Scanner(System.in);

    @Test
    public void testThatIHaveAccountThatCanDepositTest(){
//given I have an Account
 Account joyAccount=new Account();
 //when I deposit into my Account
 joyAccount.deposit(5000);
 //check that balance increases
 joyAccount.getBalance();
 System.out.printf("your current balance is :%d",joyAccount.getBalance());
 assertEquals(5000,joyAccount.getBalance());
    }
    @Test
     public void testThatAccountCanWithdrawTest(){
//given I have an account
    Account joyAccount=new Account();
 //when I deposit and withdraw
 joyAccount.deposit(10000);
 joyAccount.withdraw(2000);
 //check that balance decreases
  joyAccount.getBalance();
  System.out.printf("Your balance is:%d",joyAccount.getBalance());
  assertEquals(8000,joyAccount.getBalance());
    }

    @Test
      public void testIfUserCanDepositNegativeAmountsTest(){
//given I have an account
        Account joyAccount=new Account();
//when I deposit -5000
        joyAccount.deposit(-5000);
        joyAccount.deposit(20000);
//check that my balance is the same
         joyAccount.getBalance();
         System.out.printf("Your current balance is:%d",joyAccount.getBalance());
        assertEquals(20000,joyAccount.getBalance());
        }
    @Test
    public void testIfUserCanWithdrawNegativeNumbersTest(){
        //given I have an account
        Account joyAccount=new Account();
        //when I withdraw -5000
        joyAccount.withdraw(-5000);
        joyAccount.deposit(20000);
        // check that balance is the same
        joyAccount.getBalance();
        System.out.printf("your current balance is:%d",joyAccount.getBalance());
        assertEquals(20000,joyAccount.getBalance());
    }
    }
























