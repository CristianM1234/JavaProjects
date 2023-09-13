package savingsaccount;

public class SavingsAccount {
int balance;
public SavingsAccount(int initialBalance){
    balance = initialBalance;
}
public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is " +balance);
}
public void deposit(int amountToDeposit){
    balance = amountToDeposit + balance;
    System.out.println("You just deposited " + amountToDeposit);
}
public int withdraw(int amountToWithDraw){
    balance = balance - amountToWithDraw;
    System.out.println("You just wthdrew " + amountToWithDraw);
    return amountToWithDraw;
}
public String toString(){
    return "This is a savings account with " + balance + " saved.";
}
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000);
        savings.checkBalance();
        savings.withdraw(300);
        savings.checkBalance();
        savings.deposit(600);
        savings.checkBalance();
        savings.deposit(600);
        savings.checkBalance();
        
        System.out.println(savings);
    }
    
}
