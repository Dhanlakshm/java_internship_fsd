package Opps;

public class Main1 {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.setPin(1111);
        b.deposite(1111, 5635.00);
        b.checkBalance(1111);
        b.withdrawal(1111, 635.00);
        b.checkBalance(1111);
    }
}
