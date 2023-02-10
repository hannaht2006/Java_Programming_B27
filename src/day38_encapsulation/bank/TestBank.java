package day38_encapsulation.bank;

public class TestBank {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123166544, 4562266);

       // account1.balance = 10000;
        //account1.setBalance(10000);
        // balance is private and there is no setter method, so i can't change the value

        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
    }
}
