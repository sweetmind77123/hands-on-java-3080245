package bank;

public class Customer {
  
  private int ID;
  private String name;
  private String username;
  private String password;
  private int accountId;


  public Customer(int ID, String name, String username, String password, int accountId){

    setID(ID);
    setName(name);
    setUsername(username);
    setPassword(password);
    setAccountId(accountId);
  }
  
  public int getID() {
    return ID;
  }
  public void setID(int iD) {
    ID = iD;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public int getAccountId() {
    return accountId;
  }
  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  
}
