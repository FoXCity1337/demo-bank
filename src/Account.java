public class Account {
  private String name;
  private String address;
  private double balance;

  public void display(){
      System.out.println(name);
      System.out.println(address);
      System.out.println("Имеется на счету: " + balance);
  }
}
