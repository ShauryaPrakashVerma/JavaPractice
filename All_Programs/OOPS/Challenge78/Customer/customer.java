package Challenge78.Bank;

import Challenge78.Bank.BankAccount;

class customer{
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001","Shaurya Prakash");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-200);
        account.withdrawMoney(0);
    }
}