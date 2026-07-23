import java.sql.SQLOutput;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    BankAccount(){
        System.out.println("Initialized constructors");
    }
    BankAccount(int num,String name){
        this.accountNumber = num;
        this.accountHolder = name;
    }

    // setters
    public void setBalance(double money){
        this.balance = money;
    }

    // getters
     public int getAccountNumber(){
        return this.accountNumber;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }
    public double getBalance(){
        return this.balance;
    }
    public void display(){
        System.out.println("Account Number:"+ this.accountHolder);
        System.out.println("Account Holder Name: "+this.accountHolder);
        System.out.println("Account Balance: $"+this.balance);
    }
    public void deposit(double amount){
        System.out.println();
        System.out.println("DEPOSITING");
        if(amount > 0){
            this.balance += amount;
            System.out.println("Amount Deposited Successfully: $"+amount);
            System.out.println("Balance: $"+this.balance);
        }else{
            System.out.println("Negative or Zero cannot be deposited");
        }
    }
    public void withDraw(double amount){
        System.out.println();
        System.out.println("WITHDRAWING");
        if(this.balance > amount){
            this.balance -= amount;
            System.out.println("WithDraw Successfull of Amount: "+amount);
            System.out.println("Balance: $"+this.balance);
        }
        else if(amount <= 0){
            System.out.println("Negative/zero amount cannot be withdrawn");
        }else{
            System.out.println("InSufficient Balance Does not WithDraw");
        }
    }
}
