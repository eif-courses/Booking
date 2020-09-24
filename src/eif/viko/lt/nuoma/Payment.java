package eif.viko.lt.nuoma;

import java.util.Date;
import java.util.Random;

public class Payment {
  private long id;
  private double amount;
  private Date date;
  private Status status;

  public Payment(long id, double amount, Date date, Status status) {
    this.id = new Random().nextLong() + (long)amount;
    this.amount = amount;
    this.date = date;
    this.status = status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public long getId() {
    return id;
  }

  public double getAmount() {
    return amount;
  }

  public Date getDate() {
    return date;
  }

  public Status getStatus() {
    return status;
  }

  @Override
  public String toString() {
    return "Payment{" +
        "id=" + id +
        ", amount=" + amount +
        ", date=" + date +
        ", status=" + status +
        '}';
  }
}
