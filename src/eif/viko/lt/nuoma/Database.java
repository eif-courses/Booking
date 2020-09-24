package eif.viko.lt.nuoma;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Database {

  List<Payment> payments = new ArrayList<>();
  List<Reservation> reservations = new ArrayList<>();
  List<Room> rooms = new ArrayList<>();
  private static final Database database = new Database();

  /* A private Constructor prevents any other
   * class from instantiating.
   */
  private Database() {
    rooms.add(new Room(101, 4, Status.AVAILABLE));
  }

  /* Static 'instance' method */
  public static Database getInstance( ) {
    return database;
  }




  // BOOKING
  public void bookRoom(Reservation reservation){
    reservations.add(reservation);
  }

  public List<Reservation> getReservations() {
    return reservations;
  }

  // PAYMENT

  public void addPayment(Payment payment){
    payments.add(payment);
  }

  public List<Payment> getPayments() {
    return payments;
  }
}
