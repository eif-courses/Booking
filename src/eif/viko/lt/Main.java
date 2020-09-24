package eif.viko.lt;

import eif.viko.lt.nuoma.Client;
import eif.viko.lt.nuoma.Database;

import javax.xml.crypto.Data;


public class Main {
  public static void main(String[] args) {


    Database database = Database.getInstance();

    Database database2 = Database.getInstance();


    Client ona = new Client();
    Client petras = new Client();

    System.out.println("Hash kodas ona : "+ona.hashCode());
    System.out.println("Hash kodas petras : "+petras.hashCode());

    System.err.println("Hash kodas db1 : "+database.hashCode());
    System.err.println("Hash kodas db2 : "+database2.hashCode());


























    // List intefeiso pavyzdys
    //    List<String> list = new ArrayList<String>();
//
//    ArrayList<String> arrayList = new ArrayList<String>();
//
//    List<String> vectorList = new Vector<String>();
//    Vector<String> vector = new Vector<String>();
//
//
//    list = vector;
//    list = arrayList;
//    list = vectorList;
//
//    arrayList = vectorList;
//    arrayList = vector;






  }
}
