public class BankProcessor {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(45361,"Surya");
        obj.setBalance(50000);
        obj.display();
        obj.deposit(2000);
        obj.withDraw(0);
    }
}
