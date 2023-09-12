package account;
public class Account{
  private  int balance;
   private String name;

    public void theName(String name){
        this.name=name;
    }
    public String myName(){
       return name;
    }
    public void deposit(int balance){
        this.balance=balance;
        if(balance>0){
            this.balance=balance;
        }
    }
    public int getBalance(){
        return balance;
    }

    public void withdraw(int withdraw) {
        this.balance =balance - withdraw;
        if(withdraw>0){
            this.balance=balance;
        }
    }
}