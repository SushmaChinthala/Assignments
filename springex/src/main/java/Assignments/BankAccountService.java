package Assignments;

/**
 * TODO suschint This type ...
 *
 */
public interface BankAccountService {
  public double withdraw(long accountId, double balance);

  public double deposit(long accountId, double balance);

  public double getBalance(long accountId);

  // public boolean fundTransfer(long fromAccount, long toAccount, double amount);
}