public class Account {
  private String name;
  private String address;
  private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display(){
      System.out.println(name);
      System.out.println(address);
      System.out.println("Имеется на счету: " + balance);

  }

  public double getInterest (double percentageRate){
        return balance * percentageRate / 100.00;
  }
}
