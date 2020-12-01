package day35_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        account1.setInfo("Almira H","123456789");

        account1.getInfo();

        account1.deposit(100); //available: 100

        account1.showBalance();

        account1.withdraw(80); // 20

        account1.showBalance();

        account1.withdraw(20);

        account1.showBalance();

        account1.deposit(10000);

        account1.showBalance();



        BankAccount account2 = new BankAccount();

        account2.setInfo("Rinat","987654321");

        account2.deposit(200);

        account2.showBalance();
    }
}
