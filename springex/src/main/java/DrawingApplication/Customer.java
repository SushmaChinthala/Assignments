package DrawingApplication;

/**
 * TODO suschint This type ...
 *
 */
public class Customer {
  int customerId;

  /**
   * @param customerAddress new value of {@link #getcustomerAddress}.
   */

  String customerName;

  int customerContact;

  Address customerAddress;

  /**
   * @return customerAddress
   */
  public Address getCustomerAddress() {

    return this.customerAddress;
  }

  /**
   * @param customerAddress new value of {@link #getcustomerAddress}.
   */
  public void setCustomerAddress(Address customerAddress) {

    this.customerAddress = customerAddress;
  }

  /**
   * @return address1
   *
   *         /**
   * @return address2
   *
   *
   *         /**
   * @return customerId
   */
  public int getCustomerId() {

    return this.customerId;
  }

  /**
   * @param customerId new value of {@link #getcustomerId}.
   */
  public void setCustomerId(int customerId) {

    this.customerId = customerId;
  }

  /**
   * @return customerName
   */
  public String getCustomerName() {

    return this.customerName;
  }

  /**
   * @param customerName new value of {@link #getcustomerName}.
   */
  public void setCustomerName(String customerName) {

    this.customerName = customerName;
  }

  /**
   * @return customerContact
   */

  /**
   * @param customerContact new value of {@link #getcustomerContact}.
   */
  public void setCustomerContact(int customerContact) {

    this.customerContact = customerContact;
  }

  private int getCustomerContact() {

    // TODO Auto-generated method stub
    return this.customerContact;
  }

  /**
   * @return customerAddress
   *
   *
   *         /**
   * @param customerAddress new value of {@link #getcustomerAddress}.
   */

  public void displaycustomer() {

    System.out.print("Customer 1 :" + getCustomerId());
    System.out.print("\t" + getCustomerName());
    System.out.print("\t" + getCustomerContact());

    System.out.println("\t Address(" + getCustomerAddress().getCity() + "," + getCustomerAddress().getStreet() + ","
        + getCustomerAddress().getZip() + "," + getCustomerAddress().getState() + ","
        + getCustomerAddress().getCountry() + ")");
  }

  /**
   * @return customerAddress
   */

  @Override
  public String toString() {

    return "Customer [customerAddress=" + this.customerAddress + "]";
  }

  /**
   * @return
   */

  /**
   * @return
   */

  /**
   * @return customerAddress
   */

}
