package Assignments;

/**
 * TODO suschint This type ...
 *
 */
public interface BankAccountRepository {
  public double getBalance(long accountId);

  public double updateBalance(long accountId, double newBalance);

}
