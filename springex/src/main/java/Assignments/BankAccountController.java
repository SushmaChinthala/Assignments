package Assignments;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * TODO suschint This type ...
 *
 */

public class BankAccountController implements ApplicationContextAware {
  private ApplicationContext context;

  public double withdraw(long accountId, double balanceToBeWithdraw) {

    double newBalance = 0;
    BankAccountRepositaryImpl acc = (BankAccountRepositaryImpl) this.context.getBean("BankRepo");
    if (acc.getBalance(accountId) >= balanceToBeWithdraw)
      newBalance = acc.getBalance(accountId) - balanceToBeWithdraw;
    acc.updateBalance(accountId, newBalance);
    return newBalance;
  }

  public double deposit(long accountId, double balance) {

    BankAccountRepositaryImpl acc = (BankAccountRepositaryImpl) this.context.getBean("BankRepo");
    double Newbalance = acc.getBalance(accountId) + balance;
    return acc.updateBalance(accountId, Newbalance);

  }

  public double getBalance(long accountId) {

    BankAccountRepositaryImpl balance = (BankAccountRepositaryImpl) this.context.getBean("BankRepo");
    return balance.getBalance(accountId);

  }

  public boolean fundTransfer(long fromAccount, long toAccount, double amont) {

    BankAccountRepositaryImpl accountepository = (BankAccountRepositaryImpl) this.context.getBean("BankRepo");
    if (accountepository.getBalance(fromAccount) >= amont) {
      double updatedAmt = amont + accountepository.getBalance(toAccount);

      // updating both the accounts
      accountepository.updateBalance(fromAccount, accountepository.getBalance(fromAccount) - amont);
      accountepository.updateBalance(toAccount, updatedAmt);
      return true;
    }
    return false;
  }

  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    this.context = applicationContext;
  }

  @Override
  public String toString() {

    // TODO Auto-generated method stub
    return super.toString();
  }

}
