package Assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO suschint This type ...
 *
 */
public class TestB {

  private static ApplicationContext context;

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("Bank.xml");
    BankAccountController controller = (BankAccountController) context.getBean("controller");
    System.out.println(controller.getBalance(15));
    System.out.println(controller.deposit(15, 5000));
    System.out.println("+++++++++++++++++++++++++++");
    System.out.println(controller.withdraw(15, 5000));
    System.out.println(controller.getBalance(15));
    System.out.println("___________________________________________");
    System.out.println(controller.fundTransfer(15, 16, 5000));
    System.out.println(controller.getBalance(15));
    System.out.println(controller.getBalance(16));
  }

}
