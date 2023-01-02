package Assignments;

/**
 * TODO suschint This type ...
 *
 */
public class BankAccount {
  private long accountId;

  private String accountHolderName;

  private String accountType;

  private double accountBalance;

  public void BankAccount() {

  }

  /**
   * The constructor.
   *
   * @param accountId
   * @param accountHolderName
   * @param accountType
   * @param accountBalance
   */

  public BankAccount(long accountId, String accountHolderName, String accountType, double accountBalance) {

    this.accountId = accountId;
    this.accountHolderName = accountHolderName;
    this.accountType = accountType;
    this.accountBalance = accountBalance;
  }

  /**
   * @return accountId
   */
  public long getAccountId() {

    return this.accountId;
  }

  /**
   * @param accountId new value of {@link #getaccountId}.
   */
  public void setAccountId(long accountId) {

    this.accountId = accountId;
  }

  /**
   * @return accountHolderName
   */
  public String getAccountHolderName() {

    return this.accountHolderName;
  }

  /**
   * @param accountHolderName new value of {@link #getaccountHolderName}.
   */
  public void setAccountHolderName(String accountHolderName) {

    this.accountHolderName = accountHolderName;
  }

  /**
   * @return accountType
   */
  public String getAccountType() {

    return this.accountType;
  }

  /**
   * @param accountType new value of {@link #getaccountType}.
   */
  public void setAccountType(String accountType) {

    this.accountType = accountType;
  }

  /**
   * @return accountBalance
   */
  public double getAccountBalance() {

    return this.accountBalance;
  }

  /**
   * @param accountBalance new value of {@link #getaccountBalance}.
   */
  public void setAccountBalance(double accountBalance) {

    this.accountBalance = accountBalance;
  }

  @Override
  public String toString() {

    // TODO Auto-generated method stub
    return super.toString();
  }

}
