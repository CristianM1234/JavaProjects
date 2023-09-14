package savingsaccount;

public class SavingsAccount {
public String owner;
public int balanceDollar;
public double balanceEuro;

public SavingsAccount(String owner, int balanceDollar){
    owner = owner;
    balanceDollar = balanceDollar;
    balanceEuro = balanceDollar*0.85;
}
public void addMoney(int balanceDollar){
    System.out.println("Addimg " + balanceDollar + " dollars to the account.");
    this.balanceDollar += balanceDollar;
    System.out.print("he new balance is " + this.balanceDollar + " dollars.");
}
    public static void main(String[] args) {
        SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);
        zeusSavingsAccount.addMoney(2000);
    }
    
}
