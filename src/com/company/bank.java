

class account
{
    int  balance=1000;
    public int balance()
    {
    return balance;

    }

    public int withdraw(int amount)
    {
        if (amount > balance)
        {
            throw new NotSufficientFundException(String.format("current balance is less than  required" +balance +amount));
        }
        balance = balance - amount;
        return balance;
    }

    public void deposit(int amount)
    {
        if (amount <= 0)
        {
            throw new IllegalArgumentException(String.format("invalid deposit amount %d", amount));

        }
    }
    class NotSufficientFundException extends RuntimeException
    {
        String message;
        public NotSufficientFundException(String message)
        {

            this.message=message;
        }

        public String getMessage()
        {


            return message;
        }
    }

}
 public class bank {
    public static void main(String[] args) {
        account a=new account();
        System.out.println("current balance: "+a.balance());
        System.out.println("withdrawing 200");
        a.withdraw(200);
        System.out.println("current balance is"+a.balance());
        a.withdraw(1000);
        a.deposit(-500);


    }
}
