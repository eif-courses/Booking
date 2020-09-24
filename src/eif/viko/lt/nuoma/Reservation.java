package eif.viko.lt.nuoma;

import javax.xml.crypto.Data;
import java.util.Date;

public class Reservation {

  private Database database;
  private Date dateFrom;
  private Date dateTo;
  private Client client;
  private Room room;

  public Reservation(Date dateFrom, Date dateTo, Client client, Room room) {
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.client = client;
    this.room = room;
    database = Database.getInstance();
    database.bookRoom(new Reservation(dateFrom, dateTo, client, room));
  }


  public Date getDateFrom() {
    return dateFrom;
  }

  public Date getDateTo() {
    return dateTo;
  }

  public Client getClient() {
    return client;
  }

  public Room getRoom() {
    return room;
  }
}
