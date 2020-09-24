package eif.viko.lt.nuoma;

public class Manager extends Person{






  public Manager(int id, int age, String name) {
    super(id, age, name);
  }

  public double salary() {
    int coef = 8;
    return coef * 120;
  }
}
