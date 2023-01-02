package MVCexample.todo;

import java.util.Date;
import java.util.Objects;

/**
 * TODO suschint This type ...
 *
 */
public class Todo {
  private int id;

  private String user;

  private String desc;

  private Date targetDate;

  private boolean isDone;

  /**
   * @return id
   */

  public int getId() {

    return this.id;
  }

  public Todo(int id, String user, String desc, Date targetDate, boolean isDone) {

    super();
    this.id = id;
    this.user = user;
    this.desc = desc;
    this.targetDate = targetDate;
    this.isDone = isDone;
  }

  /**
   * @param id new value of {@link #getid}.
   */
  public void setId(int id) {

    this.id = id;
  }

  /**
   * @return user
   */
  public String getUser() {

    return this.user;
  }

  /**
   * @param user new value of {@link #getuser}.
   */
  public void setUser(String user) {

    this.user = user;
  }

  /**
   * @return desc
   */
  public String getDesc() {

    return this.desc;
  }

  /**
   * @param desc new value of {@link #getdesc}.
   */
  public void setDesc(String desc) {

    this.desc = desc;
  }

  /**
   * @return targetDate
   */
  public Date getTargetDate() {

    return this.targetDate;
  }

  /**
   * @param targetDate new value of {@link #gettargetDate}.
   */
  public void setTargetDate(Date targetDate) {

    this.targetDate = targetDate;
  }

  /**
   * @return isDone
   */
  public boolean isDone() {

    return this.isDone;
  }

  /**
   * @param isDone new value of {@link #getisDone}.
   */
  public void setDone(boolean isDone) {

    this.isDone = isDone;
  }

  @Override
  public String toString() {

    return "Todo [id=" + this.id + ", user=" + this.user + ", desc=" + this.desc + ", targetDate=" + this.targetDate
        + ", isDone=" + this.isDone + "]";
  }

  @Override
  public int hashCode() {

    return Objects.hash(this.id);
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Todo other = (Todo) obj;
    return this.id == other.id;
  }

}
