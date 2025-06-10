package Challenge78.Bank;

class BankAccount{

    private String accountNumber;
    private String accoutnHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accoutnHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accoutnHolderName = accoutnHolderName;
    }

    

    public void depositMoney(double money){
        if(money<=0)
        {
            System.out.println("Invalid deposit");
        }
        else
        balance+=money;
    }

    public double withdrawMoney(double money){
        if (money<=0)
        {
            System.out.println("Invalid withdrawal");
        }
        else if (balance>=money)
        {
            balance-=money;
        }
        
        else{
            money=balance;
            balance=0;
        }
        return money;
    }
}
