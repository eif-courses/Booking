package eif.viko.lt.nuoma;

public class Room {
  private int number;
  private int beds;
  private Status status;


  public Room(int number, int beds, Status status) {
    this.number = number;
    this.beds = beds;
    this.status = status;
  }
}
